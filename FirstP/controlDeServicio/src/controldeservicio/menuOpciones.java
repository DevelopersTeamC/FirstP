package controldeservicio;
import java.lang.*;
import javax.swing.JOptionPane;

public class menuOpciones {
    //Atributos
    String nombreMenu="Menú de opciones";
    String[] opcionesI={"Agregar dato","Agregar nuevo cliente","Volver a menú principal"};//Opciones de ingreso
    byte opcion;
    //Métodos
    
    public void mostrar(){
        System.out.println("\t\t"+nombreMenu);
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+opcionesI[i]);
        }
        
    }
     public void opcionIngresada(){
        agregar info=new agregar();
        menuPrincipal back=new menuPrincipal();
         do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                info.agregarDato();
                break;
            case 2:
                info.agregarCliente();
                break;
            case 3:
                back.mostrarMenu();
                back.opcionIngresada();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
}
