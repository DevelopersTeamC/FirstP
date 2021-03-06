package controldeservicio;
import java.lang.*;
import javax.swing.JOptionPane;

public class menuOpciones {
    
    //Atributos
    String nombreMenu;
    private final String[] opcionesI={"Agregar dato.","Agregar nuevo cliente.","Ajustar información de un cliente.","Volver a menú principal."};//Opciones de ingreso
    byte opcion;
    
    public menuOpciones(){
        this.nombreMenu="Menú de opciones";
        this.opcion=0;
    }
    //Métodos
    
    public void mostrar(){        
        System.out.println("\n\t\t"+nombreMenu);
        for(int i=0;i<opcionesI.length;i++){
            System.out.println((i+1)+". "+opcionesI[i]);
        }
         do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                String motivo=null;                
                agregarDato info=new agregarDato(motivo);                 
                info.mostrarMenu();
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
