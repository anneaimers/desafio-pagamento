import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pagamento> teste = new ArrayList<>();
        teste.add(new Pix(200));
        teste.add(new Cartao(200));
        teste.add(new Boleto(200));

        System.out.println(teste.get(0).calcularTotal());
        System.out.println(teste.get(1).calcularTotal());
        System.out.println(teste.get(2).calcularTotal());

        
        double soma = 0;
        for (Pagamento pagamento : teste) {
             soma = soma + pagamento.calcularTotal();
        }
        

        System.out.println(soma);


    }
}
