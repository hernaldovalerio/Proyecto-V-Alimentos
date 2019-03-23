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
    
    private int ID_Persona_Empleado;    
    private int ID_Tipo_Persona;
    private int ID_tipo_Indentificacion;
    private int ID_Horario;
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

    public int getID_Persona_Empleado() {
        return ID_Persona_Empleado;
    }

    public void setID_Persona_Empleado(int ID_Persona_Empleado) {
        this.ID_Persona_Empleado = ID_Persona_Empleado;
    }

    public float getPersona_Cliente() {
        return Persona_Cliente;
    }

    public void setPersona_Cliente(float Persona_Cliente) {
        this.Persona_Cliente = Persona_Cliente;
    }
   

    public int getID_Tipo_Persona() {
        return ID_Tipo_Persona;
    }

    public void setID_Tipo_Persona(int ID_Tipo_Persona) {
        this.ID_Tipo_Persona = ID_Tipo_Persona;
    }

    public int getID_tipo_Indentificacion() {
        return ID_tipo_Indentificacion;
    }

    public void setID_tipo_Indentificacion(int ID_tipo_Indentificacion) {
        this.ID_tipo_Indentificacion = ID_tipo_Indentificacion;
    }

    public int getID_Horario() {
        return ID_Horario;
    }

    public void setID_Horario(int ID_Horario) {
        this.ID_Horario = ID_Horario;
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

    public Date getFecha_Registro() {
        return fech_Registro;
    }

    public void setFecha_Registro(Date fecha_Registro) {
        this.fech_Registro = fecha_Registro;
    }   

    public long getId_Usr_Ult_Registro() {
        return id_Usr_Ult_Registro;
    }

    public void setId_Usr_Ult_Registro(long id_Usr_Ult_Registro) {
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
    }   

    public Date getFecha_Ult_Registro() {
        return fech_Ult_Registro;
    }

    public Date getFech_Registro() {
        return fech_Registro;
    }

    public void setFech_Registro(Date fech_Registro) {
        this.fech_Registro = fech_Registro;
    }

    public Date getFech_Ult_Registro() {
        return fech_Ult_Registro;
    }

    public void setFech_Ult_Registro(Date fech_Ult_Registro) {
        this.fech_Ult_Registro = fech_Ult_Registro;
    }

    public void setFecha_Ult_Registro(Date fecha_Ult_Registro) {
        this.fech_Ult_Registro = fecha_Ult_Registro;
    }

    public Usuario(int ID_Persona_Empleado, int ID_Tipo_Persona, int ID_tipo_Indentificacion, int ID_Horario, float Persona_Cliente, String idntf_persona, String nmbr_persona, String aplld_1_persona, String aplld_2_persona, String cntrs_persona, String dscrp_Empresa, String dirc_Principal, String log_Activo, long id_Usr_Registro, Date fech_Registro, long id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.ID_Persona_Empleado = ID_Persona_Empleado;
        this.ID_Tipo_Persona = ID_Tipo_Persona;
        this.ID_tipo_Indentificacion = ID_tipo_Indentificacion;
        this.ID_Horario = ID_Horario;
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
