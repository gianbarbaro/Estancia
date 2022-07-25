/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Casa;
import estancia.persistencia.CasaDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public final class CasaService {

    private final CasaDAO casaDAO;

    public CasaService() {
        casaDAO = new CasaDAO();
    }

    public Casa buscarId(Integer idCasa) throws Exception {

        if (idCasa == null || idCasa < 1) {
            throw new Exception("Debe ingresar un ID válido");
        }
        return casaDAO.buscarId(idCasa);
    }

    public void mostrarCasasUKDesdeHasta() throws Exception {

        List<Casa> casas = casaDAO.listarCasasUKDesdeHasta();

        System.out.println("Casas disponibles desde el 01/08 hasta el 31/08 del 2020 en Reino Unido: ");
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }
    }

    public void mostrarCasasFechaYDiaEspecifico(Date fecha, Integer dia) throws Exception {

        List<Casa> casas = casaDAO.listarCasasFechaYDiaEspecifico(fecha, dia);

        Date desde = fecha;
        fecha.setDate(fecha.getDate() + dia);
        Date hasta = fecha;

        System.out.println("Casas disponibles desde el " + desde.toString() + " hasta el " + hasta.toString());
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }
    }

    public void mostrarCantCasasPorPais() throws Exception {

        List<Casa> casas = casaDAO.listarCantCasasPorPais();

        for (Casa casa : casas) {
            System.out.println(casa.getPais() + " (" + casa.getId() + " casas)");
        }
    }

    public void modificarPrecioHabitacion(Casa casa) throws Exception {

        if (casa == null) {
            throw new Exception("Debe selecionar una casa");
        }
        
        casa.setPrecioHabitacion(casa.getPrecioHabitacion() + (casa.getPrecioHabitacion()*0.05));
        casaDAO.modificarPrecioHabitacion(casa);
    }

    public void mostrarTodo() throws Exception {

        List<Casa> casas = casaDAO.listarTodo();

        System.out.println("Lista actual de casas: ");
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }
    }
    
    public void mostrarCasasLimpiasUK() throws Exception {

        List<Casa> casas = casaDAO.listarCasasLimpiasUK();

        System.out.println("Registro de casas con buenos comentarios: ");
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }
    }
    
    public List<Casa> listarCasasUK() throws Exception {
        return casaDAO.listarCasasUK();
    }
    
    public void mostarCasasUK() throws Exception {
        
        List<Casa> casas = casaDAO.listarCasasUK();
        
        System.out.println("Registro de casas en el Reino Unido: ");
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }
    }
    
}
