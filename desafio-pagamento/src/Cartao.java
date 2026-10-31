public class Cartao extends Pagamento{

    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTotal() {
        return valor + (0.08*valor);
    }

    

}
