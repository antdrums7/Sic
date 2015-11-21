/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cuenta;

/**
 *
 * @author rafae_000
 */
public class CuentaBd{

    private List<Cuenta> cuentas;
    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public List<Cuenta> obtenerCuentas() throws SQLException {
        ResultSet rs;
        PreparedStatement ps;
        cuentas = new ArrayList();
        cuentas.clear();
        String sql = "select * from rafael.cuentas;";
        try {

            ps = Conexion.conectar().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Cuenta c = new Cuenta();
                c.setCodigo(rs.getInt("cod_cuentas"));
                c.setNombre(rs.getString("nom_cuentas"));
                c.setPadre(rs.getInt("padre"));
                cuentas.add(c);
            }
            String maximo = "select max(cod_cuentas) from rafael.cuentas;";
            ps = Conexion.conectar().prepareStatement(maximo);
            rs = ps.executeQuery();
            rs.next();
            max = rs.getInt(1);
            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cuentas;
    }
    
}
