package objects;

/**
 *
 * @author Ivonne
 */
public class Vehiculo {
    private String placa;
    private int pago;

    public Vehiculo(String placa, int pago) {
        this.placa = placa;
        this.pago = pago;
    }

    public String getPlaca() {
        return placa;
    }
    
    public int getPago() {
        return pago;
    }
}
