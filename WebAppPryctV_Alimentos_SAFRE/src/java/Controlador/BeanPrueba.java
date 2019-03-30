/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Prueba;
import Model.PruebaDB;
import Model.Usuario;
import Model.UsuarioDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;

/**
 *
 * @author mi pc
 */
@Named(value = "beanPrueba")
@SessionScoped
public class BeanPrueba implements Serializable {

    private int id;
    private String descripcion;

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
    
    public BeanPrueba() {
        
    }
    
    public void AgregarPrueba() throws SNMPExceptions, SQLException{
        //Validaciones 
        Prueba oPrueba = new Prueba(id, descripcion);
        PruebaDB oPruebaDB = new PruebaDB();
        oPruebaDB.InsertarPrueba(oPrueba);
    }
    
}
