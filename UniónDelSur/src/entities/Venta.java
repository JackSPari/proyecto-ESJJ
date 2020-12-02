package entities;

import java.util.Date;

public class Venta {

    public int venta_id;
    private Date fecha_venta;
    public int proveedor_id;

    

    public int getventa_id() {
        return venta_id;
    }

    public void setventa_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getproveedor_id() {
        return proveedor_id;
    }

    public void setproveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

}
