package conex;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    Connection conn;
    Statement st;
    
    public Connection conexion() {
        conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/control_de_servicio", "root", "");
            if(conn != null){
                JOptionPane.showMessageDialog(null, "Conexion establecida");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+ e);
        }
        return conn;
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconnectar(){
        conn=null;
        if(conn==null){
           JOptionPane.showMessageDialog(null, "Conexion terminada"); 
        }
    }
}
