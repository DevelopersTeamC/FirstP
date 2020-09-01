package controldeservicio;

import javax.swing.JOptionPane;

public class agregarDato {
    menuOpciones back=new menuOpciones();  
    //Atributos
    String nombreMenu="Agregar dato";
    String opcionesMenu[]={"Agregar ingreso.","Agregar egreso.","Volver a opciones."};
    String motivo;
    final String flujo[]={"Ingreso", "Egreso"};
    
    agregarDato(String motivo){
        this.motivo=motivo;
    }      
    
    //Metodos
    public void mostrarMenu(){  
        agregarDato movimiento=new agregarDato(motivo);
        byte opcion;
        System.out.println("\n\t\t"+nombreMenu);
        for(int i=0;i<opcionesMenu.length;i++){
            System.out.println((i+1)+". "+opcionesMenu[i]);
        }
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
            switch(opcion){            
                case 1:
                   movimiento.agregarIngreso();
                   break;
                case 2:
                   movimiento.agregarEgreso();
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
    
    void agregarIngreso(){
        String motivoIngreso, motivoFlujoIngreso=null;
        int dineroDeIngreso=0;
        
        motivoIngreso=JOptionPane.showInputDialog("Escriba el motivo del ingreso: ");
        dineroDeIngreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a registrar: "));
        
        for(int i=0;i<flujo.length;i++){
           motivoFlujoIngreso=flujo[0]; 
        }
        
        agregarDato movimiento=new agregarDato(motivoIngreso);        
        movimiento.guardar(motivoFlujoIngreso, dineroDeIngreso);
        
    }
    void agregarEgreso(){
        String motivoEgreso, motivoFlujoEgreso=null;
        int dineroDeEgreso=0;
        
        motivoEgreso=JOptionPane.showInputDialog("Escriba el motivo del egreso: ");
        dineroDeEgreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a registrar:"));
        
        for(int i=0;i<flujo.length;i++){
           motivoFlujoEgreso=flujo[1]; 
        }
        
        agregarDato movimiento=new agregarDato(motivoEgreso);        
        movimiento.guardar(motivoFlujoEgreso, dineroDeEgreso);
    }
    
    void guardar(String motivoFlujoCualquiera, int dineroFlujo){
        System.out.println("\n\t\tDatos para guardar");
        System.out.println("El motivo del "+motivoFlujoCualquiera+" es: "+motivo);
        System.out.println("La cantidad de dinero que se va a registrar es de: "+dineroFlujo);
    }
}
