package controldeservicio;
import javax.swing.JOptionPane;
import java.lang.*;

public class menuPrincipal extends menu {
    
    menuOpciones ir=new menuOpciones();        

    public menuPrincipal() {
    }
    
    private void datosMenu(){
        String nombreMenu;
        String menuOpciones[]=new String[4];        
        
        nombreMenu="Menu principal";
        menuOpciones[0]="Ver horario";
        menuOpciones[1]="Ver cliente";
        menuOpciones[2]="Opciones";
        menuOpciones[3]="Salir";
        
        setNombreMenu(nombreMenu);
        setOpciones(menuOpciones);
    }
    //Metodos
    public void mostrarMenu(){    
        datosMenu();
        byte opcion;
        System.out.print("\n\t\t"+nombreApp);
        System.out.println("\n\t\t "+getNombreMenu());
        for(int i=0;i<getOpciones().length;i++){
            System.out.println((i+1)+". "+getOpciones()[i]);
        } 
        
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        setOpcionIngresada(opcion);
        switch(getOpcionIngresada()){
            case 1://Ver horario
                break;
            case 2://Ver clientes
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
