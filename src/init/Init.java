package init;


//Clase que se encarga de ejecutar la aplicación principal.

import empleados.Empleado;

public class Init {
    public static void main(String[] args) {

        Empleado e = new Empleado(1, "jaime", "jaime", 1100 );
        System.out.println(e);


    }
}
