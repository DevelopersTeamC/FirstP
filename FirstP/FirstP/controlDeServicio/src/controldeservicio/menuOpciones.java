package controldeservicio;
import java.lang.*;
import javax.swing.JOptionPane;

public class menuOpciones extends menu{
        
    public menuOpciones() {
    }
    
    private void datosMenu(){
        String nombreMenu;
        String menuOpciones[]=new String[4];        
        
        nombreMenu="Menu principal";
        menuOpciones[0]="Agregar nuevo empleado.";
        menuOpciones[1]="Agregar nuevo cliente.";
        menuOpciones[2]="Ajustar informacion de un cliente.";
        menuOpciones[3]="Volver al menú principal.";
        
        setNombreMenu(nombreMenu);
        setOpciones(menuOpciones);
    }
    
    //Métodos
    public void mostrar(){
        datosMenu();
        byte opcion;
        System.out.println("\n\t\t"+getNombreMenu());
        for(int i=0;i<getOpciones().length;i++){
            System.out.println((i+1)+". "+getOpciones()[i]);
        }
         do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        setOpcionIngresada(opcion);
        switch(getOpcionIngresada()){
            case 1:
                break;
            case 2:
                agregarCliente ir=new agregarCliente();
                ir.mostrarMenu();
                break;
            case 3:
                ajustarInfoCliente go=new ajustarInfoCliente();
                go.mostrarMenu();
                break;
             case 4:
                menuPrincipal back=new menuPrincipal();
                back.mostrarMenu();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
     
}
