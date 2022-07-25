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
public final class Casa {

    private Integer id;
    private String calle;
    private Integer numCalle;
    private String codPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer timeMin;
    private Integer timeMax;
    private Double precioHabitacion;
    private String tipoVivienda;

    public Casa(Integer id, String calle, Integer numCalle, String codPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, Integer timeMin, Integer timeMax, Double precioHabitacion, String tipoVivienda) {
        this.id = id;
        this.calle = calle;
        this.numCalle = numCalle;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.timeMin = timeMin;
        this.timeMax = timeMax;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public Casa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(Integer numCalle) {
        this.numCalle = numCalle;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public Integer getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(Integer timeMin) {
        this.timeMin = timeMin;
    }

    public Integer getTimeMax() {
        return timeMax;
    }

    public void setTimeMax(Integer timeMax) {
        this.timeMax = timeMax;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + id + ", calle " + calle + " número " + numCalle + 
                ",\n Código postal: " + codPostal + ", " + ciudad + ", " + pais + 
                ",\n Desde: " + fechaDesde + ", Hasta: " + fechaHasta + ", tiempo mínimo: " + timeMin + ", tiempo máximo: " + timeMax + 
                ",\n Costo de la habitación: $" + precioHabitacion + ", Tipo de vivienda: " + tipoVivienda + '}';
    }

}
