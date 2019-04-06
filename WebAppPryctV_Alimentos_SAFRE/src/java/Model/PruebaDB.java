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
 * @author mi pc
 */
public class PruebaDB {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  
    
    public PruebaDB (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public PruebaDB() {
        super();
    }
    public boolean InsertarPrueba(Prueba pPrueba)throws SNMPExceptions, SQLException {        
        String sql = "";
        try {
            sql = "INSERT INTO TODO"
                    + "(" +
                    "ID," +                    
		    "Descripcion,"  +                    
                    "LOG_ACTIVO"  +                    
                    ")" +
		    " VALUES" + 
                    "(" +                                      
                    "" +pPrueba.getId()+ "," +
                    "'" +pPrueba.getDescripcion()+ "'," +                                        
                    "" + pPrueba.getLog_activo() +    
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
    
    public boolean EditarPrueba(Prueba pPrueba)throws SNMPExceptions, SQLException{
        String sql = "";
        try {               
            sql = "UPDATE TODO" +
                    " set" +
                    " Descripcion" +                    
		    " =" +
                    " '" + pPrueba.getDescripcion() + "'"+
		    " WHERE" + 
                    " ID" +                                      
                    " = " +pPrueba.getId();                                                            
            accesoDatos.ejecutaSQL(sql);
            return true;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }
    
    public boolean DesactivarPrueba(int pId)throws SNMPExceptions, SQLException{
        String sql = "";
        try {                            
            sql = "UPDATE TODO" +
                    " set" +
                    " log_activo" +                    
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
    
    public Prueba BuscarPrueba(int pId)throws SNMPExceptions, SQLException{
        String select = "";
          Prueba oPrueba = null;
          
          try {
             //open();
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = 
                      "select * from TODO where id = " + Math.PI;
             
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
              //Se llena el arryaList con los catálogos   
              while (rsPA.next()) {

                int id = rsPA.getInt("ID");
                String descripcion = rsPA.getString("Descripcion");
                short log_activo = rsPA.getShort("LOG_ACIVO");                
                
                oPrueba= new Prueba(id, descripcion, log_activo);                
              }
              rsPA.close();

          } catch (SQLException e) {
              throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, 
                                      e.getMessage(), e.getErrorCode());
          }catch (Exception e) {
              throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, 
                                      e.getMessage());
          } finally {

          }      
          return oPrueba;
    }
}
