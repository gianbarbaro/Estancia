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
public final class Comentario {
    
    private Integer id;
    private Casa casa;
    private String comentario;

    public Comentario(Integer id, Casa casa, String comentario) {
        this.id = id;
        this.casa = casa;
        this.comentario = comentario;
    }

    public Comentario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", casa=" + casa + ", comentario=" + comentario + '}';
    }
    
}
