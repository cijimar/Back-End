
package Models;

import java.sql.Date;

public class Factura {
    
    private int num_factura;
    private int id_suscripcion;
    private int id_cuenta;
    private float importe_pvp;
    private String metodo_pago;
    private Date fecha_factura;

    public Factura(int num_factura, int id_suscripcion, int id_cuenta, float importe_pvp, String metodo_pago, Date fecha_factura) {
        this.num_factura = num_factura;
        this.id_suscripcion = id_suscripcion;
        this.id_cuenta = id_cuenta;
        this.importe_pvp = importe_pvp;
        this.metodo_pago = metodo_pago;
        this.fecha_factura = fecha_factura;
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public int getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(int id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public float getImporte_pvp() {
        return importe_pvp;
    }

    public void setImporte_pvp(float importe_pvp) {
        this.importe_pvp = importe_pvp;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    @Override
    public String toString() {
        return "Factura{" + "num_factura=" + num_factura + ", id_suscripcion=" + id_suscripcion + ", id_cuenta=" + id_cuenta + ", importe_pvp=" + importe_pvp + ", metodo_pago=" + metodo_pago + ", fecha_factura=" + fecha_factura + '}';
    } 
    
}
