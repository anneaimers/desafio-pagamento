public class Pix extends Pagamento{

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTotal() {
        return valor - (0.05*valor);
    }

    



    
}
