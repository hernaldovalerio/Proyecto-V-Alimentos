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
public class DBProducto extends Hacienda{
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;  

    private LinkedList<Producto> listaProducto = new LinkedList<Producto>();
    
    public DBProducto (Connection conn) {
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(conn);
    }
    
    public DBProducto() {
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
     
    public boolean ActualizarProducto(Producto pProducto)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "UPDATE PRODUCTO SET" +                    
                    " ID_Categoria=" + pProducto.getId_Categoria() +                    
		    " Rut_Fotografia="  + pProducto.getRut_Fotografia()+                   
                    " Precio=" + pProducto.getPrecio() +                   
		    " Cnt_Minima=" + pProducto.getCnt_minima() +                   		    
                    " LOG_ACTIVO="+ this.ActivarRegistroBD()+ 
		    " ID_Usr_Registro=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Registro=" + "GETDATE()"+
                    " ID_Usr_Ult_Edicion=" + this.ID_Usr_RegistroBD()+ 
                    " Fech_Ult_Edicion=" +"GETDATE()" +
                    " WHERE ID = "+ pProducto.getId();
                    		                                                    
            accesoDatos.ejecutaSQL(sql);                                                    		
            return true;
                        
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
    }                       
    
    public Producto ConsultarProducto(int ID) throws SNMPExceptions, SQLException {
        Producto producto = null;
        String sql = "";
        try {
            AccesoDatos accesoDatos = new AccesoDatos();
            sql = "SELECT * FROM PRODUCTO WHERE ID = " + ID;
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(sql);
            
            if (rsPA.next()) {
                int id = rsPA.getInt("ID");
                int id_categoria = rsPA.getInt("ID_Categoria");
                String rut_fotografia = rsPA.getString("Rut_Fotografia");
                double precio = rsPA.getDouble("Precio");
                int cnt_minima = rsPA.getInt("Cnt_Minima");
                short log_activo = rsPA.getShort("LOG_ACTIVO");
                String id_usr_registro = rsPA.getString("ID_Usr_Registro");
                Date fech_registro = rsPA.getDate("Fech_Registro");
                String id_usr_ult_registro = rsPA.getString("ID_Usr_Ult_Edicion");
                Date fech_ult_registro = rsPA.getDate("Fech_Ult_Edicion");
                
                producto = new Producto(id, id_categoria, rut_fotografia, precio, cnt_minima, log_activo, id_usr_registro, fech_registro, id_usr_ult_registro, fech_ult_registro);
                
            }
            
            rsPA.close();
            return producto;
            
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage(), e.getErrorCode());        
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION, e.getMessage());
        }finally{
        }
        
    }
    
    public boolean DesactivarProducto(int pId)throws SNMPExceptions, SQLException{
        String sql = "";
        try {                            
            sql = "UPDATE PRODUCTO" +
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
    
    public boolean InsertarProducto(Producto pProducto)throws SNMPExceptions, SQLException {
        String sql = "";
        try {
            sql = "INSERT INTO PRODUCTO"
                    + "(" +
                    "ID_Categoria," +                    
		    "Rut_Fotografia,"  +                    
                    "Precio," +                    
		    "Cnt_Minima," +                    		    
                    "LOG_ACTIVO,"+
		    "ID_Usr_Registro," +
                    "Fech_Registro," +
                    "ID_Usr_Ult_Edicion," +
                    "Fech_Ult_Edicion" +
                    ")" +
		    " VALUES" + 
                    "(" +                    
                    "" +pProducto.getId_Categoria()+ "" +                    
                    "'" +pProducto.getRut_Fotografia()+ "'" +
                    "" +pProducto.getPrecio()+ "" +
                    "" +pProducto.getCnt_minima()+ "" +                                        
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
                  int id = rsPA.getInt("ID");
                  int id_Categoria = rsPA.getInt("ID_Categoria");
                  String rut_Fotografia = rsPA.getString("Rut_Fotografia");
                  float precio = rsPA.getInt("Precio");
                  int cnt_Minima = rsPA.getInt("Cnt_Minima");                  
                  float log_Activo = rsPA.getInt("LOG_ACTIVO");
                  String id_Usr_Registro = rsPA.getString("ID_Usr_Registro");
                  Date fecha_Registro = rsPA.getDate("Fech_Registro");
                  String id_Usr_Ult_Registro = rsPA.getString("ID_Usr_Ult_Edicion");
                  Date fecha_Ult_Registro = rsPA.getDate("Fech_Ult_Edicion");
                  

                  Producto oProducto = new Producto(
                          id,
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
