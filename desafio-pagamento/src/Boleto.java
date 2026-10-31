public class Boleto extends Pagamento{

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularTotal() {
        return valor - 10;
    }

    

}
