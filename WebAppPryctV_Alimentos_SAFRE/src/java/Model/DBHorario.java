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
import java.util.LinkedList;

/**
 *
 * @author T7
 */
public class DBHorario {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    public DBHorario(Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBHorario(){
        super();
    }
    
    
    
}
