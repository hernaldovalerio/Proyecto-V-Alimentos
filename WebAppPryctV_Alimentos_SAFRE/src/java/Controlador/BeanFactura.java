/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.SNMPExceptions;
import Model.DBFactura;
import Model.DetalleFactura;
import Model.Factura;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Estudiante
 */
@Named(value = "beanFactura")
@Dependent
public class BeanFactura {

    private short id;
    private short id_pedido;
    private short id_est_factura;
    private short id_pago;
    private short id_tarjeta;
    private short id_moneda;
    private Date fec_factura;
    private double total_facturar;
    private double total_impuesto;
    private double total_descuesto;
    private String dir_envio;
    private short log_Activo; 
    private String id_Usr_Registro;
    private Date fech_Registro;
    private String id_Usr_Ult_Registro;
    private Date fech_Ult_Registro;
    
    private LinkedList<DetalleFactura> lista_detalle;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(short id_pedido) {
        this.id_pedido = id_pedido;
    }

    public short getId_est_factura() {
        return id_est_factura;
    }

    public void setId_est_factura(short id_est_factura) {
        this.id_est_factura = id_est_factura;
    }

    public short getId_pago() {
        return id_pago;
    }

    public void setId_pago(short id_pago) {
        this.id_pago = id_pago;
    }

    public short getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(short id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public short getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(short id_moneda) {
        this.id_moneda = id_moneda;
    }

    public Date getFec_factura() {
        return fec_factura;
    }

    public void setFec_factura(Date fec_factura) {
        this.fec_factura = fec_factura;
    }

    public double getTotal_facturar() {
        return total_facturar;
    }

    public void setTotal_facturar(double total_facturar) {
        this.total_facturar = total_facturar;
    }

    public double getTotal_impuesto() {
        return total_impuesto;
    }

    public void setTotal_impuesto(double total_impuesto) {
        this.total_impuesto = total_impuesto;
    }

    public double getTotal_descuesto() {
        return total_descuesto;
    }

    public void setTotal_descuesto(double total_descuesto) {
        this.total_descuesto = total_descuesto;
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

    public LinkedList<DetalleFactura> getLista_detalle() {
        return lista_detalle;
    }

    public void setLista_detalle(LinkedList<DetalleFactura> lista_detalle) {
        this.lista_detalle = lista_detalle;
    }    
          
    /**
     * Creates a new instance of BeanFactura
     */
    public BeanFactura() {
    }
    
    public boolean AgregarFactura() throws SNMPExceptions, SQLException{                
        //Validaciones 
        Factura factura = new Factura(id, id_pedido, id_est_factura, id_pago, id_tarjeta, id_moneda, fec_factura, total_facturar, total_impuesto, total_descuesto, dir_envio, log_Activo, id_Usr_Registro, fech_Registro, id_Usr_Ult_Registro, fech_Ult_Registro);
        DBFactura oUsuarioDB = new DBFactura();
        return oUsuarioDB.InsertarFactura(factura);
    }
    
    public boolean ConsultarFactura() throws SNMPExceptions, SQLException{
        //Validaciones 
        DBFactura facturaDB = new DBFactura();
        Factura factura = facturaDB.ConsultarFactura(id);
        
        this.setId_pedido(factura.getId_pedido());
                                                                    
        return true;
    }   
    
    public boolean EditarFactura() throws SNMPExceptions, SQLException{
        //Validaciones 
        Factura factura = new Factura(id, id_pedido, id_est_factura, id_pago, id_tarjeta, id_moneda, fec_factura, total_facturar, total_impuesto, total_descuesto, dir_envio, log_Activo, id_Usr_Registro, fech_Registro, id_Usr_Ult_Registro, fech_Ult_Registro);
        DBFactura facturaDB = new DBFactura();
        return facturaDB.ActualizarFactura(factura);
    }   
    
    public boolean EliminarUsuario() throws SNMPExceptions, SQLException{
        //Validaciones         
        DBFactura facturaDB = new DBFactura();
        return facturaDB.DesactivarFactura(id);
    }   
    
}
