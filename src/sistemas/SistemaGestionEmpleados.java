package sistemas;

import empleados.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class SistemaGestionEmpleados {

    //ArrayList con todos los empleados de la empresa.
    private ArrayList<Empleado> empleadosEmpresa = new ArrayList<Empleado>();

    //Al instanciar un objeto de la clase SistemaGestionEmpleados se cargan los datos del fichero "datosEmpleados.txt"
    //en su atributo empleadosEmpresa
    public SistemaGestionEmpleados() throws IOException, NullPointerException {

        try{

            File f = new File("src/sistemas/datosEmpleados.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) !=null) {
                String[] datos = linea.split(",");

                int id_empleado = Integer.parseInt(datos[0]);
                String nombre_empleado = datos[1];
                String contrasena_empleado = datos[2];
                int nVentas_empleado = Integer.parseInt(datos[3]);

                //Creamos un objeto Empleado para cada línea con los datos obtenidos y lo introducimos en el arraylist
                Empleado empleado = new Empleado(id_empleado, nombre_empleado, contrasena_empleado, nVentas_empleado);

                this.empleadosEmpresa.add(empleado);

            }
            br.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }


    public void cambiarPasswd(int idEmpleadoLoggeado){
        System.out.println("Escriba la nueva contraseña: ");
        String nuevaPasswd;
        Scanner sc = new Scanner(System.in);
        nuevaPasswd = sc.nextLine();

        for (Empleado empleado:
             this.empleadosEmpresa) {
            if (idEmpleadoLoggeado == empleado.getId_emp()){
                empleado.setContrasena_emp(nuevaPasswd);
                System.out.println("Contraseña cambiada!");
            }
        }
    }



    public ArrayList<Empleado> getEmpleadosEmpresa() {
        return empleadosEmpresa;
    }

    @Override
    public String toString() {
        return "SistemaGestionEmpleados{" +
                "empleadosEmpresa=" + empleadosEmpresa +
                '}' + '\'';
    }
}
