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
 * @author Estudiante
 */
public class DBTipoPersona {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    public DBTipoPersona(Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBTipoPersona(){
        super();
    }
    
    
    
    public  LinkedList<TipoPersona> Lista_Tipo_Persona() throws SNMPExceptions, SQLException {
      String select = "";
      LinkedList<TipoPersona> catalogo_dia_lista = new LinkedList<TipoPersona>();
          
          try {    
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = 
                      "select ID, Dscrp_Tipo_Persona from TIPO_PERSONA";                      
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
             //Se llena el arryaList con los proyectos   
              while (rsPA.next()) {

                short id = rsPA.getShort("ID");
                String dscrp = rsPA.getString("Dscrp_Tipo_Persona");                                
                
                TipoPersona tipo_persona = new TipoPersona(id, dscrp);
                catalogo_dia_lista.add(tipo_persona);
              }
              rsPA.close();
                                                         
             
              /*
          } catch (SQLException e) {
              throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, 
                                      e.getMessage(), e.getErrorCode());*/
          }catch (Exception e) {
              throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, 
                                      e.getMessage());
          } finally {
              
          }
          return catalogo_dia_lista;
      }
}
