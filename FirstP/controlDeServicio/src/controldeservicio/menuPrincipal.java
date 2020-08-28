package controldeservicio;
import javax.swing.JOptionPane;
import java.lang.*;

public class menuPrincipal {
    //Atributos
    String nombreApp="CONTROL DE SERVICIO";
    String opciones[]={"Ver datos", "Ver clientes", "Opciones", "Salir"};
    
    //Metodos
    public void mostrarMenu(){
        System.out.print("\t\t"+nombreApp);
        System.out.println("\n\t\t  Menú principal");
        for(int i=0;i<4;i++){
            System.out.println((i+1)+". "+opciones[i]);
        }
        
        ingresarOpciones oMP=new ingresarOpciones();
        oMP.opcionIngresada();
    }
    
}
