package entities;

public class Detalleventa {

    public int detalle_venta_id;
    private int cantidad;
    private float precio_unitario;
    private float precio_total_producto;
    public int producto_id;

    

    public int getDetalle_venta_id() {
        return detalle_venta_id;
    }

    public void setDetalle_venta_id(int detalle_venta_id) {
        this.detalle_venta_id = detalle_venta_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPrecio_total_producto() {
        return precio_total_producto;
    }

    public void setPrecio_total_producto(float precio_total_producto) {
        this.precio_total_producto = precio_total_producto;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }
    
}
