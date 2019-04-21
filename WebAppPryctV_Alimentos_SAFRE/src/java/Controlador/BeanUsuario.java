/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.CatalogoDia;
import Model.CatalogoHora;
import Model.DBCatalogoDia;
import Model.DBCatalogoHora;
import Model.Usuario;
import Model.UsuarioDB;
import java.sql.SQLException;
import java.util.Date;
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
public class BeanUsuario {
    private int id;
    private int id_Tipo_Persona;    
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
    private String id_Usr_Registro;
    private Date fech_Registro;
    private String id_Usr_Ult_Registro;
    private Date fech_Ult_Registro;
    
    private String telefono_principal;
    private String telefono_opcional;
    
    private String correo_principal;
    private String correo_opcional;
    
    private LinkedList<CatalogoDia> lista_catalogo_dia = new LinkedList<CatalogoDia>();
    private LinkedList<CatalogoHora> lista_catalogo_hora = new LinkedList<CatalogoHora>();
        

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

    public String getTelefono_principal() {
        return telefono_principal;
    }

    public void setTelefono_principal(String telefono_principal) {
        this.telefono_principal = telefono_principal;
    }

    public String getTelefono_opcional() {
        return telefono_opcional;
    }

    public void setTelefono_opcional(String telefono_opcional) {
        this.telefono_opcional = telefono_opcional;
    }

    public String getCorreo_principal() {
        return correo_principal;
    }

    public void setCorreo_principal(String correo_principal) {
        this.correo_principal = correo_principal;
    }

    public String getCorreo_opcional() {
        return correo_opcional;
    }

    public void setCorreo_opcional(String correo_opcional) {
        this.correo_opcional = correo_opcional;
    }    

    public LinkedList<CatalogoDia> getLista_catalogo_dia() throws SNMPExceptions, SQLException {
        int catalogo_dia_id=0;
        String catalogo_dia_descripcion="";        
        
        LinkedList<CatalogoDia> lista = new LinkedList<CatalogoDia>();
        DBCatalogoDia db_catalogo_dia = new DBCatalogoDia();
        
        lista = db_catalogo_dia.Lista_Catalogo_Dia();
        
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Dia entrega"));
        
        for (Iterator iter= lista.iterator();
                iter.hasNext();) {
        
            CatalogoDia catalogo_dia = (CatalogoDia) iter.next();
            catalogo_dia_id = catalogo_dia.getId();            
            catalogo_dia_descripcion = catalogo_dia.getDscrp_dia();                        
            
            resultList.add(new SelectItem(catalogo_dia_id, catalogo_dia_descripcion));
         }         
         return resultList; 
    }

    public void setLista_catalogo_dia(LinkedList<CatalogoDia> lista_catalogo_dia) {
        this.lista_catalogo_dia = lista_catalogo_dia;
    }

    public LinkedList<CatalogoHora> getLista_catalogo_hora() throws SNMPExceptions, SQLException {
        int catalogo_hora_id=0;
        String catalogo_hora_descripcion="";        
        
        LinkedList<CatalogoHora> lista_catalogo_hora = new LinkedList<CatalogoHora>();
        DBCatalogoHora db_catalogo_hora = new DBCatalogoHora();
        
        lista_catalogo_hora = db_catalogo_hora.Lista_Catalogo_Hora();
        
        LinkedList resultList = new LinkedList();
        resultList.add(new SelectItem(0, "Hora entrega"));
        
        for (Iterator iter= lista_catalogo_hora.iterator();
                iter.hasNext();) {
        
            CatalogoHora catalogo_hora = (CatalogoHora) iter.next();
            catalogo_hora_id = catalogo_hora.getId();            
            catalogo_hora_descripcion = catalogo_hora.getDscrp_hora();                        
            
            resultList.add(new SelectItem(catalogo_hora_id, catalogo_hora_descripcion));
         }         
         return resultList; 
    }

    public void setLista_catalogo_hora(LinkedList<CatalogoHora> lista_catalogo_hora) {
        this.lista_catalogo_hora = lista_catalogo_hora;
    }
    
    
    public BeanUsuario() {
    }
    
    public boolean AgregarUsuario() throws SNMPExceptions, SQLException{        
        
        //Validaciones 
        Usuario oUsuario = new Usuario(id, id_Tipo_Persona, id_Horario, persona_Empleado, tipo_Empleado, Persona_Cliente, idntf_persona, nmbr_persona, aplld_1_persona, aplld_2_persona, cntrs_persona, dscrp_Empresa, dirc_Principal, log_Activo, id_Usr_Registro, fech_Registro, id_Usr_Ult_Registro, fech_Ult_Registro);
        UsuarioDB oUsuarioDB = new UsuarioDB();
        return oUsuarioDB.InsertarUsuario(oUsuario);
    }
    
    public boolean EditarUsuario() throws SNMPExceptions, SQLException{
        return true;
    }
   
}
