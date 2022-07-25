/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected Statement statement = null;
    protected ResultSet resultSet = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarDB() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlDDBB = "jdbc:mysql://localhost:3306/" + DATABASE + "?userSSL=false";
            conexion = DriverManager.getConnection(urlDDBB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarDB() throws Exception {
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }

    protected void insertarModificarEliminarDB(String sql) throws SQLException, ClassNotFoundException, Exception {
        try {
            conectarDB();
            statement = conexion.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        } finally {
            desconectarDB();
        }
    }

    protected void consultarDB(String sql) throws ClassNotFoundException, SQLException {
        try {
            conectarDB();
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

}
