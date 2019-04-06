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
public class Horario {
    private int id;
    private int id_catalodo_dia; 
    private int id_catalodo_hora;
    private String dscrp_horario;
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

    public int getId_catalodo_dia() {
        return id_catalodo_dia;
    }

    public void setId_catalodo_dia(int id_catalodo_dia) {
        this.id_catalodo_dia = id_catalodo_dia;
    }

    public int getId_catalodo_hora() {
        return id_catalodo_hora;
    }

    public void setId_catalodo_hora(int id_catalodo_hora) {
        this.id_catalodo_hora = id_catalodo_hora;
    }

    public String getDscrp_horario() {
        return dscrp_horario;
    }

    public void setDscrp_horario(String dscrp_horario) {
        this.dscrp_horario = dscrp_horario;
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

    public Horario(int id, int id_catalodo_dia, int id_catalodo_hora, String dscrp_horario, short log_Activo, String id_Usr_Registro, Date fech_Registro, String id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id = id;
        this.id_catalodo_dia = id_catalodo_dia;
        this.id_catalodo_hora = id_catalodo_hora;
        this.dscrp_horario = dscrp_horario;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
    }
    
    
}
