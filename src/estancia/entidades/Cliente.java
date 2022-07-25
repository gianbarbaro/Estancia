/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.entidades;

/**
 *
 * @author Usuario
 */
public final class Cliente {
    
    private Integer id;
    private String nombre;
    private String calle;
    private Integer numCalle;
    private String codPostal;
    private String ciudad;
    private String pais;
    private String email;

    public Cliente(Integer id, String nombre, String calle, Integer numCalle, String codPostal, String ciudad, String pais, String email) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.numCalle = numCalle;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + id + ", " + nombre + ", " + email + 
                ",\n calle: " + calle + ", nº: " + numCalle + ", Código postal: " + codPostal + ", " + ciudad + ", " + pais + '}';
    }
    
}
