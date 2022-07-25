/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Casa;
import estancia.entidades.Familia;
import estancia.servicios.CasaService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class FamiliaDAO extends DAO{
    
    private final CasaService casaServicio;

    public FamiliaDAO() {
        casaServicio = new CasaService();
    }
    
    public List<Familia> listarFamiliasConTresHijos() throws Exception {
        
        List<Familia> familias = new ArrayList();
        
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos => 3 AND edad_maxima < 10;";
            consultarDB(sql);
            
            while (resultSet.next()) {
                Familia f = new Familia();
                
                f.setId(resultSet.getInt(1));
                f.setNombre(resultSet.getString(2));
                f.setEdadMin(resultSet.getInt(3));
                f.setEdadMax(resultSet.getInt(4));
                f.setNumHijos(resultSet.getInt(5));
                f.setEmail(resultSet.getString(6));
                
                Integer idCasa = resultSet.getInt(7);
                Casa casa = casaServicio.buscarId(idCasa);
                f.setCasa(casa);
                
                familias.add(f);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return familias;
    }
    
    public List<Familia> ListarFamiliasCorreoHotmail() throws Exception {
        
        List<Familia> familias = new ArrayList();
        
        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%';";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Familia f = new Familia();
                
                f.setId(resultSet.getInt(1));
                f.setNombre(resultSet.getString(2));
                f.setEdadMin(resultSet.getInt(3));
                f.setEdadMax(resultSet.getInt(4));
                f.setNumHijos(resultSet.getInt(5));
                f.setEmail(resultSet.getString(6));
                
                Integer idCasa = resultSet.getInt(7);
                Casa casa = casaServicio.buscarId(idCasa);
                f.setCasa(casa);
                
                familias.add(f);
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return familias;
    }
    
}
