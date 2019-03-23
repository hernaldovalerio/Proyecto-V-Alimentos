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
public class UsuarioDB {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    private LinkedList<Usuario> listaP = new LinkedList<Usuario>();
    
    public UsuarioDB (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public UsuarioDB() {
        super();
    }
    
    public  LinkedList<Usuario> usuariosTodo() throws SNMPExceptions, SQLException {
      String select = "";
      LinkedList<Usuario> listaPro = new LinkedList<Usuario>();
          
          try {
    
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = "select * from PERSONA";
                      
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
             //Se llena el arryaList con los proyectos   
              while (rsPA.next()) {
                  
                  int id_Tipo_Persona = rsPA.getInt("ID_Tipo_Persona");
                  int id_tipo_Indentificacion = rsPA.getInt("ID_tipo_Indentificacion");
                  int id_Horario = rsPA.getInt("ID_Horario");
                  float persona_Empleado = rsPA.getInt("Persona_Empleado");                  
                  String tipo_Empleado = rsPA.getString("Tipo_Empleado");
                  float persona_Cliente = rsPA.getInt("Persona_Cliente");
                  String idntf_persona = rsPA.getString("idntf_persona");
                  String nmbr_persona = rsPA.getString("nmbr_persona");
                  String aplld_1_persona = rsPA.getString("aplld_1_persona");
                  String aplld_2_persona = rsPA.getString("aplld_2_persona");
                  String cntrs_persona = rsPA.getString("cntrs_persona");
                  String dscrp_Empresa = rsPA.getString("dscrp_Empresa");
                  String dirc_Principal = rsPA.getString("dirc_Principal");
                  String log_Activo = rsPA.getString("log_Activo");
                  long id_Usr_Registro = rsPA.getLong("id_Usr_Registro");
                  Date fecha_Registro = rsPA.getDate("fech_Registro");
                  long id_Usr_Ult_Registro = rsPA.getLong("id_Usr_Ult_Registro");
                  Date fecha_Ult_Registro = rsPA.getDate("fech_Ult_Registro");

                  Usuario oUsuario = new Usuario(id_Tipo_Persona, id_tipo_Indentificacion, id_Horario, persona_Empleado, tipo_Empleado, persona_Cliente, idntf_persona, nmbr_persona, aplld_1_persona, aplld_2_persona, cntrs_persona, dscrp_Empresa, dirc_Principal, log_Activo, id_Usr_Registro, fecha_Registro, id_Usr_Ult_Registro, fecha_Ult_Registro);
                          
                  listaPro.add(oUsuario);

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
          return listaPro;
      }
}
