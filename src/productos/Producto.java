package productos;

public abstract class Producto {
    private int id_prod;
    private String nombre_prod;
    private float precio_prod;
    private int unidadesDisponibles_prod;

    public Producto(int id_prod, String nombre_prod, float precio_prod, int unidadesDisponibles_prod) {
        this.id_prod = id_prod;
        this.nombre_prod = nombre_prod;
        this.precio_prod = precio_prod;
        this.unidadesDisponibles_prod = unidadesDisponibles_prod;
    }

    public int getUnidadesDisponibles_prod() {
        return unidadesDisponibles_prod;
    }

    public int getId_prod() {
        return id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public float getPrecio_prod() {
        return precio_prod;
    }

    public abstract float getPrecio();

    public void setUnidadesDisponibles_prod(int unidadesDisponibles_prod) {
        this.unidadesDisponibles_prod = unidadesDisponibles_prod;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_prod=" + id_prod +
                ", nombre_prod='" + nombre_prod + '\'' +
                ", precio_prod=" + precio_prod +
                ", unidadesDisponibles_prod=" + unidadesDisponibles_prod;
    }
}
