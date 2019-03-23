/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author mi pc
 */
public class Producto {
    private int id_Categoria;
    private String rut_Fotografia;
    private double precio;
    private int cnt_minima;
    private float log_activo;
    private long id_usr_regitro;
    private Date fech_Registro;
    private long id_Usr_Ult_Edicion;
    private Date fech_Ult_Registro;

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getRut_Fotografia() {
        return rut_Fotografia;
    }

    public void setRut_Fotografia(String rut_Fotografia) {
        this.rut_Fotografia = rut_Fotografia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCnt_minima() {
        return cnt_minima;
    }

    public void setCnt_minima(int cnt_minima) {
        this.cnt_minima = cnt_minima;
    }

    public float getLog_activo() {
        return log_activo;
    }

    public void setLog_activo(float log_activo) {
        this.log_activo = log_activo;
    }

    public long getId_usr_regitro() {
        return id_usr_regitro;
    }

    public void setId_usr_regitro(long id_usr_regitro) {
        this.id_usr_regitro = id_usr_regitro;
    }

    public Date getFech_Registro() {
        return fech_Registro;
    }

    public void setFech_Registro(Date fech_Registro) {
        this.fech_Registro = fech_Registro;
    }

    public long getId_Usr_Ult_Edicion() {
        return id_Usr_Ult_Edicion;
    }

    public void setId_Usr_Ult_Edicion(long id_Usr_Ult_Edicion) {
        this.id_Usr_Ult_Edicion = id_Usr_Ult_Edicion;
    }

    public Date getFech_Ult_Registro() {
        return fech_Ult_Registro;
    }

    public void setFech_Ult_Registro(Date fech_Ult_Registro) {
        this.fech_Ult_Registro = fech_Ult_Registro;
    }

    public Producto() {
    }        
            
}
