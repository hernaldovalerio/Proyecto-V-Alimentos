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
public class Usuario {
    
    private int id;
    private int id_Tipo_Persona;    
    private int id_Horario;
    private float persona_empleado;    
    private String tipo_empleado;
    private float Persona_cliente;
    private String idntf_persona;
    private String nmbr_persona;
    private String aplld_1_persona;
    private String aplld_2_persona;
    private String cntrs_persona;
    private String dscrp_empresa;
    private String dirc_principal;
    private String log_activo; 
    private String id_usr_registro;
    private Date fech_registro;
    private String id_usr_ult_Registro;
    private Date fech_ult_registro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Tipo_Persona() {
        return id_Tipo_Persona;
    }

    public void setId_Tipo_Persona(int id_Tipo_Persona) {
        this.id_Tipo_Persona = id_Tipo_Persona;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public float getPersona_empleado() {
        return persona_empleado;
    }

    public void setPersona_empleado(float persona_empleado) {
        this.persona_empleado = persona_empleado;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public float getPersona_cliente() {
        return Persona_cliente;
    }

    public void setPersona_cliente(float Persona_cliente) {
        this.Persona_cliente = Persona_cliente;
    }

    public String getIdntf_persona() {
        return idntf_persona;
    }

    public void setIdntf_persona(String idntf_persona) {
        this.idntf_persona = idntf_persona;
    }

    public String getNmbr_persona() {
        return nmbr_persona;
    }

    public void setNmbr_persona(String nmbr_persona) {
        this.nmbr_persona = nmbr_persona;
    }

    public String getAplld_1_persona() {
        return aplld_1_persona;
    }

    public void setAplld_1_persona(String aplld_1_persona) {
        this.aplld_1_persona = aplld_1_persona;
    }

    public String getAplld_2_persona() {
        return aplld_2_persona;
    }

    public void setAplld_2_persona(String aplld_2_persona) {
        this.aplld_2_persona = aplld_2_persona;
    }

    public String getCntrs_persona() {
        return cntrs_persona;
    }

    public void setCntrs_persona(String cntrs_persona) {
        this.cntrs_persona = cntrs_persona;
    }

    public String getDscrp_empresa() {
        return dscrp_empresa;
    }

    public void setDscrp_empresa(String dscrp_empresa) {
        this.dscrp_empresa = dscrp_empresa;
    }

    public String getDirc_principal() {
        return dirc_principal;
    }

    public void setDirc_principal(String dirc_principal) {
        this.dirc_principal = dirc_principal;
    }

    public String getLog_activo() {
        return log_activo;
    }

    public void setLog_activo(String log_activo) {
        this.log_activo = log_activo;
    }

    public String getId_usr_registro() {
        return id_usr_registro;
    }

    public void setId_usr_registro(String id_usr_registro) {
        this.id_usr_registro = id_usr_registro;
    }

    public Date getFech_registro() {
        return fech_registro;
    }

    public void setFech_registro(Date fech_registro) {
        this.fech_registro = fech_registro;
    }

    public String getId_usr_ult_Registro() {
        return id_usr_ult_Registro;
    }

    public void setId_usr_ult_Registro(String id_usr_ult_Registro) {
        this.id_usr_ult_Registro = id_usr_ult_Registro;
    }

    public Date getFech_ult_registro() {
        return fech_ult_registro;
    }

    public void setFech_ult_registro(Date fech_ult_registro) {
        this.fech_ult_registro = fech_ult_registro;
    }   

    public Usuario(int id, int id_Tipo_Persona, int id_Horario, float persona_empleado, String tipo_empleado, float Persona_cliente, String idntf_persona, String nmbr_persona, String aplld_1_persona, String aplld_2_persona, String cntrs_persona, String dscrp_empresa, String dirc_principal, String log_activo, String id_usr_registro, Date fech_registro, String id_usr_ult_Registro, Date fech_ult_registro) {
        this.id = id;
        this.id_Tipo_Persona = id_Tipo_Persona;
        this.id_Horario = id_Horario;
        this.persona_empleado = persona_empleado;
        this.tipo_empleado = tipo_empleado;
        this.Persona_cliente = Persona_cliente;
        this.idntf_persona = idntf_persona;
        this.nmbr_persona = nmbr_persona;
        this.aplld_1_persona = aplld_1_persona;
        this.aplld_2_persona = aplld_2_persona;
        this.cntrs_persona = cntrs_persona;
        this.dscrp_empresa = dscrp_empresa;
        this.dirc_principal = dirc_principal;
        this.log_activo = log_activo;
        this.id_usr_registro = id_usr_registro;
        this.fech_registro = fech_registro;
        this.id_usr_ult_Registro = id_usr_ult_Registro;
        this.fech_ult_registro = fech_ult_registro;
    }

    
}
