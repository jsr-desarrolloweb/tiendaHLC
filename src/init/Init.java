package init;


//Clase que se encarga de ejecutar la aplicación principal.

import empleados.Empleado;
import sistemas.SistemaGestionEmpleados;

import java.io.IOException;

public class Init {
    public static void main(String[] args) throws IOException {
//
//        Empleado e = new Empleado(1, "jaime", "jaime", 1100 );
//        System.out.println(e);

        SistemaGestionEmpleados sge = new SistemaGestionEmpleados();
        System.out.println(sge);

    }
}
