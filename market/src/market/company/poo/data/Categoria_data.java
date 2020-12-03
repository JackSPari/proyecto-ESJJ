package market.company.poo.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import static market.company.poo.data.Categoria_data.cn;
import static market.company.poo.data.Categoria_data.log;
import static market.company.poo.data.Categoria_data.ps;
import market.company.poo.entities.Categoria;
import market.company.poo.util.ErrorLogger;


public class Categoria_data {

    static Connection cn = Coon_sqlite.connectSQLite();
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(Producto_data.class.getName());
    
    public static int create(Categoria c) {
        int rsId = 0;
        String[] returns = {"id"};
        String sql = "INSERT INTO producto(nombre_categoria) "
                + "VALUES(?)";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql, returns);
            ps.setString(++i, c.getNombre_categoria());
            rsId = ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    rsId = rs.getInt(1);
                }
                rs.close();
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "create", ex);
        }
        return rsId;
    }
    public static int update(Categoria c) {
        int comit = 0;
        String sql = "UPDATE producto SET "
                + "nombre_categoria=?, "
                + "WHERE id_producto=?";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(++i, c.getNombre_categoria());
            ps.setInt(++i, c.getId_categoria());
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "update", ex);
        }
        return comit;
    }
  
    public static int delete(int id) throws Exception {
        int comit = 0;
        String sql = "DELETE FROM producto WHERE id_categoria = ? ";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "delete", ex);
            throw new Exception("Detalle:" + ex.getMessage());
        }
        return comit;
    }
}