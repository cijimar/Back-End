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
    //Cuando haces un DAO siempre hay una conexion 
    private Connection conexion;

    //------- CONSTRUCTOR:
    public FilmografiaDAO(DataBaseManager database) {
        this.conexion = database.getConnection();
    }

    //------- METODOS:
    /*public void listAll() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        newFilmo();
        try {
            stmt = conexion.prepareStatement(LISTALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                filmo.setId(rs.getInt("id"));
                filmo.setTitulo(rs.getString("titulo"));
                filmo.setFecha_estreno(rs.getDate("fecha_estreno"));
                filmo.setSinopsis(rs.getString("sinopsis"));
                filmo.setPais_id(rs.getInt("pais_id"));
                filmo.setClasificacion_id(rs.getInt("clasificacion_id"));
                System.out.println("Id: " + filmo.getId() + ", Titulo: " + filmo.getTitulo() + ", Fecha_estreno: " + filmo.getFecha_estreno() + ", Sinopsis: " + filmo.getSinopsis() + ", Pais_id " + filmo.getPais_id() + ", Id_clasificacion: " + filmo.getClasificacion_id());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error metodo listall");
        } finally{
            if (stmt != null) try{
                stmt.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar Statement", e);
            }
            if (rs != null) try{
                rs.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar ResultSet", e);
            }            
        }
    }*/

    public Filmografia listOne(int id) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Filmografia filmo = null; //--> Cintia, te tienes que crear la filmo fuera del try tio, que si es dentro solo se queda ahi, no lo reconoce el return
        try {
            stmt = conexion.prepareStatement(LISTONE);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();            
            
            if (rs.next()) {
                filmo = newFilmo(rs);
                /*filmo.setId(rs.getInt("id"));
                filmo.setTitulo(rs.getString("titulo"));
                filmo.setFecha_estreno(rs.getDate("fecha_estreno"));
                filmo.setSinopsis(rs.getString("sinopsis"));
                filmo.setPais_id(rs.getInt("pais_id"));
                filmo.setClasificacion_id(rs.getInt("clasificacion_id"));*/
                System.out.println(filmo.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "error metodo listone");
        } finally{
            if (stmt != null) try{
                stmt.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar Statement", e);
            }
            if (rs != null) try{
                rs.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar ResultSet", e);
            }            
        }
        return filmo;
    }


    private boolean delete(int id) throws SQLException {
        boolean eliminado = false;
        PreparedStatement stmt = null;
        try{
            stmt = conexion.prepareStatement(DELETE);
            stmt.setInt(1, id);
            int filas = stmt.executeUpdate();   //--> filas indica cuántas filas de la base de datos han sido afectadas por la sentencia SQL
    
            if (filas > 0) { //--> es mayor que 0 porque no hay ningún id 0
                eliminado = true;        
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage() + "error metodo delete");
            } 
            finally {
            if (stmt != null) try{
                stmt.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar Statement", e);
            }
            return eliminado;
        }
    }
    
        /*public Filmografia update(int id) throws SQLException {
        boolean eliminado = false;
        PreparedStatement stmt = null;
        try{
            stmt = conexion.prepareStatement(UPDATE);
            stmt.setInt(1, id);
            int filas = stmt.executeUpdate();
    
            if (filas > 0) {
                eliminado = true;        
            }
        }
            catch (SQLException e) {
            System.out.println(e.getMessage() + "error metodo delete");
            } 
            finally {
            if (stmt != null) try{
                stmt.close();
            } catch (SQLException e){
                throw new SQLException("Error al cerrar Statement", e);
            }
            return eliminado;
        }
    }*/
    
    private Filmografia newFilmo(ResultSet rs) throws SQLException{
        try{
            return new Filmografia (rs.getInt("id"),
                                        rs.getString("titulo"),
                                        rs.getDate("fecha_estreno"),
                                        rs.getString("sinopsis"),
                                        rs.getInt("pais_id"),
                                        rs.getInt("clasificacion_id"));                                     
        }
        catch (SQLException e){
            throw new SQLException("Error al crear newFilmo. ", e);
        }
    }
    
    

    
    
    
    
    
    
}//llave principal
