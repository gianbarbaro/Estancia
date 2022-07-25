/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Casa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class CasaDAO extends DAO {
    
    public Casa buscarId(Integer idCasa) throws Exception {
        
        Casa casa = null;
        
        try {
            String sql = "SELECT * FROM casas WHERE id_casa = " + idCasa + ";";
            consultarDB(sql);
            
            while (resultSet.next()) {
                casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casa;
    }
    
    public List<Casa> listarCasasUKDesdeHasta() throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde = '2020-08-01' AND fecha_hasta = '2020-08-31' AND pais = 'Reino Unido';";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
                
                casas.add(casa);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
    public List<Casa> listarCasasFechaYDiaEspecifico(Date fecha, Integer dia) throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde = '" + fecha + "' AND tiempo_maximo =< " + dia + ";";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
                
                casas.add(casa);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
    public List<Casa> listarCantCasasPorPais() throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT COUNT(id_casa), pais FROM casas GROUP BY pais;";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setPais(resultSet.getString(2));
                
                casas.add(casa);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
    public void modificarPrecioHabitacion(Casa casa) throws Exception {
        
        try {
            String sql = "UPDATE casas SET precio_habitacion = " + casa.getPrecioHabitacion() + "WHERE id_casa = " + casa.getId() + ";";
            insertarModificarEliminarDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Casa> listarTodo() throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT * FROM casas;";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
                
                casas.add(casa);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
    public List<Casa> listarCasasLimpiasUK() throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT * FROM casas a INNER JOIN comentarios b ON a.id_casa = b.id_casa "
                    + "WHERE a.pais = 'Reino Unido' AND b.comentario LIKE '%limpia%';";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
                
                casas.add(casa);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
    public List<Casa> listarCasasUK() throws Exception {
        
        List<Casa> casas = new ArrayList();
        
        try {
            String sql = "SELECT * FROM casa WHERE pais = 'Reino Unido';";
            consultarDB(sql);
            
            while(resultSet.next()) {
                Casa casa = new Casa();
                
                casa.setId(resultSet.getInt(1));
                casa.setCalle(resultSet.getString(2));
                casa.setNumCalle(resultSet.getInt(3));
                casa.setCodPostal(resultSet.getString(4));
                casa.setCiudad(resultSet.getString(5));
                casa.setPais(resultSet.getString(6));
                casa.setFechaDesde(resultSet.getDate(7));
                casa.setFechaHasta(resultSet.getDate(8));
                casa.setTimeMin(resultSet.getInt(9));
                casa.setTimeMax(resultSet.getInt(10));
                casa.setPrecioHabitacion(resultSet.getDouble(11));
                casa.setTipoVivienda(resultSet.getString(12));
                
                casas.add(casa);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarDB();
        }
        return casas;
    }
    
}
