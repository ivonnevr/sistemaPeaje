package sistemapeaje;

import java.util.ArrayList;
import java.util.Scanner;
import objects.Vehiculo;
import objects.estacionPeaje;
import objects.Camion;

/**
 *
 * @author Ivonne
 */
public class SistemaPeaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, totalRecolectado = 0, contVehiculos = 0, ejes = 0;
        String nombreEstacion, departamentoEstacion, placas;
        estacionPeaje estacion = new estacionPeaje();
        ArrayList<Vehiculo> vehiculo = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nombre de la estación: ");
        nombreEstacion = scanner.nextLine();
        estacion.setNombre(nombreEstacion);
        System.out.print("Departamento de la estación: ");
        departamentoEstacion = scanner.nextLine();
        estacion.setDepartamento(departamentoEstacion);
        System.out.println();
        
        do {
            System.out.println("- SISTEMA DE PEAJE -");
            System.out.println("- ESTACIÓN: " + estacion.getNombre() + " -");
            System.out.println("- DEPARTAMENTO: " + estacion.getDepartamento() + " -\n");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            System.out.println("4. Listado de vehículos");
            System.out.println("5. Finalizar\n");
            System.out.print("Seleccione una opción: ");
            op = scanner.nextInt();
            System.out.println();
            switch(op) {
                case 1:
                    System.out.println("- CARRO -\n");
                    scanner.nextLine();
                    System.out.print("Placas del carro: ");
                    placas = scanner.nextLine();
                    Vehiculo carro = new Vehiculo(placas, 100);
                    totalRecolectado += carro.getPago();
                    System.out.println("Cobro de peaje: $100");
                    contVehiculos++;
                    vehiculo.add(carro);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("- MOTO -\n");
                    scanner.nextLine();
                    System.out.print("Placas de la moto: ");
                    placas = scanner.nextLine();
                    Vehiculo moto = new Vehiculo(placas, 50);
                    totalRecolectado += moto.getPago();
                    System.out.println("Cobro de peaje: $50");
                    contVehiculos++;
                    vehiculo.add(moto);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("- CAMIÓN -\n");
                    scanner.nextLine();
                    System.out.print("Placas del camión: ");
                    placas = scanner.nextLine();
                    System.out.print("Número de ejes: ");
                    ejes = scanner.nextInt();
                    Camion camion = new Camion(placas, 80, ejes);
                    totalRecolectado += (camion.getPago()*camion.getEjes());
                    System.out.println("Cobro de peaje: $" + (camion.getPago()*camion.getEjes()));
                    contVehiculos++;
                    Vehiculo camionArr = new Vehiculo(placas, ejes*80);
                    vehiculo.add(camionArr);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("- LISTADO DE VEHÍCULOS -\n");
                    estacion.setPeajeRecolectado(totalRecolectado);
                    System.out.print("Total de dinero acumulado: $" + estacion.getPeajeRecolectado() + "\n");
                    estacion.setTotalVehiculos(contVehiculos);
                    System.out.println("Vehiculos atendidos: " + estacion.getTotalVehiculos() + "\n");
                    System.out.println("Lista de vehículos atendidos\n");
                    estacion.listaVehiculos(vehiculo);
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opción válida\n");
                    break;
            }
        }while(op != 5);
    }
    
}
