package sistemas;

import empleados.Empleado;

import java.io.*;
import java.util.HashMap;

public class SistemaGestionEmpleados {

    private HashMap<Integer, Empleado> empleadosEmpresa;

    public SistemaGestionEmpleados() throws IOException {
        //Al instanciar un objeto de la clase SistemaGestionEmpleados se cargan los datos del fichero "datosEmpleados.txt"

        //          try/catch

        try{

            File f = new File("src/sistemas/datosEmpleados.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) !=null) {
                System.out.println(linea);
            }


        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }



}
