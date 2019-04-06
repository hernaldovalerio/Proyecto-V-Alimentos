/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Ventas {    
    private short id;
    private int id_persona;
    private short id_tipo_venta;
    private Date fech_venta;
    private int cant_ventas;    
    private double monto_recaudado;
    private short log_Activo; 
    private String id_Usr_Registro;
    private Date fech_Registro;
    private String id_Usr_Ult_Registro;
    private Date fech_Ult_Registro;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public short getId_tipo_venta() {
        return id_tipo_venta;
    }

    public void setId_tipo_venta(short id_tipo_venta) {
        this.id_tipo_venta = id_tipo_venta;
    }

    public Date getFech_venta() {
        return fech_venta;
    }

    public void setFech_venta(Date fech_venta) {
        this.fech_venta = fech_venta;
    }

    public int getCant_ventas() {
        return cant_ventas;
    }

    public void setCant_ventas(int cant_ventas) {
        this.cant_ventas = cant_ventas;
    }

    public double getMonto_recaudado() {
        return monto_recaudado;
    }

    public void setMonto_recaudado(double monto_recaudado) {
        this.monto_recaudado = monto_recaudado;
    }

    public short getLog_Activo() {
        return log_Activo;
    }

    public void setLog_Activo(short log_Activo) {
        this.log_Activo = log_Activo;
    }

    public String getId_Usr_Registro() {
        return id_Usr_Registro;
    }

    public void setId_Usr_Registro(String id_Usr_Registro) {
        this.id_Usr_Registro = id_Usr_Registro;
    }

    public Date getFech_Registro() {
        return fech_Registro;
    }

    public void setFech_Registro(Date fech_Registro) {
        this.fech_Registro = fech_Registro;
    }

    public String getId_Usr_Ult_Registro() {
        return id_Usr_Ult_Registro;
    }

    public void setId_Usr_Ult_Registro(String id_Usr_Ult_Registro) {
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
    }

    public Date getFech_Ult_Registro() {
        return fech_Ult_Registro;
    }

    public void setFech_Ult_Registro(Date fech_Ult_Registro) {
        this.fech_Ult_Registro = fech_Ult_Registro;
    }

    public Ventas(short id, int id_persona, short id_tipo_venta, Date fech_venta, int cant_ventas, double monto_recaudado, short log_Activo, String id_Usr_Registro, Date fech_Registro, String id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_tipo_venta = id_tipo_venta;
        this.fech_venta = fech_venta;
        this.cant_ventas = cant_ventas;
        this.monto_recaudado = monto_recaudado;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
    }
    
    
}
