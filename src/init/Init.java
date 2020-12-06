package init;


//Clase que se encarga de ejecutar la aplicación principal.

import empleados.Empleado;
import sistemas.SistemaGestionEmpleados;
import sistemas.SistemaPrincipal;

import java.io.IOException;
import java.util.Scanner;

public class Init {
    public static void main(String[] args) throws IOException {

       SistemaPrincipal sppal = new SistemaPrincipal();
       sppal.run();



    }
}
