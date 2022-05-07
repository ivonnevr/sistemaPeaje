package objects;

import java.util.ArrayList;

/**
 *
 * @author Ivonne
 */
public class estacionPeaje {
    private String nombre;
    private String departamento;
    private int peajeRecolectado;
    private int totalVehiculos;

    public estacionPeaje() {
    
    }
    
    public estacionPeaje(String nombre, String departamento, int peajeRecolectado, int totalVehiculos) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.peajeRecolectado = peajeRecolectado;
        this.totalVehiculos = totalVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getPeajeRecolectado() {
        return peajeRecolectado;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setPeajeRecolectado(int peajeRecolectado) {
        this.peajeRecolectado = peajeRecolectado;
    }
    
    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }
    
    public void listaVehiculos(ArrayList<Vehiculo> vehiculo) {
        for(int i=0; i<vehiculo.size(); i++) {
            System.out.println("Placas: " + vehiculo.get(i).getPlaca());
            System.out.println("Monto pagado: $" + vehiculo.get(i).getPago());
            System.out.println();
        }
    }
}
