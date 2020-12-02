package data;

import entities.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ErrorLogger;
import java.util.logging.Level;

public class CategoriaData {

    static Connection cn = Conn.connectSQLite();
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(CategoriaData.class.getName());


    public static int create(Categoria d) {
        int rsId = 0;
        String[] returns = {"id"};
        String sql = "INSERT INTO categorias(nombre_categoria ) " //activo
                + "VALUES(?)";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql, returns);
            ps.setString(++i, d.getNombre_categoria());
            
  
            rsId = ps.executeUpdate();// 0 no o 1 si commit
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    rsId = rs.getInt(1); // select tk, max(id)  from venta_lineas
                    //System.out.println("rs.getInt(rsId): " + rsId);
                }
                rs.close();
            }
        } catch (SQLException ex) {
            //System.err.println("create:" + ex.toString());
            log.log(Level.SEVERE, "create", ex);
        }
        return rsId;
    }


    public static int update(Categoria d) {
        System.out.println("actualizar d.getCategoriaID(): " + d.getCategoria_id());
        int comit = 0;
        String sql = "UPDATE categorias SET "
                + "nombre_categoria=?, "
                + "WHERE id=?";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(++i, d.getNombre_categoria());
        
            ps.setInt(++i, d.getCategoria_id());

            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "update", ex);
        }
        return comit;
    }


    public static int delete(int id) throws Exception {
        int comit = 0;
        String sql = "DELETE FROM categorias WHERE id = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "delete", ex);
            // System.err.println("NO del " + ex.toString());
            throw new Exception("Detalle:" + ex.getMessage());
        }
        return comit;
    }


    public static List<Categoria> list(String filter) {
        String filtert = null;
        if (filter == null) {
            filtert = "";
        } else {
            filtert = filter;
        }
        System.out.println("list.filtert:" + filtert);

        List<Categoria> ls = new ArrayList();

        String sql = "";
        if (filtert.equals("")) {
            sql = "SELECT * FROM categorias ORDER BY id";
        } else {
            sql = "SELECT * FROM categorias WHERE (id LIKE'" + filter + "%' OR "
                    + "nombre_categoria LIKE'" + filter + "%' OR "
                    + "categoria_id LIKE'" + filter + "%') "
                    + "ORDER BY nombre_categoria";
            System.out.println(sql);
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria d = new Categoria();
                d.setCategoria_id(rs.getInt("categoria_id"));
                d.setNombre_categoria(rs.getString("nombre_categoria"));
                
                ls.add(d);
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "list", ex);
        }
        return ls;
    }

    
    public static Categoria getByPId(int id) {
        Categoria d = new Categoria();

        String sql = "SELECT * FROM categorias WHERE id = ? ";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(++i, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d.setCategoria_id(rs.getInt("id"));
                d.setNombre_categoria(rs.getString("nombre_categoria"));
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "getByPId", ex);
        }
        return d;
    }
}
