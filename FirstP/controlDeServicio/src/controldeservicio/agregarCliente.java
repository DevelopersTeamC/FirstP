package controldeservicio;

import javax.swing.JOptionPane;
import java.lang.*;
import java.lang.String;


public class agregarCliente {
    menuOpciones back=new menuOpciones();   
    
    byte opcion;
    //Atributos
    String nombreMenu="Agregar cliente";
    String opcionesMenu[]={"Ingresar el nombre y apellido del cliente.","Ingresar el protocolo del cliente.","Ingresar la fecha final del cliente.","Guardar datos.","Volver a opciones."};
    String nombreCliente;
    String[] tipoSesion={"Masaje reductor", "Masaje Relajante", "Manta térmica", "Facial", "Vacumterapia","Electrodos","Volver a opciones"};
    String protocoloElegido;
    int identificacionCliente;
    int numFirmas=0;
    //Metodos
    public void mostrarMenu(){ 
        agregarCliente eleccion=new agregarCliente();        
        System.out.println("\n\t\t"+nombreMenu);
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
                eleccion.guardar();
                break;
            case 5:
                back.mostrar();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>5));
    }
    
    public void guardar(){
        agregarCliente movimiento=new agregarCliente();
        identificacionCliente++; 
        
        System.out.println("\t\tDatos para guardar");
        System.out.println("\nNombre: "+movimiento.nombreCliente);
        System.out.print("Identificación: ");
        for(int i=0;i<10;i++){
            System.out.print(movimiento.identificacion()[i]);
        }        
        System.out.println("\nServicio: "+movimiento.protocoloElegido);
    }
    
    public void datosPersonales(){ 
        agregarCliente movimiento=new agregarCliente();
        
        movimiento.nombreCliente= JOptionPane.showInputDialog("Ingrese el nombre y apellido: ");
        
        movimiento.mostrarMenu();        
        
    }
    public char[] identificacion(){        
        char ID[]=new char[10];        
        char letras[]={'A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l','M','m','N','n','Ñ','ñ','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v','W','w','X','x','Y','y','Z','z'};
                
        for(int i=0;i<10;i++){
            byte aleatorio=-1;
            do{
                aleatorio=(byte)(Math.random()*100);
            }while((aleatorio<0)||(aleatorio>=54));
            ID[i]=letras[aleatorio];
        }
        
        return ID;
    }
    
    public void protocolo(){
        agregarCliente movimiento=new agregarCliente();        
        System.out.println("\n\t\t¿Qué protocolo elige? ");
        for(int i=0;i<tipoSesion.length;i++){
            System.out.println((i+1)+". "+tipoSesion[i]);
        }
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[0];
                }
                break;
            case 2:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[1];
                }                
                break;
            case 3:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[2];
                }               
                break;   
            case 4:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[3];
                }              
                break;
            case 5:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[4];
                }              
                break;
            case 6:
                for (String tipoSesion1 : tipoSesion) {
                movimiento.protocoloElegido=tipoSesion[5];
                 }               
                break;
            case 7: 
                back.mostrar();
                break;             
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>7));     
       movimiento.mostrarMenu();
    }
    
    public void fechaFinal(){
        
    }
}

