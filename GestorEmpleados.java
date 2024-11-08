

/**
 *
 * @author kvall
 */
    import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.imprimirInfo();
            System.out.println("----------------------");
        }
    }
}

