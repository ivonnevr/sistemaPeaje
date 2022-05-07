package objects;

/**
 *
 * @author Ivonne
 */
public class Camion extends Vehiculo{
    private int ejes;
    
    public Camion(String placa, int pago, int ejes) {
        super(placa, pago);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }
}
