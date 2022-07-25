/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Casa;
import estancia.entidades.Cliente;
import estancia.entidades.Estancia;
import estancia.servicios.CasaService;
import estancia.servicios.ClienteService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class EstanciaDAO extends DAO {
    
    private final ClienteService clienteServicio;
    private final CasaService casaServicio;

    public EstanciaDAO() {
        clienteServicio = new ClienteService();
        casaServicio = new CasaService();
    }
    
    public List<Estancia> listarTodo() throws Exception {
        
        List<Estancia> estancias = new ArrayList();
        
        try {
            String sql = "SELECT * FROM estancias;";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Estancia e = new Estancia();
                
                e.setId(resultSet.getInt(1));
                
                Integer idCliente = resultSet.getInt(2);
                Cliente cliente = clienteServicio.buscarId(idCliente);
                e.setCliente(cliente);
                
                Integer idCasa = resultSet.getInt(3);
                Casa casa = casaServicio.buscarId(idCasa);
                e.setCasa(casa);
                
                e.setNomHuesped(resultSet.getString(4));
                e.setFechaDesde(resultSet.getDate(5));
                e.setFechaHasta(resultSet.getDate(6));
                
                estancias.add(e);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return estancias;
    }
    
}
