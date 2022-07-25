/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public final class Estancia {
    
    private Integer id;
    private Cliente cliente;
    private Casa casa;
    private String nomHuesped;
    private Date fechaDesde;
    private Date fechaHasta;

    public Estancia(Integer id, Cliente cliente, Casa casa, String nomHuesped, Date fechaDesde, Date fechaHasta) {
        this.id = id;
        this.cliente = cliente;
        this.casa = casa;
        this.nomHuesped = nomHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Estancia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getNomHuesped() {
        return nomHuesped;
    }

    public void setNomHuesped(String nomHuesped) {
        this.nomHuesped = nomHuesped;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "Estancia{" + id + ", Huesped: " + nomHuesped + ",\n Cliente:" + cliente + 
                ",\n Casa: " + casa + ",\n desde: " + fechaDesde + ", hasta: " + fechaHasta + '}';
    }
    
}
