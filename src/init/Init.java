package init;


//Clase que se encarga de ejecutar la aplicación principal.


import sistemas.SistemaGestionVentas;
import sistemas.SistemaPrincipal;
import java.io.IOException;



public class Init {
    public static void main(String[] args) throws IOException {

       SistemaPrincipal sppal = new SistemaPrincipal();
       sppal.run();






    }
}
