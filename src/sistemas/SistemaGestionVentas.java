package sistemas;


import productos.Producto;
import productos.ProductoImperecedero;
import productos.ProductoPerecedero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaGestionVentas {

    //Diccionario de productos perecederos en stock
    private HashMap<Integer, ProductoPerecedero> stockProductoPerecedero = new HashMap<Integer, ProductoPerecedero>();
    //Diccionario de productos imperecederos en stock
    private HashMap<Integer, ProductoImperecedero> stockProductoImperecedero = new HashMap<Integer, ProductoImperecedero>();

    private ArrayList<Producto> carrito = new ArrayList<Producto>();


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


    public void realizarPedido(){
        System.out.println("----------------- MENÚ DE PEDIDOS ------------------");


        while(true){
            System.out.println("Elige una opción: \n (1) Añadir Producto.\n (2) Visualizar precio total.\n (3) Terminar Pedido. ");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            if (opcion == 1){
                //añadir producto
                anadirProducto();
            }
            if (opcion == 2){
                //ver precio total
            }
            if (opcion == 3){
                //Terminar pedido
                System.out.println("Saliendo del menú de pedidos...");
                break;
            }
        }


    }

    public void anadirProducto(){
        System.out.println("¿Perecedero (1) // Imperecedero (2)?");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        if (opcion == 1){
            System.out.println(getStockProductoPerecedero());
            System.out.println("ID del producto a añadir: ");
            int id = sc.nextInt();
            System.out.println("Nº de unidades del producto: ");
            int unidades = sc.nextInt();
            if (unidades < this.stockProductoPerecedero.get(id).getUnidadesDisponibles_prod()){
                //carrito.add(stockProductoPerecedero.get(id));
//                .
//                .
//                .
//                .
//                .
//                .
//                .
//                .
            }
        }
        if (opcion == 2){
            System.out.println(getStockProductoImperecedero());
        }
    }


    public HashMap<Integer, ProductoPerecedero> getStockProductoPerecedero() {
        return stockProductoPerecedero;
    }

    public HashMap<Integer, ProductoImperecedero> getStockProductoImperecedero() {
        return stockProductoImperecedero;
    }
}
