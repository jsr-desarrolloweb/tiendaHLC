package productos;


import java.time.LocalDate;
import java.util.Date;

public class ProductoPerecedero extends Producto{

    private final LocalDate fechaCaducidad; // Tiempo que le queda al producto para caducar. ¿Tipo date DATE?;

    public ProductoPerecedero(int id_prod, String nombre_prod, float precio_prod, int unidadesDisponibles_prod, LocalDate fechaCaducidad){
        super(id_prod, nombre_prod, precio_prod, unidadesDisponibles_prod);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public float getPrecio() {
        //Calcula el precio del producto perecedero
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", fechaCaducidad='" + fechaCaducidad + "}";
    }
}
