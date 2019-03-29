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
public class UsuarioDB extends Hacienda {
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
    
    @Override
    public int ActivarRegistroBD() {
        return 1;
    }

    @Override
    public String ID_Usr_RegistroBD() {
        return "604260120";
    }
            
    public boolean ConsultarUsuario(int ID) throws SNMPExceptions, SQLException{
        
        boolean existe = false;
        String sql = "";
        try {
            AccesoDatos accesoDatos = new AccesoDatos();
            sql = "SELECT * FROM PERSONA WHERE ID = " + ID;
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(sql);
            
            if (rsPA.next()) {
                existe = true;
            }
            
            rsPA.close();
            return existe;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
        
    }
    
    public void InsertarUsuario(Usuario pUsuario)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "INSERT INTO PERSONA"
                    + "(" +
                    "ID_Tipo_Persona," +
		    "ID_Tipo_Identificacion,"  +
                    "ID_Horario," +
		    "Persona_Cliente," +
		    "Idntf_Persona," + 
                    "Nmbr_Persona," +
                    "Aplld_1_Persona," +
                    "Aplld_2_Persona," +
		    "Contrs_Persona," +
                    "Nmbr_Empresa," +
                    "Dirc_Principal," +
                    "LOG_ACTIVO,"+
		    "ID_Usr_Registro," +
                    "Fech_Registro," +
                    "ID_Usr_Ult_Edicion," +
                    "Fech_Ult_Edicion" +
                    ")" +
		    " VALUES" + 
                    "(" +                                      
                    "" +pUsuario.getId_Tipo_Persona()+ "" +
                    "" +pUsuario.getId_tipo_Identificacion()+ "" +
                    "" +pUsuario.getId_Horario()+ "" +
                    "" +pUsuario.getPersona_Cliente()+ "" +
                    "'" +pUsuario.getIdntf_persona()+ "'" +            
	            "'" +pUsuario.getNmbr_persona()+ "'" +
                    "'" +pUsuario.getAplld_1_persona()+ "'" +
                    "'" +pUsuario.getAplld_2_persona()+ "'" +
                    "'" +pUsuario.getCntrs_persona()+ "'" +
                    "'" +pUsuario.getNmbr_persona()+ "'" +
                    "'" +pUsuario.getDirc_Principal()+ "'" +                    
                    "" +this.ActivarRegistroBD()+ "" +                    
                    "" +this.ID_Usr_RegistroBD()+ "" +                    
                    "" +"GETDATE()"+ "" +                    
                    "" +this.ID_Usr_RegistroBD()+ "" +                    
                    "" +"GETDATE()"+ 
                    ")";
                    
            accesoDatos.ejecutaSQL(sql);
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }
    
    public LinkedList<Usuario> UsuarioTodo() throws SNMPExceptions, SQLException {
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
                  int id_Tipo_Identificacion = rsPA.getInt("ID_Tipo_Identificacion");
                  int id_Horario = rsPA.getInt("ID_Horario");
                  float persona_Empleado = rsPA.getInt("Persona_Empleado");                  
                  String tipo_Empleado = rsPA.getString("Tipo_Empleado");
                  float persona_Cliente = rsPA.getInt("Persona_Cliente");
                  String idntf_persona = rsPA.getString("Idntf_persona");
                  String nmbr_persona = rsPA.getString("Nmbr_persona");
                  String aplld_1_persona = rsPA.getString("Aplld_1_persona");
                  String aplld_2_persona = rsPA.getString("Aplld_2_persona");
                  String cntrs_persona = rsPA.getString("Cntrs_persona");
                  String nmbr_Empresa = rsPA.getString("Nmbr_Empresa");
                  String dirc_Principal = rsPA.getString("Dirc_Principal");
                  String log_Activo = rsPA.getString("LOG_ACTIVO");
                  long id_Usr_Registro = rsPA.getLong("ID_Usr_Registro");
                  Date fecha_Registro = rsPA.getDate("Fech_Registro");
                  long id_Usr_Ult_Registro = rsPA.getLong("ID_Usr_Ult_Edicion");
                  Date fecha_Ult_Registro = rsPA.getDate("Fech_Ult_Edicion");

                  Usuario oUsuario = new Usuario(
                          id_Tipo_Persona, 
                          id_Tipo_Identificacion, 
                          id_Horario, 
                          persona_Empleado, 
                          tipo_Empleado, 
                          persona_Cliente, 
                          idntf_persona, 
                          nmbr_persona, 
                          aplld_1_persona, 
                          aplld_2_persona, 
                          cntrs_persona, 
                          nmbr_Empresa, 
                          dirc_Principal, 
                          log_Activo, 
                          id_Usr_Registro, 
                          fecha_Registro, 
                          id_Usr_Ult_Registro, 
                          fecha_Ult_Registro
                  );
                          
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
