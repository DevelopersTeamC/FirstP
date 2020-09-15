package controldeservicio;

import javax.swing.JOptionPane;

public class agregarDato {
    menuOpciones back=new menuOpciones();
    
    //Atributos
    final String nombreMenu="Agregar dato";
    final String opcionesMenu[]={"Agregar ingreso.","Agregar egreso.","Volver a opciones."};
    private String motivo;
    final String flujo[]={"Ingreso", "Egreso"};
    
    agregarDato(){
        this.motivo="";
    }      

    public String getMotivo() {
        return motivo;
    }

    //Metodos
    public void mostrarMenu(){  
        byte opcion;
        System.out.println("\n\t\t"+nombreMenu);
        for(int i=0;i<opcionesMenu.length;i++){
            System.out.println((i+1)+". "+opcionesMenu[i]);
        }
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
            switch(opcion){            
                case 1:
                   agregarIngreso();
                   break;
                case 2:
                   agregarEgreso();
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
        String motivoFlujoIngreso=null;
        int dineroDeIngreso=0;
        
        this.motivo=JOptionPane.showInputDialog("Escriba el motivo del ingreso: ");
        dineroDeIngreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a registrar: "));
        
        for (String flujo1 : flujo) {
            motivoFlujoIngreso=flujo[0]; 
        }
               
        guardar(motivoFlujoIngreso, dineroDeIngreso);
        
    }
    void agregarEgreso(){
        String motivoFlujoEgreso=null;
        int dineroDeEgreso=0;
        
        this.motivo=JOptionPane.showInputDialog("Escriba el motivo del egreso: ");
        dineroDeEgreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a registrar:"));
        
        for (String flujo1 : flujo) {
            motivoFlujoEgreso=flujo[1]; 
        }
        
               
        guardar(motivoFlujoEgreso, dineroDeEgreso);
    }
    
    void guardar(String motivoFlujoCualquiera, int dineroFlujo){
        System.out.println("\n\t\tDatos para guardar");
        System.out.println("El motivo del "+motivoFlujoCualquiera+" es: "+getMotivo());
        System.out.println("La cantidad de dinero que se va a registrar es de: "+dineroFlujo);
    }
}
