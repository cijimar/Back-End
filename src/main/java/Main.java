import DAOs.FilmografiaDAO;
import dbManager.DataBaseManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[]args){
   
        DataBaseManager db = new DataBaseManager();
        db.conectar();
      

        FilmografiaDAO film = new FilmografiaDAO(db);
        //film.listAll();
        film.listOne(3);
        
        db.desconectar();
        //Hola a ver si se ve esto
        
    } 
}
