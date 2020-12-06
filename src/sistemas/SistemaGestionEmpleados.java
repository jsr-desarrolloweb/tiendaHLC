package sistemas;

import empleados.Empleado;

import java.io.*;
import java.util.ArrayList;


public class SistemaGestionEmpleados {

    //ArrayList con todos los empleados de la empresa.
    private ArrayList<Empleado> empleadosEmpresa = new ArrayList<Empleado>();


    public SistemaGestionEmpleados() throws IOException, NullPointerException {
        //Al instanciar un objeto de la clase SistemaGestionEmpleados se cargan los datos del fichero "datosEmpleados.txt"
        //en su atributo empleadosEmpresa
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

                //Creamos un objetos Empleado para cada línea con los datos obtenidos y lo introducimos en el arraylist
                Empleado empleado = new Empleado(id_empleado, nombre_empleado, contrasena_empleado, nVentas_empleado);

                this.empleadosEmpresa.add(empleado);

            }
            br.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }

    @Override
    public String toString() {
        return "SistemaGestionEmpleados{" +
                "empleadosEmpresa=" + empleadosEmpresa +
                '}' + '\'';
    }
}
