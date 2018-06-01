package miparqueadero;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Miparqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero correspondiente");
        System.out.println("1.-para ingresar Vehiculo  2.-para Retirar Vehiculo  3.-para Consultar cupos ");
        System.out.print("Elija la opcion:");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado Ingresar Vehicyulo");

                String placa;
                String propietario;
                float cilindraje;
                System.out.printf("Hora de ingreso");
                break;

            case 2:
                System.out.println("Retirar");
                break;
            case 3:
                System.out.println("Consultar");
                break;

        }

    }
}