/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.Prueba;
import Model.DBPrueba;
import Model.Usuario;
import Model.UsuarioDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author mi pc
 */
@Named(value = "beanPrueba")
@SessionScoped
public class BeanPrueba implements Serializable {

    private int id;
    private String descripcion;
    private short log_activo;
    
    private String filtro;
    
    private LinkedList<Prueba> lista_prueba = new LinkedList<Prueba>();

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

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }    

    public LinkedList<Prueba> getLista_prueba() throws SNMPExceptions, SQLException {
        int prueba_id=0;
        String prueba_descripcion="";
        short prueba_logActivo = 0;
        
        LinkedList<Prueba> lista = new LinkedList<Prueba>();
        DBPrueba pruebaDB = new DBPrueba();
        
        lista = pruebaDB.Todo();
        
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Seleccione Provincia"));
        
        for (Iterator iter= lista.iterator();
                iter.hasNext();) {
        
            Prueba prueba = (Prueba) iter.next();
            prueba_id = prueba.getId();            
            prueba_descripcion= prueba.getDescripcion();
            prueba_logActivo = prueba.getLog_activo();
            
            resultList.add(new SelectItem(prueba_logActivo, prueba_descripcion));
         }         
         return resultList; 
    }

    public void setLista_prueba(LinkedList<Prueba> lista_prueba) {
        this.lista_prueba = lista_prueba;
    }    
    
    public BeanPrueba() {        
    }
    
//    public short PasarLogActivo(){
//        if (log_activo.equals("Activo")) 
//            return 1;
//        else
//            return 0;
//    }
    
    public void AgregarPrueba() throws SNMPExceptions, SQLException{
        //Validaciones 
        Prueba oPrueba = new Prueba(id, descripcion, log_activo);
        DBPrueba oPruebaDB = new DBPrueba();
        oPruebaDB.InsertarPrueba(oPrueba);
    }
    
    public void EditarPrueba() throws SNMPExceptions, SQLException{
        //Validaciones 
        Prueba oPrueba = new Prueba(id, descripcion, log_activo);
        DBPrueba oPruebaDB = new DBPrueba();
        oPruebaDB.EditarPrueba(oPrueba);
    }
    
    public void EliminarPrueba() throws SNMPExceptions, SQLException{
        //Validaciones         
        DBPrueba oPruebaDB = new DBPrueba();
        oPruebaDB.DesactivarPrueba(id);
    }
    
    public void buscarPrueba()throws SNMPExceptions, SQLException{
        LinkedList<Prueba> lista_prueba = new LinkedList<Prueba>();
        DBPrueba oPruebaDB = new DBPrueba();
        Prueba oPrueba = oPruebaDB.BuscarPrueba(id);
        this.setId(oPrueba.getId());
        this.setDescripcion(oPrueba.getDescripcion());
        this.setLog_activo(oPrueba.getLog_activo());
        
    }
    
}
