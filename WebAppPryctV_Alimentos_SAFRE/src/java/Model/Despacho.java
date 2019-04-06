/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author T7
 */
public class Despacho {
    private int id;
    private short id_pedido;
    private short id_medio_despacho;
    private short id_est_pedido;
    private Date fech_despacho;
    private String dir_envio;
    private short log_Activo; 
    private String id_Usr_Registro;
    private Date fech_Registro;
    private String id_Usr_Ult_Registro;
    private Date fech_Ult_Registro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(short id_pedido) {
        this.id_pedido = id_pedido;
    }

    public short getId_medio_despacho() {
        return id_medio_despacho;
    }

    public void setId_medio_despacho(short id_medio_despacho) {
        this.id_medio_despacho = id_medio_despacho;
    }

    public short getId_est_pedido() {
        return id_est_pedido;
    }

    public void setId_est_pedido(short id_est_pedido) {
        this.id_est_pedido = id_est_pedido;
    }

    public Date getFech_despacho() {
        return fech_despacho;
    }

    public void setFech_despacho(Date fech_despacho) {
        this.fech_despacho = fech_despacho;
    }

    public String getDir_envio() {
        return dir_envio;
    }

    public void setDir_envio(String dir_envio) {
        this.dir_envio = dir_envio;
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

    public Despacho(int id, short id_pedido, short id_medio_despacho, short id_est_pedido, Date fech_despacho, String dir_envio, short log_Activo, String id_Usr_Registro, Date fech_Registro, String id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id = id;
        this.id_pedido = id_pedido;
        this.id_medio_despacho = id_medio_despacho;
        this.id_est_pedido = id_est_pedido;
        this.fech_despacho = fech_despacho;
        this.dir_envio = dir_envio;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
    }
    
}
