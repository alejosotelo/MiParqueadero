package miparqueadero;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class miparqueadero {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parqueadero miparqueadero=new Parqueadero();
        Vehiculo miVehiculo=new Vehiculo();
        System.out.println(" MI PARQUEADERO");
        
    
        System.out.println(" Seleccione: ");
        System.out.println(" 1. Ingresar Vehiculo");
        System.out.println(" 2. Retirar Vehiculo");
        System.out.println(" 3. Consultar Cupo");
        
        Scanner miScann=new Scanner(System.in);
        switch (miScann.nextInt()) {     
            case 1:
                System.out.println("Digite la placa del vehiculo");
                miVehiculo.setPlaca(miScann.nextString));
                System.out.println("Digite el nombre del propietario");
                miVehiculo.setPropietario(miScann.nextString);
                System.out.println("Digite cilindraje");
                miVehiculo.setCilindraje(miScann.nextfloat);
                System.out.println("Hora de entrada");
                miVehiculo.setHoraEntrada(miScann.nextDouble);
                System.out.println("Guardado");
            case 2:
                System.out.println("digite hora de entrada del  vehiculo");
                miVehiculo.setHoraEntrada(miScann.nextDouble());
                System.out.println("Idigite hora de salida");
                miVehiculo.setHoraSalida(miScann.nextDouble());
                
                miVehiculo.retirarVehiculo();
                System.out.println(miVehiculo.getvp());
            case 3:
                
         
        // TODO code application logic here
    }
    
}