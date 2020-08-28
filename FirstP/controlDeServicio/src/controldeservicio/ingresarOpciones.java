package controldeservicio;

import javax.swing.JOptionPane;

public class ingresarOpciones {
    //Atributos
    byte opcion;
    //Metodo
    public void opcionIngresada(){
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
            default:
                JOptionPane.showMessageDialog(null,"Opción inválida.");
                break;
        }
        }while((opcion<1)||(opcion>4));
    }
}
