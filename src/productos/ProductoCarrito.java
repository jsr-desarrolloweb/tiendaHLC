package productos;

public class ProductoCarrito {

    private int id_prodCarro;
    private String nombre_prodCarro;
    private int unidades_prodCarro;
    private float precio_prodCarro;

    public ProductoCarrito(int id_prodCarro, String nombre_prodCarro, int unidades_prodCarro, float precio_prodCarro) {
        this.id_prodCarro = id_prodCarro;
        this.nombre_prodCarro = nombre_prodCarro;
        this.unidades_prodCarro = unidades_prodCarro;
        this.precio_prodCarro = precio_prodCarro;
    }

    public int getId_prodCarro() {
        return id_prodCarro;
    }

    public void setId_prodCarro(int id_prodCarro) {
        this.id_prodCarro = id_prodCarro;
    }

    public String getNombre_prodCarro() {
        return nombre_prodCarro;
    }

    public void setNombre_prodCarro(String nombre_prodCarro) {
        this.nombre_prodCarro = nombre_prodCarro;
    }

    public int getUnidades_prodCarro() {
        return unidades_prodCarro;
    }

    public void setUnidades_prodCarro(int unidades_prodCarro) {
        this.unidades_prodCarro = unidades_prodCarro;
    }

    public float getPrecio_prodCarro() {
        return precio_prodCarro;
    }

    public void setPrecio_prodCarro(float precio_prodCarro) {
        this.precio_prodCarro = precio_prodCarro;
    }
}
