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
        System.out.println("\n\t\tMenú principal");
        for(int i=0;i<4;i++){
            System.out.println((i+1)+". "+opciones[i]);
        }
    }
    
    public void opcionIngresada(){
        byte opcion;
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
}
