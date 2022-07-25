
package paquete01;

import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import paquete02.Trabajador;

public class Enlace {
    
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/Trabajador.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            //System.out.println(conn.isClosed());
            //System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(Trabajador trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajador (ci, nombre, "
                    + "correo, sueldo, mesSueldo) "
                    + "values ('%s', '%s', '%s', '%.2f', %d)", 
                    trabajador.obtenerCedula(),
                    trabajador.obtenerNombre(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerSueldo(),
                    trabajador.obtenerMesSueldo());
            //System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataCiudad() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador trab = new Trabajador(rs.getString("ci"),
                    rs.getString("nombre"),
                    rs.getString("correo"),
                    rs.getDouble("sueldo"),
                    rs.getInt("mesSueldo"));
                lista.add(trab);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    
}
