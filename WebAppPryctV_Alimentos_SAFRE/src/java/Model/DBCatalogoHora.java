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
public class DBCatalogoHora {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    public DBCatalogoHora(Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBCatalogoHora(){
        super();
    }
    
    public  LinkedList<CatalogoHora> Lista_Catalogo_Hora() throws SNMPExceptions, SQLException {
      String select = "";
      LinkedList<CatalogoHora> lista_catalogo_hora = new LinkedList<CatalogoHora>();
          
          try {    
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = 
                      "select ID, Dscrp_Hora from CATALOGO_HORA";                      
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
             //Se llena el arryaList con los proyectos   
              while (rsPA.next()) {

                int hora_id = rsPA.getInt("ID");
                String hora_dscrp = rsPA.getString("Dscrp_Hora");                                
                
                CatalogoHora catalogo_hora = new CatalogoHora(hora_id, hora_dscrp);
                lista_catalogo_hora.add(catalogo_hora);
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
          return lista_catalogo_hora;
      }
}
