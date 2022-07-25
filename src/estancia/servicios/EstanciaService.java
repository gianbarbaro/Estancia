/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Estancia;
import estancia.persistencia.EstanciaDAO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class EstanciaService {
    
    private final EstanciaDAO estanciaDAO;

    public EstanciaService() {
        estanciaDAO = new EstanciaDAO();
    }
    
    public void mostrarTodo() throws Exception {
        
        List<Estancia> estancias = estanciaDAO.listarTodo();
        
        System.out.println("Registro actual de estancias: ");
        for (Estancia estancia : estancias) {
            System.out.println(estancia.toString());
        }
    }
    
}
