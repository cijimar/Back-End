
package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class NewMain {
    public static void main(String[]args){
   
        DataBaseManager db = new DataBaseManager();
        db.conectar();
        db.desconectar();







    } 
}
