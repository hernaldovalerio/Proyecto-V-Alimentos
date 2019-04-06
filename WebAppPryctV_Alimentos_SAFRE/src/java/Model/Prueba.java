/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mi pc
 */
public class Prueba {
    private int id;
    private String descripcion;
    private short log_activo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getLog_activo() {
        return log_activo;
    }

    public void setLog_activo(short log_activo) {
        this.log_activo = log_activo;
    }

    public Prueba(int id, String descripcion, short log_activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.log_activo = log_activo;
    }        
       
}
