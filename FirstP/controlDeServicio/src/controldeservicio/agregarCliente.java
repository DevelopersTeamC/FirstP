package controldeservicio;

import javax.swing.JOptionPane;
import java.lang.*;
import java.lang.String;


public class agregarCliente {
    menuOpciones back=new menuOpciones();   
    
    byte opcion;
    //Atributos
    
    String nombreMenu="Agregar cliente";
    String opcionesMenu[]={"Ingresar el protocolo del cliente.","Guardar datos.","Volver a opciones."};
    String[] tipoSesion={"Masaje reductor", "Masaje Relajante", "Manta térmica", "Facial", "Vacumterapia","Electrodos","Volver a opciones"};
    String protocoloElegido;
    int cedula;
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
                eleccion.protocolo();
                break;
            case 2: 
                eleccion.guardar(protocoloElegido);
                break;
            case 3:
                back.mostrar();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>3));
    }
    
    public void guardar(String protocoloElegido){
        agregarCliente movimiento=new agregarCliente();
        fecha horario=new fecha();
        if(protocoloElegido==null){
            JOptionPane.showMessageDialog(null, "¡¡Está dejando el protocolo vacio!!");
            movimiento.mostrarMenu();
        }else{
        
        identificacionCliente++; 
        
        System.out.println("\n\t\tDatos para guardar");
        System.out.println("Nombre: "+(movimiento.datosPersonales()));
        System.out.println("Identificación de ciudadania: "+movimiento.CC());
        System.out.print("Identificación en el programa: ");
        for(int i=0;i<10;i++){
            System.out.print(movimiento.identificacion()[i]);
        }        
        System.out.println("\nServicio: "+protocoloElegido);
        
        horario.hora();
        horario.fecha();
        }
    }
    
    private int CC(){
        int cedulaUsuario = 0; 
        cedulaUsuario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));        
        
        return cedulaUsuario;
    }
    
    public String datosPersonales(){ 
        String nombreClienteIngresado;
        
        nombreClienteIngresado= JOptionPane.showInputDialog("Ingrese el nombre y apellido del cliente: ");    
        
        return nombreClienteIngresado;
               
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

}

