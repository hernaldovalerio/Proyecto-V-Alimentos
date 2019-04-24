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
public class DBCatalogoDia {
    
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    public DBCatalogoDia(Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBCatalogoDia(){
        super();
    }
    public  LinkedList<CatalogoDia> Lista_Catalogo_Dia() throws SNMPExceptions, SQLException {
      String select = "";
      LinkedList<CatalogoDia> catalogo_dia_lista = new LinkedList<CatalogoDia>();
          
          try {    
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = 
                      "select ID, Dscrp_Dia from CATALOGO_DIA";                      
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
             //Se llena el arryaList con los proyectos   
              while (rsPA.next()) {

                int dia_id = rsPA.getInt("ID");
                String dia_dscrp = rsPA.getString("Dscrp_Dia");                                
                
                CatalogoDia catalogo_dia = new CatalogoDia(dia_id, dia_dscrp);
                catalogo_dia_lista.add(catalogo_dia);
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
