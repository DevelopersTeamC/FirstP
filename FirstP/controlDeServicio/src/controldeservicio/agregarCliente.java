package controldeservicio;

import javax.swing.JOptionPane;
import java.lang.*;
import java.lang.String;


public class agregarCliente {
    menuOpciones back=new menuOpciones();   
        
    //Atributos    
    byte opcion;    
    final String nombreMenu;
    private final String opcionesMenu[]={"Ingresar el protocolo del cliente.","Guardar datos.","Volver a opciones."};
    private final String[] tipoSesion={"Depilación con cera","Electrodos","Limpieza facial","Lipoláser","Masaje reductor", "Masaje Relajante y exfoliación", "Manta térmica", "Vacumterapia","Volver a opciones"};
    String protocoloElegido;
    int cedula;
    
    public agregarCliente(){
        this.nombreMenu="Agregar cliente";
        this.protocoloElegido=null;
    }
    
    //Metodos   
    public void mostrarMenu(){         
        System.out.println("\n\t\t"+nombreMenu);
        for(int i=0;i<opcionesMenu.length;i++){
            System.out.println((i+1)+". "+opcionesMenu[i]);
        }
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){           
            case 1:                
                protocolo();
                break;
            case 2: 
                guardar(protocoloElegido);
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
        fecha horario=new fecha();
        String nombreGuardar=null, apellidoGuardar=null;
        
        if(protocoloElegido==null){
            JOptionPane.showMessageDialog(null, "¡¡Está dejando el protocolo vacio!!");
            mostrarMenu();
        }else{
            nombreGuardar=nombre();
            apellidoGuardar=apellido();
            System.out.println("\n\t\tDatos para guardar");
            System.out.println("Nombre: "+(nombreGuardar)+" "+(apellidoGuardar));
            System.out.println("Identificación de ciudadania: "+cedula());
            System.out.print("Identificación en el programa: ");
            for(int i=0;i<10;i++){
                System.out.print(identificacion()[i]);
            }        
            System.out.println("\nServicio: "+protocoloElegido);
        
            horario.hora();
            horario.fecha();
        }
    }
    
    private int cedula(){
        do{
            this.cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));        
        }while(this.cedula<=0);
        
        return this.cedula;
    }
    
    public String nombre(){
        String nombreClienteIngresado=null;
        do{
            nombreClienteIngresado=JOptionPane.showInputDialog("Ingrese sólo el nombre del cliente: "); 
        }while(nombreClienteIngresado==null);
        
        return nombreClienteIngresado;
    }
    
    public String apellido(){
        String apellidoClienteIngresado=null;
        do{
            apellidoClienteIngresado=JOptionPane.showInputDialog("Ingrese sólo el apellido del cliente: "); 
        }while(apellidoClienteIngresado==null);
        
        return apellidoClienteIngresado;
    }
    
    public char[] identificacion(){        
        char ID[]=new char[10];        
        char letras[]={'A','1','a','2','B','3','b','4','C','5','c','6','D','7','d','8','E','9','e','1','F','2','f','3','G','4','g','5','H','6','h','7','I','8','i','9','J','1','j','2','K','3','k','4','L','5','l','6','M','7','m','8','N','9','n','1','Ñ','2','ñ','3','O','4','o','5','P','6','p','7','Q','8','q','9','R','1','r','2','S','3','s','4','T','5','t','6','U','7','u','8','V','9','v','1','W','2','w','3','X','4','x','5','Y','6','y','7','Z','8','z','9'};
                
        for(int i=0;i<10;i++){
            byte aleatorio=-1;
            do{
                aleatorio=(byte)(Math.random()*200);
            }while((aleatorio<0)||(aleatorio>=108));
            ID[i]=letras[aleatorio];
        }
        
        return ID;
    }
    
    public void protocolo(){        
        System.out.println("\n\t\t¿Qué protocolo elige? ");
        for(int i=0;i<tipoSesion.length;i++){
            System.out.println((i+1)+". "+tipoSesion[i]);
        }
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){
            case 1:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[0];
                }
                break;
            case 2:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[1];
                }                
                break;
            case 3:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[2];
                }               
                break;   
            case 4:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[3];
                }              
                break;
            case 5:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[4];
                }              
                break;
            case 6:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[5];
                 }               
                break;
            case 7:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[6];
                }
                break;
            case 8:
                for (String tipoSesion1 : tipoSesion) {
                protocoloElegido=tipoSesion[7];
                }
                break;
            case 9: 
                back.mostrar();
                break;             
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>7));     
       mostrarMenu();
    }

}

