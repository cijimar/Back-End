
package Models;

import java.sql.Date;

public class Filmografia {
    
    private int id;
    private String titulo;
    private Date fecha;
    private String sinopsis;
    private int id_pais;
    private int id_clasificacion;

    public Filmografia(int id, String titulo, Date fecha, String sinopsis, int id_pais, int id_clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.sinopsis = sinopsis;
        this.id_pais = id_pais;
        this.id_clasificacion = id_clasificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    @Override
    public String toString() {
        return "Filmografia{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", sinopsis=" + sinopsis + ", id_pais=" + id_pais + ", id_clasificacion=" + id_clasificacion + '}';
    }
 
    

}
