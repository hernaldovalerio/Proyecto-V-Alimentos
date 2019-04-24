/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author T7
 */
public class Factura {
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
    
    private LinkedList<DetalleFactura> detalle_factura;

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

    public LinkedList<DetalleFactura> getDetalle_factura() {
        return detalle_factura;
    }

    public void setDetalle_factura(LinkedList<DetalleFactura> detalle_factura) {
        this.detalle_factura = detalle_factura;
    }        

    public Factura(short id, short id_pedido, short id_est_factura, short id_pago, short id_tarjeta, short id_moneda, Date fec_factura, double total_facturar, double total_impuesto, double total_descuesto, String dir_envio, short log_Activo, String id_Usr_Registro, Date fech_Registro, String id_Usr_Ult_Registro, Date fech_Ult_Registro) {
        this.id = id;
        this.id_pedido = id_pedido;
        this.id_est_factura = id_est_factura;
        this.id_pago = id_pago;
        this.id_tarjeta = id_tarjeta;
        this.id_moneda = id_moneda;
        this.fec_factura = fec_factura;
        this.total_facturar = total_facturar;
        this.total_impuesto = total_impuesto;
        this.total_descuesto = total_descuesto;
        this.dir_envio = dir_envio;
        this.log_Activo = log_Activo;
        this.id_Usr_Registro = id_Usr_Registro;
        this.fech_Registro = fech_Registro;
        this.id_Usr_Ult_Registro = id_Usr_Ult_Registro;
        this.fech_Ult_Registro = fech_Ult_Registro;
        this.detalle_factura = new LinkedList<DetalleFactura>();
    }

    
    
}
