/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.SQLException;

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
                    ")" +
		    " VALUES" + 
                    "(" +                                      
                    "" +pPrueba.getId()+ "" +
                    "'" +pPrueba.getDescripcion()+ "'" +                                        
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
