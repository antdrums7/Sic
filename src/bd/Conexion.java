package bd;

import java.sql.*;
import java.util.logging.*;
import java.util.ResourceBundle;

public class Conexion {

    private static Connection conexion = null;

    public static Connection conectar() {
        try {
            if (conexion == null) {

                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                ResourceBundle rb = ResourceBundle.getBundle("bd.jdbc");
                String usr = rb.getString("postgres");
                String pass = rb.getString("root");
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url, usr, pass);
            }
            return conexion;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error de conexión con la Base de Datos", e);
        }
    }

    static class MiShDwnHook extends Thread {
        // justo antes de ﬁ nalizar el programa la JVM invocara
        // a este metodo donde podemos cerrar la conexion 

        public void run() {
            try {
                Connection con = Conexion.conectar();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }

}
