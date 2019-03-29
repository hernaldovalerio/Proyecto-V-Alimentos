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
 * @author ucr
 */
public class ProductoDB {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    private LinkedList<Producto> listaProducto = new LinkedList<Producto>();
    
    public ProductoDB (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public ProductoDB() {
        super();
    }
    
    public int ActivarRegistroBD(){
        return 1;
    }
    
    public String ID_Usr_RegistroBD(){
        return "604260120";
    }    
    
    public void InsertarProducto(Usuario pUsuario)throws SNMPExceptions, SQLException {
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
                    "Fech_Ult_Edicion)"+
		    "VALUES"
                    + "(" +
                    
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
                    "" +"GETDATE()"+ "" +                    
                    "" +pUsuario.getFech_Ult_Registro()+ ")" ;
                                                    		
                        
        } catch (Exception e) {
        }
    }
    
    public LinkedList<Producto> ProductoTodo() throws SNMPExceptions, SQLException {
      String select = "";
      LinkedList<Producto> listaPro = new LinkedList<Producto>();
          
          try {
    
              //Se instancia la clase de acceso a datos
              AccesoDatos accesoDatos = new AccesoDatos();  

              //Se crea la sentencia de búsqueda
              select = "select * from PRODUCTO";
                      
              //Se ejecuta la sentencia SQL
              ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
             //Se llena el arryaList con los proyectos   
              while (rsPA.next()) {
                  
                  int id_Categoria = rsPA.getInt("ID_Categoria");
                  String rut_Fotografia = rsPA.getString("Rut_Fotografia");
                  float precio = rsPA.getInt("Precio");
                  int cnt_Minima = rsPA.getInt("Cnt_Minima");                  
                  float log_Activo = rsPA.getInt("LOG_ACTIVO");
                  long id_Usr_Registro = rsPA.getLong("ID_Usr_Registro");
                  Date fecha_Registro = rsPA.getDate("Fech_Registro");
                  long id_Usr_Ult_Registro = rsPA.getLong("ID_Usr_Ult_Edicion");
                  Date fecha_Ult_Registro = rsPA.getDate("Fech_Ult_Edicion");
                  

                  Producto oProducto = new Producto(
                          id_Categoria, 
                          rut_Fotografia, 
                          precio, 
                          cnt_Minima,                           
                          log_Activo, 
                          id_Usr_Registro, 
                          fecha_Registro, 
                          id_Usr_Ult_Registro, 
                          fecha_Ult_Registro
                  );
                          
                  listaPro.add(oProducto);

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
