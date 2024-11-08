

/**
 *
 * @author kvall
 */
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Digite la edad del empleado: ");
            int edad = scanner.nextInt();

            System.out.print("Digite el sueldo del empleado: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  

            Empleado empleado = new Empleado(nombre, edad, salario);
            gestor.agregarEmpleado(empleado);
        }

        System.out.println("\nDetalles de empleados:");
        gestor.mostrarEmpleados();

        scanner.close();
    }
}
