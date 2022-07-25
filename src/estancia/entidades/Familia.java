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
public final class Familia {
    
    private Integer id;
    private String nombre;
    private Integer edadMin;
    private Integer edadMax;
    private Integer numHijos;
    private String email;
    private Casa casa;

    public Familia(Integer id, String nombre, Integer edadMin, Integer edadMax, Integer numHijos, String email, Casa casa) {
        this.id = id;
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.numHijos = numHijos;
        this.email = email;
        this.casa = casa;
    }

    public Familia() {
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

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public Integer getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(Integer edadMax) {
        this.edadMax = edadMax;
    }

    public Integer getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Integer numHijos) {
        this.numHijos = numHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Familia{" + id + ", " + nombre + ", email: " + email + ",\n Casa: " + casa + 
                ",\n Cantidad de hijos: " + numHijos + ", Edad mínima: " + edadMin + ", Edad máxima: " + edadMax + '}';
    }
    
}
