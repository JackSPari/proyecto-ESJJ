package entities;

public class Proveedor {

    public int proveedor_id;
    private String ruc;
    private String email;
    private String telefono;
    public int persona_id;



    public int getproveedor_id() {
        return proveedor_id;
    }

    public void setproveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getpersona_id() {
        return persona_id;
    }

    public void setpersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    
}
