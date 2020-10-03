package controldeservicio;

public class menu {
    public final String nombreApp;
    private String nombreMenu;
    private String[] opciones;
    private byte opcionIngresada;

    public menu() {
        this.nombreApp="Control de servicio";
        this.nombreMenu = "";
        this.opciones = null;
        this.opcionIngresada = 0;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombre) {
        this.nombreMenu = nombre;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public byte getOpcionIngresada() {
        return opcionIngresada;
    }

    public void setOpcionIngresada(byte opcionIngresada) {
        this.opcionIngresada = opcionIngresada;
    }
    
    
}
