package empleados;

public class Empleado {

    private int id_emp;
    private String nombre_emp;
    private String contrasena_emp;
    private int nVentas_emp;

    public Empleado(int id_emp, String nombre_emp, String contrasena_emp, int nVentas_emp) {
        this.id_emp = id_emp;
        this.nombre_emp = nombre_emp;
        this.contrasena_emp = contrasena_emp;
        this.nVentas_emp = nVentas_emp;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_emp=" + id_emp +
                ", nombre_emp='" + nombre_emp + '\'' +
                ", contrasena_emp='" + contrasena_emp + '\'' +
                ", nVentas_emp=" + nVentas_emp +
                '}';
    }
}
