
package DAOs;

import Models.Filmografia;
import dbManager.DataBaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmografiaDAO {

   //------- ATRIBUTOS: 
    //Insert
    private static final String INSERT = "INSERT INTO Filmografia (id, titulo, fecha_estreno, sinopsis, pais_id, clasificacion_id) VALUES (?,?,?,?,?,?,?)";
    //Read
    private static final String READ = "SELECT * FROM Filmografia WHERE id=?";
    //Update
    private static final String UPDATE = "UPDATE Filmografia SET id=?, titulo=?, fecha_estreno=?, sinopsis=?, pais_id=?, clasificacion_id=? WHERE id=?";
    //Delete
    private static final String DELETE = "DELETE FROM Filmografia WHERE id=?";
    //Listall
    private static final String LISTALL = "SELECT * FROM Filmografia";
    //Listone
    private static final String LISTONE = "SELECT * FROM Filmografia WHERE id=?";
    //Conexion tambien va en el constructor  
    private Connection conexion;
    
     //------- CONSTRUCTOR::
    public FilmografiaDAO(DataBaseManager database){
        this.conexion = database.getConnection();
    }
   
    
    // METODO LISTALL
    /*
    Ejercicio:
Crear un método LISTALL en la clase FilmografiaDAO
En el main crear los objetos que hagan falta para ejecutar dicho método y mostrar los resultados
    */
        
      /*public List<Filmografia> listAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filmografia>filmografias = new ArrayList<>();
        try{
            stmt = conexion.prepareStatement(LISTALL);
            rs = stmt.executeQuery();
            while (rs.next()){
                
            }
           
        } catch
        
        
        
        return filmografias;
        
        /*String sql = "SELECT * FROM Filmografia";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
      }*/
          
       public void listAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Filmografia filmo = new Filmografia();
        try{
            stmt = conexion.prepareStatement(LISTALL);
            rs = stmt.executeQuery();
            while (rs.next()){             
                filmo.setId(rs.getInt("id"));
                filmo.setTitulo(rs.getString("titulo"));
                filmo.setFecha_estreno(rs.getDate("fecha_estreno"));
                filmo.setSinopsis(rs.getString("sinopsis"));
                filmo.setPais_id(rs.getInt("pais_id"));
                filmo.setClasificacion_id(rs.getInt("clasificacion_id"));
                System.out.println("Id: " + filmo.getId() + ", Titulo: " + filmo.getTitulo() + ", Fecha_estreno: " + filmo.getFecha_estreno() + ", Sinopsis: " + filmo.getSinopsis() + ", Pais_id " + filmo.getPais_id() + ", Id_clasificacion: " + filmo.getClasificacion_id());                  
            }
           
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error");        
                }
       }
   
        public Filmografia listOne(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Filmografia filmo = new Filmografia();
        try{
            stmt = conexion.prepareStatement(LISTONE);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()){               
                filmo.setId(rs.getInt("id"));
                filmo.setTitulo(rs.getString("titulo"));
                filmo.setFecha_estreno(rs.getDate("fecha_estreno"));
                filmo.setSinopsis(rs.getString("sinopsis"));
                filmo.setPais_id(rs.getInt("pais_id"));
                filmo.setClasificacion_id(rs.getInt("clasificacion_id"));
                System.out.println(filmo.toString());
            }
           
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error");        
                }
        return filmo;
       } 
       
       
       
       
       
       
       
}
        
        
        
    
    
    
    
    
    

