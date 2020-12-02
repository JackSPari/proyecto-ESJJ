package data;

import entities.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ErrorLogger;
import java.util.logging.Level;

public class CompraData {

    static Connection cn = Conn.connectSQLite();
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(CompraData.class.getName());
    

    public static int create(Compra d) {
        int rsId = 0;
        String[] returns = {"id"};
        String sql = "INSERT INTO cliente(fecha_compra, idProveedor) " //activo
                + "VALUES(?   ,?)";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql, returns);
            ps.setDate(++i, d.getFecha_compra());
           
            
            ps.setInt(++i, d.getIdPersona());
  
            
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
}
