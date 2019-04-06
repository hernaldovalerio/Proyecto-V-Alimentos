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
public class Tarjeta {
    private int id;
    private int id_persona;
    private int id_tipo_tarjeta;
    private int id_emisor_tarjeta;
    private String dscrp_tarjeta;
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

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_tipo_tarjeta() {
        return id_tipo_tarjeta;
    }

    public void setId_tipo_tarjeta(int id_tipo_tarjeta) {
        this.id_tipo_tarjeta = id_tipo_tarjeta;
    }

    public int getId_emisor_tarjeta() {
        return id_emisor_tarjeta;
    }

    public void setId_emisor_tarjeta(int id_emisor_tarjeta) {
        this.id_emisor_tarjeta = id_emisor_tarjeta;
    }

    public String getDscrp_tarjeta() {
        return dscrp_tarjeta;
    }

    public void setDscrp_tarjeta(String dscrp_tarjeta) {
        this.dscrp_tarjeta = dscrp_tarjeta;
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

    public Tarjeta(int id, int id_persona, int id_tipo_tarjeta, int id_emisor_tarjeta, String dscrp_tarjeta, short log_Activo, String id_Usr_Registro, Date fech_Registro, String id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id = id;
        this.id_persona = id_persona;
        this.id_tipo_tarjeta = id_tipo_tarjeta;
        this.id_emisor_tarjeta = id_emisor_tarjeta;
        this.dscrp_tarjeta = dscrp_tarjeta;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
    }
    
}
