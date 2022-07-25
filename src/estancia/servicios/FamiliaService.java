/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Familia;
import estancia.persistencia.FamiliaDAO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class FamiliaService {
    
    private final FamiliaDAO familiaDAO;

    public FamiliaService() {
        familiaDAO = new FamiliaDAO();
    }
    
    public void mostrarFamliasConTresHijos() throws Exception {
        
        List<Familia> familias = familiaDAO.listarFamiliasConTresHijos();
        
        System.out.println("Familias registradas con al menos 3 hijos menores de 10años:");
        for (Familia familia : familias) {
            System.out.println(familia.toString());
        }
    }
    
    public void mostrarFamliasConCorreoHotmail() throws Exception {
        
        List<Familia> familias = familiaDAO.ListarFamiliasCorreoHotmail();
        
        System.out.println("Familias registradas con @hotmail: ");
        for (Familia familia : familias) {
            System.out.println(familia.toString());
        }
    }
    
}
