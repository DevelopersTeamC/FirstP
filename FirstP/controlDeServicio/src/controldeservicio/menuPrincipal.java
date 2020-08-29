package controldeservicio;
import javax.swing.JOptionPane;
import java.lang.*;

public class menuPrincipal {
    //Atributos
    String nombreApp="CONTROL DE SERVICIO";
    String opciones[]={"Ver datos", "Ver clientes", "Opciones", "Salir"};
    byte opcion;
    //Metodos
    public void mostrarMenu(){
        menuOpciones ir=new menuOpciones();
        System.out.print("\t\t"+nombreApp);
        System.out.println("\n\t\t  Menú principal");
        for(int i=0;i<4;i++){
            System.out.println((i+1)+". "+opciones[i]);
        } 
        
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                ir.mostrar();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saldrá");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
        
    
}
