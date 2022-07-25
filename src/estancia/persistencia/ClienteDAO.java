/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public final class ClienteDAO extends DAO {
    
    public Cliente buscarId(Integer idCliente) throws Exception {
        
        Cliente cliente = null;
        
        try {
            String sql = "SELECT * FROM clientes WHERE id_cliente = " + idCliente + ";";
            consultarDB(sql);
            
            while(resultSet.next()) {
                cliente = new Cliente();
                
                cliente.setId(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setCalle(resultSet.getString(3));
                cliente.setNumCalle(resultSet.getInt(4));
                cliente.setCodPostal(resultSet.getString(5));
                cliente.setCiudad(resultSet.getString(6));
                cliente.setPais(resultSet.getString(7));
                cliente.setEmail(resultSet.getString(8));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return cliente;
    }
    
}
