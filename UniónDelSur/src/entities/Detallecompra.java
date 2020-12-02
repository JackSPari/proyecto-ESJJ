package entities;

public class Detallecompra {
    
    public int detalle_compra_id;
    private int cantidad;
    private float precio_unitario;
    private float precio_producto;
    public int compra_id;
    public int producto_id;

    

    public int getDetalle_compra_id() {
        return detalle_compra_id;
    }

    public void setDetalle_compra_id(int detalle_compra_id) {
        this.detalle_compra_id = detalle_compra_id;
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

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCompra_id() {
        return compra_id;
    }

    public void setCompra_id(int compra_id) {
        this.compra_id = compra_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }
    
}
