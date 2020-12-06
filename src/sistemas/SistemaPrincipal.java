package sistemas;

import empleados.Empleado;

import java.io.IOException;
import java.util.Scanner;

public class SistemaPrincipal {

    //Maneja su sistema de gestion de empleados
    private SistemaGestionEmpleados sge = new SistemaGestionEmpleados();

    public SistemaPrincipal() throws IOException {
    }

    public boolean loginEmpleado(){

        System.out.println("Nombre: ");
        String nombre  = "";
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();

        System.out.println("Contraseña: ");
        String contrasena  = "";
        contrasena = sc.nextLine();
//        System.out.println(nombre);
//        System.out.println(contrasena);

        for (Empleado empleado:
             sge.getEmpleadosEmpresa()) {
            if(nombre.equals(empleado.getNombre_emp()) && contrasena.equals(empleado.getContrasena_emp())){
                System.out.println("Login CORRECTO");
                return true;
            }

        }
        System.out.println("login INCORRECTO");
        return false;

    }


}
