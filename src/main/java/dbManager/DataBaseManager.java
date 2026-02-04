
package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class DataBaseManager { // son FINAL porque su valor es fijo y no se puede modificar
    private static final Dotenv dotenv = Dotenv.load();
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASS = dotenv.get("DB_PASS");
    private static final String URL = dotenv.get("DB_URL");
    private Connection conexion; // =null; por defecto, esta variable, es NULL, poner NULL es redundante
          
    public void conectar() {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("conexion exitosa");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error en la conexion");
        }
    }
    
    public void desconectar(){
        try {
            if(conexion != null && !conexion.isClosed()){
            conexion.close(); 
            System.out.println("conexion cerrada");   
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error en la desconexion");
        }
        
    }
    
    
    
    
    
}
