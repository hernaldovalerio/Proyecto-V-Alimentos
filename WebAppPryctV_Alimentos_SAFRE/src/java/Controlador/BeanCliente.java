/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.AccesoDatos;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.model.SelectItem;

/**
 *
 * @author dramirez
 */
@Named(value = "beanUsuario")
@Dependent
public class BeanCliente {
    
    int Numero_Identificacion;
    String Nombre;
    String Primer_Apellido;
    String Segundo_Apellido;
    String Telefono;

    public BeanCliente() {
     Numero_Identificacion= 0;
     Nombre= "";
     Primer_Apellido= "";
     Segundo_Apellido= "";
     Telefono= "";
    }

    public int getNumero_Identificacion() {
        return Numero_Identificacion;
    }

    public void setNumero_Identificacion(int Numero_Identificacion) {
        this.Numero_Identificacion = Numero_Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
   
}
