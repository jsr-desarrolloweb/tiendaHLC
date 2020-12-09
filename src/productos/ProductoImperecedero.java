package productos;


public class ProductoImperecedero extends Producto{

    private final int porcentaje_oferta;

    public ProductoImperecedero(int id_prod, String nombre_prod, float precio_prod, int unidadesDisponibles_prod, int porcentaje_oferta){
        super(id_prod, nombre_prod, precio_prod, unidadesDisponibles_prod);
        this.porcentaje_oferta = porcentaje_oferta;
    }

//    @Override
//    public float getPrecio_prod() {
//        //Calcula el precio del producto imperecedero
//        return 0;
//    }

    //TODO Implementar método getPrecio();


    @Override
    public String toString() {
        return super.toString() + ", porcenta_oferta=" + porcentaje_oferta + "}";
    }
}
