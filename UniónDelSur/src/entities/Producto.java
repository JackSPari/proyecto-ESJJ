package entities;

public class Producto {
    
    public int producto_id;
    private String nombre_producto;
    private String descripcion;
    private int cantidad;
    private boolean status;
    private boolean igv;
    private float precio_unitario;
    private float precio_sub_total;
    public int categoria_id;



    public int getproducto_id() {
        return producto_id;
    }

    public void setproducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isIgv() {
        return igv;
    }

    public void setIgv(boolean igv) {
        this.igv = igv;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public float getPrecio_sub_total() {
        return precio_sub_total;
    }

    public void setPrecio_sub_total(float precio_sub_total) {
        this.precio_sub_total = precio_sub_total;
    }
    
}
