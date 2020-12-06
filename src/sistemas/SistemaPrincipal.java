package sistemas;

import empleados.Empleado;

import java.io.IOException;
import java.util.Scanner;

public class SistemaPrincipal {


    private SistemaGestionEmpleados sge = new SistemaGestionEmpleados();
    private SistemaGestionVentas sgv = new SistemaGestionVentas();

    private int idEmpleadoLoggeado;

    public SistemaPrincipal() throws IOException {
    }


    public void run(){
        //loginEmpleado();


        while (true){
            if (loginEmpleado()){
                System.out.println("---SESIÓN INICIADA---");

                while (true){
                    System.out.println("Elige una opción: \n (1) Realizar pedido.\n (2) Cambiar contraseña.\n (3) Salir. ");
                    int opcion;
                    Scanner sc = new Scanner(System.in);
                    opcion = sc.nextInt();

                    if (opcion == 1){
                        System.out.println("Va a relizar un pedido!");
                    }
                    if (opcion == 2){
                        System.out.println("Va a modificar la contraseña!");
                        sge.cambiarPasswd(this.idEmpleadoLoggeado);
                    }
                    if (opcion == 3){
                        System.out.println("---SESIÓN CERRADA---");
                        break;
                    }

                }
            }

            else{
                System.out.println("Error, vuelva a introducir credenciales");
            }
        }

    }


    //Devuelve true si el login es correcto y false en caso contrario
    public boolean loginEmpleado(){
        System.out.println("------ LOG IN -------");
        System.out.println("Nombre: ");
        String nombre  = "";
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();

        System.out.println("Contraseña: ");
        String contrasena  = "";
        contrasena = sc.nextLine();


        for (Empleado empleado:
             sge.getEmpleadosEmpresa()) {
            if(nombre.equals(empleado.getNombre_emp()) && contrasena.equals(empleado.getContrasena_emp())){
                //System.out.println("Login CORRECTO");
                this.idEmpleadoLoggeado = empleado.getId_emp();
                return true;
            }

        }
        //System.out.println("login INCORRECTO");
        return false;

    }


}
