/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Cliente;
import estancia.persistencia.ClienteDAO;

/**
 *
 * @author Usuario
 */
public class ClienteService {
    
    private final ClienteDAO clienteDAO;

    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }
    
    public Cliente buscarId(Integer idCliente) throws Exception {
        
        if (idCliente == null || idCliente < 1) {
            throw new Exception("Debe ingresar un ID válido");
        }
        return clienteDAO.buscarId(idCliente);
    }
    
}
