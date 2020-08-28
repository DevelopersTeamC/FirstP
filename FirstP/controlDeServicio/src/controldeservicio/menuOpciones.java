package controldeservicio;
import java.lang.*;

public class menuOpciones {
    //Atributos
    String nombreMenu="Menú de ajustes";
    String[] opcionesI={"Agregar dato","Agregar nuevo cliente","Volver a menú principal"};//Opciones de ingreso
    
    //Métodos
    
    public void mostrar(){
        System.out.println("\t\t"+nombreMenu);
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+opcionesI);
        }
        
        ingresarOpciones mO=new ingresarOpciones();
        mO.opcionIngresada();
    }
}
