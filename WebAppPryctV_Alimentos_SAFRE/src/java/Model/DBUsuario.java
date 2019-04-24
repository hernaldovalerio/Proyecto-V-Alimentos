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
public class DBUsuario extends Hacienda {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    private LinkedList<Usuario> listaP = new LinkedList<Usuario>();
    
    public DBUsuario (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBUsuario() {
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
    
    public boolean ActualizarUsuario(Usuario pUsuario)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "UPDATE PERSONA SET" +                                        
		    " ID_Tipo_Persona="  + pUsuario.getId_Tipo_Persona()+                                       
                    " ID_Horario=" + pUsuario.getId_Horario()+                   
		    " Persona_Empleado=" + pUsuario.getPersona_empleado()+                   		    
                    " Tipo_Empleado=" + pUsuario.getTipo_empleado()+                   		    
                    " Persona_Cliente=" + pUsuario.getPersona_cliente()+                      
                    " Idntf_Persona=" + pUsuario.getIdntf_persona()+                   		    
                    " Nmbr_Persona=" + pUsuario.getNmbr_persona() +                   		    
                    " Aplld_1_Persona=" + pUsuario.getAplld_1_persona()+                   		    
                    " Aplld_2_Persona=" + pUsuario.getAplld_2_persona()+                          
                    " Contrs_Persona=" + pUsuario.getCntrs_persona()+                   		    
                    " Nmbr_Empresa=" + pUsuario.getDscrp_empresa()+                   		    
                    " Dirc_Principal=" + pUsuario.getDirc_principal()+                   		                        
                    " LOG_ACTIVO="+ pUsuario.getLog_activo()+                     
		    " ID_Usr_Registro=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Registro=" + "GETDATE()"+
                    " ID_Usr_Ult_Edicion=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Ult_Edicion=" +"GETDATE()" +
                    " WHERE ID = "+ pUsuario.getId();
                                                                                                                                                           		                                                    
            accesoDatos.ejecutaSQL(sql);                                                    		
            return true;
                        
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }                       
    
            
    public Usuario ConsultarUsuario(int ID) throws SNMPExceptions, SQLException{
        
        Usuario usuario = null;
        String sql = "";
        try {
            AccesoDatos accesoDatos = new AccesoDatos();
            sql = "SELECT * FROM PERSONA WHERE ID = " + ID;
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(sql);
            
            if (rsPA.next()) {                                                                                          
                int id = rsPA.getInt("ID");
                int id_tipo_persona = rsPA.getInt("ID_Tipo_Persona");
                int id_horario = rsPA.getInt("ID_Horario");                
                short persona_empleado = rsPA.getShort("Persona_Empleado");        
                String tipo_empleado = rsPA.getString("Tipo_Empleado");
                short persona_cliente = rsPA.getShort("Persona_Cliente");        
                String idntf_persona = rsPA.getString("Idntf_Persona"); 
                String nmbr_persona = rsPA.getString("Nmbr_Persona");
                String aplld1_persona = rsPA.getString("Aplld_1_Persona");
                String aplld2_persona = rsPA.getString("Aplld_2_Persona");
                String contrs_persona = rsPA.getString("Contrs_Persona");
                String nmbr_empresa = rsPA.getString("Nmbr_Empresa");
                String dir_principal = rsPA.getString("Dirc_Principal");
                String log_activo = rsPA.getString("LOG_ACTIVO");
                String id_usr_registro = rsPA.getString("ID_Usr_Registro");
                Date fech_registro = rsPA.getDate("Fech_Registro");
                String id_usr_ult_registro = rsPA.getString("ID_Usr_Ult_Edicion");
                Date fech_ult_registro = rsPA.getDate("Fech_Ult_Edicion");
                
                usuario = new Usuario(id, id_tipo_persona, id_horario, persona_empleado, tipo_empleado, persona_cliente, idntf_persona, nmbr_persona, aplld1_persona, aplld2_persona, contrs_persona, nmbr_empresa, dir_principal, log_activo, id_usr_registro, fech_registro, id_usr_ult_registro, fech_ult_registro);                
              }
            
            rsPA.close();
            return usuario;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
        
    }
    
    public boolean DesactivarUsuario(int pId)throws SNMPExceptions, SQLException{
        String sql = "";
        try {                            
            sql = "UPDATE PERSONA" +
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
    
    public boolean InsertarUsuario(Usuario pUsuario)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "INSERT INTO PERSONA"
                    + "(" +
                    "ID_Tipo_Persona," +		    
                    "ID_Horario," +
                    "Persona_Empleado," +
                    "Tipo_Empleado," +
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
                    "" +pUsuario.getId_Horario()+ "" +
                    "" +pUsuario.getPersona_empleado()+ "" +
                    "" +pUsuario.getTipo_empleado()+ "" +                    
                    "" +pUsuario.getPersona_cliente()+ "" +
                    "'" +pUsuario.getIdntf_persona()+ "'" +            
	            "'" +pUsuario.getNmbr_persona()+ "'" +
                    "'" +pUsuario.getAplld_1_persona()+ "'" +
                    "'" +pUsuario.getAplld_2_persona()+ "'" +
                    "'" +pUsuario.getCntrs_persona()+ "'" +
                    "'" +pUsuario.getNmbr_persona()+ "'" +
                    "'" +pUsuario.getDirc_principal()+ "'" +                    
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
                  int id = rsPA.getInt("ID");                  
                  int id_Tipo_Persona = rsPA.getInt("ID_Tipo_Persona");                  
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
                  String id_Usr_Registro = rsPA.getString("ID_Usr_Registro");
                  Date fecha_Registro = rsPA.getDate("Fech_Registro");
                  String id_Usr_Ult_Registro = rsPA.getString("ID_Usr_Ult_Edicion");
                  Date fecha_Ult_Registro = rsPA.getDate("Fech_Ult_Edicion");

                  Usuario oUsuario = new Usuario(
                          id,
                          id_Tipo_Persona,                           
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
