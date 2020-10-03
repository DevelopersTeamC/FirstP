package controldeservicio;

public class persona {
    private int cedula;
    private String nombre;
    private String apellido;
    private long telefono;

    public persona() {
        this.cedula = 0;
        this.nombre = null;
        this.apellido = null;
        this.telefono = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
        
}
