package sistemas;


import productos.ProductoImperecedero;
import productos.ProductoPerecedero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class SistemaGestionVentas {

    //Diccionario de productos perecederos en stock
    private HashMap<Integer, ProductoPerecedero> stockProductoPerecedero = new HashMap<Integer, ProductoPerecedero>();
    //Diccionario de productos imperecederos en stock
    private HashMap<Integer, ProductoImperecedero> stockProductoImperecedero = new HashMap<Integer, ProductoImperecedero>();


    public SistemaGestionVentas() throws IOException, NullPointerException{

        //
        //Lectura datos Productos Perecederos
        //
        try{

            File f = new File("src/sistemas/datosPerecederos.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) !=null) {
                String [] lista = linea.split(":");
                String[] datos = lista[1].split(",");

                int id_producto = Integer.parseInt(lista[0]);
                String nombre_producto = datos[0];
                float precio_producto = Float.parseFloat(datos[1]);
                int unidadesDisponibles = Integer.parseInt(datos[2]);
                LocalDate fechaCaducidad = LocalDate.parse(datos[3]);

                ProductoPerecedero productoPerecedero = new ProductoPerecedero(id_producto, nombre_producto, precio_producto,unidadesDisponibles, fechaCaducidad);
                this.stockProductoPerecedero.put(id_producto, productoPerecedero);
            }
            br.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


        //
        //Lectura datos Productos Imperecederos
        //
        try{

            File f = new File("src/sistemas/datosImperecederos.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) !=null) {
                String [] lista = linea.split(":");
                String[] datos = lista[1].split(",");

                int id_producto = Integer.parseInt(lista[0]);
                String nombre_producto = datos[0];
                float precio_producto = Float.parseFloat(datos[1]);
                int unidadesDisponibles = Integer.parseInt(datos[2]);
                int porcentajeOferta = Integer.parseInt(datos[3]);

                ProductoImperecedero productoImperecedero = new ProductoImperecedero(id_producto, nombre_producto, precio_producto,unidadesDisponibles, porcentajeOferta);
                this.stockProductoImperecedero.put(id_producto, productoImperecedero);
            }
            br.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }




    }

    public HashMap<Integer, ProductoPerecedero> getStockProductoPerecedero() {
        return stockProductoPerecedero;
    }

    public HashMap<Integer, ProductoImperecedero> getStockProductoImperecedero() {
        return stockProductoImperecedero;
    }
}
