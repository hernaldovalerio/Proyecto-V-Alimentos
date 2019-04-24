/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Estudiante
 */
public class DBFactura extends Hacienda{
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    private LinkedList<Producto> listaProducto = new LinkedList<Producto>();
    
    public DBFactura (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBFactura() {
        super();
    }

    @Override
    public int ActivarRegistroBD() {
        return 1;
    }

    @Override
    public String ID_Usr_RegistroBD() {
        return "604260120";
    }
    
    public boolean ActualizarFactura(Factura pFactura)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "UPDATE ENCABEZADO_FACTURA SET" +                    
                    
                    " ID_Pedido=" + pFactura.getId_pedido()+                    
		    " ID_Est_Factura="  + pFactura.getId_est_factura()+                   
                    " ID_Pago" + pFactura.getId_pago()+                   
		    " ID_Tarjeta=" + pFactura.getId_tarjeta()+ 
                    " ID_Moneda=" + pFactura.getId_moneda()+ 
                    " Fech_Factura=" + pFactura.getFec_factura() + 
                    " Total_Facturar=" + pFactura.getTotal_facturar()+ 
                    " Total_Impuesto=" + pFactura.getTotal_impuesto()+ 
                    " Total_Descuento=" + pFactura.getTotal_descuesto()+ 
                    " Dir_Envio=" + pFactura.getDir_envio()+                     
                    " LOG_ACTIVO="+ this.ActivarRegistroBD()+ 
		    " ID_Usr_Registro=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Registro=" + "GETDATE()"+
                    " ID_Usr_Ult_Edicion=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Ult_Edicion=" +"GETDATE()" +
                    
                    " WHERE ID = "+ pFactura.getId();
                    		                                                    
            accesoDatos.ejecutaSQL(sql);                                                    		
            return true;
                        
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }                       
    
    public Producto ConsultarFactura(short pID) throws SNMPExceptions, SQLException {
        Producto producto = null;
        String sql = "";
        try {
            AccesoDatos accesoDatos = new AccesoDatos();
            sql = "SELECT * FROM ENCABEZADO_FACTURA WHERE ID = " + pID;
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(sql);
            
            if (rsPA.next()) {                                		                        		                                           
                
                short id_pedido = rsPA.getShort("ID_Pedido");
                short id_est_factura = rsPA.getShort("ID_Est_Factura");
                short id_pago = rsPA.getShort("ID_Pago");
                short id_tarjeta = rsPA.getShort("ID_Tarjeta");
                short id_moneda = rsPA.getShort("ID_Moneda");
                Date fecha_factura = rsPA.getDate("Fech_Factura");
                double total_facturar = rsPA.getDouble("Total_Facturar");
                double total_impuesto = rsPA.getDouble("Total_Impuesto");
                double total_descuento = rsPA.getDouble("Total_Descuento");
                String dir_envio = rsPA.getString("Dir_Envio");                                
                short log_activo = rsPA.getShort("LOG_ACTIVO");
                String id_usr_registro = rsPA.getString("ID_Usr_Registro");
                Date fech_registro = rsPA.getDate("Fech_Registro");
                String id_usr_ult_registro = rsPA.getString("ID_Usr__Ult_Edicion");
                Date fech_ult_registro = rsPA.getDate("Fech_Ult_Edicion");                                               
                
                Factura factura = new Factura(pID, id_pedido, id_est_factura, id_pago, id_tarjeta, id_moneda, fecha_factura, total_facturar, total_impuesto, total_descuento, dir_envio, log_activo, id_usr_registro, fech_registro, id_usr_ult_registro, fech_ult_registro);
            }
            
            rsPA.close();
            return producto;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
        
    }
    
    public boolean DesactivarFactura(short pId)throws SNMPExceptions, SQLException{
        String sql = "";
        try {                            
            sql = "UPDATE ENCABEZADO_FACTURA" +
                    " set" +
                    " LOG_ACTIVO" +                    
		    " =" +
                    " 0" +
		    " WHERE" + 
                    " ID" +                                      
                    " = " + pId;                                                            
            accesoDatos.ejecutaSQL(sql);
            return true;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }
    
    public boolean InsertarFactura(Producto pProducto)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "INSERT INTO PRODUCTO"
                    + "(" +
                    "ID_Categoria," +                    
		    "Rut_Fotografia,"  +                    
                    "Precio," +                    
		    "Cnt_Minima," +                    		    
                    "LOG_ACTIVO,"+
		    "ID_Usr_Registro," +
                    "Fech_Registro," +
                    "ID_Usr_Ult_Edicion," +
                    "Fech_Ult_Edicion" +
                    ")" +
		    " VALUES" + 
                    "(" +                    
                    "" +pProducto.getId_Categoria()+ "" +                    
                    "'" +pProducto.getRut_Fotografia()+ "'" +
                    "" +pProducto.getPrecio()+ "" +
                    "" +pProducto.getCnt_minima()+ "" +                                        
                    "" +this.ActivarRegistroBD()+ "" +                    
                    "" +this.ID_Usr_RegistroBD()+ "" +                    
                    "" +"GETDATE()"+ "" +                    
                    "" +this.ID_Usr_RegistroBD()+ "" +                    
                    "" +"GETDATE()"+ 
                    ")";
            
            accesoDatos.ejecutaSQL(sql);                                                    		
            return true;
                        
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }         
}
