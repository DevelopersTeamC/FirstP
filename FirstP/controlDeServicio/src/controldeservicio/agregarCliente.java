package controldeservicio;

import javax.swing.JOptionPane;
import java.lang.*;
import java.lang.String;

public class agregarCliente {
    menuOpciones back=new menuOpciones();
    
    byte opcion;
    //Atributos
    String opcionesMenu[]={"Ingresar el nombre y apellido del cliente.","Ingresar el protocolo del cliente.","Ingresar la fecha final del cliente.","Volver a opciones."};
    String nombrecliente[][];
    String[] tipoSesion={"Masaje reductor", "Masaje Relajante", "Manta térmica", "Facial", "Vacumterapia","Electrodos","Volver a opciones"};
    int identificacionCliente=0;
    int numFirmas=0;
    //Metodos
    public void mostrarMenu(){ 
        agregarCliente eleccion=new agregarCliente();
        identificacionCliente++;
        System.out.println("\n\t\tMenu Agregar cliente");
        for(int i=0;i<opcionesMenu.length;i++){
            System.out.println((i+1)+". "+opcionesMenu[i]);
        }
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                eleccion.datosPersonales();
                break;
            case 2:                
                eleccion.protocolo();
                break;
            case 3: 
                eleccion.fechaFinal();
                break;   
            case 4:
                back.mostrar();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
    
    public void datosPersonales(){
        
    }
    
    public void protocolo(){
        System.out.println("\n\t\t¿Qué protocolo elige: ");
        for(int i=0;i<tipoSesion.length;i++){
            System.out.println((i+1)+". "+tipoSesion[i]);
        }
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
            case 5:
                
                break;
            case 6:
                
                break;
            case 7: 
                back.mostrar();
                break;             
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>7));
    }
    
    public void fechaFinal(){
        
    }
}

