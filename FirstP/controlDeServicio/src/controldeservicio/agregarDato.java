package controldeservicio;

import javax.swing.JOptionPane;

public class agregarDato {
    menuOpciones back=new menuOpciones();  
    //Atributos
    String nombreMenu="Agregar dato";
    String opcionesMenu[]={"Agregar ingreso.","Agregar egreso.","Volver a opciones."};
    String protocoloElegido;
    
    //Metodos
    public void mostrarMenu(){  
        agregarDato movimiento=new agregarDato();
        byte opcion;
        System.out.println("\n\t\t"+nombreMenu);
        for(int i=0;i<opcionesMenu.length;i++){
            System.out.println((i+1)+". "+opcionesMenu[i]);
        }
        do{
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch(opcion){            
            case 1:
                movimiento.agregarInreso();
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
    
    void agregarInreso(){
        
    }
    void agregarEgreso(){
        
    }
}
