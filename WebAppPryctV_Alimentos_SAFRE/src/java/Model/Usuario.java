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
    
    private int id_Tipo_Persona;
    private int id_tipo_Identificacion;
    private int id_Horario;
    private float persona_Empleado;    
    private String tipo_Empleado;
    private float Persona_Cliente;
    private String idntf_persona;
    private String nmbr_persona;
    private String aplld_1_persona;
    private String aplld_2_persona;
    private String cntrs_persona;
    private String dscrp_Empresa;
    private String dirc_Principal;
    private String log_Activo; 
    private long id_Usr_Registro;
    private Date fech_Registro;
    private long id_Usr_Ult_Registro;
    private Date fech_Ult_Registro;

    public int getId_Tipo_Persona() {
        return id_Tipo_Persona;
    }

    public void setId_Tipo_Persona(int id_Tipo_Persona) {
        this.id_Tipo_Persona = id_Tipo_Persona;
    }

    public int getId_tipo_Identificacion() {
        return id_tipo_Identificacion;
    }

    public void setId_tipo_Identificacion(int id_tipo_Identificacion) {
        this.id_tipo_Identificacion = id_tipo_Identificacion;
    }   

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public float getPersona_Empleado() {
        return persona_Empleado;
    }

    public void setPersona_Empleado(float persona_Empleado) {
        this.persona_Empleado = persona_Empleado;
    }   

    public String getTipo_Empleado() {
        return tipo_Empleado;
    }

    public void setTipo_Empleado(String tipo_Empleado) {
        this.tipo_Empleado = tipo_Empleado;
    }

    public float getPersona_Cliente() {
        return Persona_Cliente;
    }

    public void setPersona_Cliente(float Persona_Cliente) {
        this.Persona_Cliente = Persona_Cliente;
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

    public String getDscrp_Empresa() {
        return dscrp_Empresa;
    }

    public void setDscrp_Empresa(String dscrp_Empresa) {
        this.dscrp_Empresa = dscrp_Empresa;
    }

    public String getDirc_Principal() {
        return dirc_Principal;
    }

    public void setDirc_Principal(String dirc_Principal) {
        this.dirc_Principal = dirc_Principal;
    }

    public String getLog_Activo() {
        return log_Activo;
    }

    public void setLog_Activo(String log_Activo) {
        this.log_Activo = log_Activo;
    }

    public long getId_Usr_Registro() {
        return id_Usr_Registro;
    }

    public void setId_Usr_Registro(long id_Usr_Registro) {
        this.id_Usr_Registro = id_Usr_Registro;
    }

    public Date getFech_Registro() {
        return fech_Registro;
    }

    public void setFech_Registro(Date fech_Registro) {
        this.fech_Registro = fech_Registro;
    }

    public long getId_Usr_Ult_Registro() {
        return id_Usr_Ult_Registro;
    }

    public void setId_Usr_Ult_Registro(long id_Usr_Ult_Registro) {
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
    }

    public Date getFech_Ult_Registro() {
        return fech_Ult_Registro;
    }

    public void setFech_Ult_Registro(Date fech_Ult_Registro) {
        this.fech_Ult_Registro = fech_Ult_Registro;
    }

    public Usuario(int id_Tipo_Persona, int id_tipo_Indentificacion, int id_Horario, float persona_Empleado, String tipo_Empleado, float Persona_Cliente, String idntf_persona, String nmbr_persona, String aplld_1_persona, String aplld_2_persona, String cntrs_persona, String dscrp_Empresa, String dirc_Principal, String log_Activo, long id_Usr_Registro, Date fech_Registro, long id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id_Tipo_Persona = id_Tipo_Persona;
        this.id_tipo_Identificacion = id_tipo_Indentificacion;
        this.id_Horario = id_Horario;
        this.persona_Empleado = persona_Empleado;
        this.tipo_Empleado = tipo_Empleado;
        this.Persona_Cliente = Persona_Cliente;
        this.idntf_persona = idntf_persona;
        this.nmbr_persona = nmbr_persona;
        this.aplld_1_persona = aplld_1_persona;
        this.aplld_2_persona = aplld_2_persona;
        this.cntrs_persona = cntrs_persona;
        this.dscrp_Empresa = dscrp_Empresa;
        this.dirc_Principal = dirc_Principal;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
    }
    
    

    
    
}
