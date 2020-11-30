
package com.mycompany.marketpluss.gui.tablesModel;

import com.mycompany.marketpluss.data.Producto_data;
import com.mycompany.marketpluss.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Productos_table_model extends AbstractTableModel {

    private List<Producto> list = new ArrayList();
    private String[] columns = {"Id", "Descripción", "Producto", "Cantidad", "Status", "Igv", "Precio Unitario", "Precio Subtotal"};
    private Class[] columnsType = {Integer.class, String.class, String.class, Integer.class, Boolean.class, Boolean.class, Float.class, Float.class};

    public Productos_table_model() {
        list = Producto_data.list("");
    }

    public Productos_table_model(String filter) {

        list = Producto_data.list(filter);
    }

    @Override
    public Object getValueAt(int row, int column) {
        Producto p = (Producto) list.get(row);
        switch (column) {
            case 0:
                return row + 1;
            case 1:
                return p.getDescripcion();
            case 2:
                return p.getNombre_producto();
            case 3:
                return p.getCantidad();
            case 4:
                return p.getStatus();
            case 5:
                return p.getIgv();
            case 6:
                return p.getPrecio_unitario();
            case 7:
                return p.getPrecio_sub_total();
            default:
                return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Class getColumnClass(int column) {
        return columnsType[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
}