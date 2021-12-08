
package _7_AccesoBDD.Ej1.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAO {
    protected Connection conexion =null; // Establece conexcion con base de datos
    protected ResultSet resultado =null; // Resultado de consultas sql
    protected Statement sentencia =null; //cREA LA SENTENCIA
    
    private final String Usuario="root"; // usuario
    private final String Contra="root"; //contraseña
    private final String bdd="estancia_exterior"; //Nombre de base de datos a usar
    
    protected void conectarBase() throws Exception{
        try
        {Class.forName("com.mysql.jdbc.Driver");
        String urlBaseDedatos = "jdbc:mysql://localhost:3306/"+bdd+"?useSSL=false";
        conexion = DriverManager.getConnection(urlBaseDedatos,Usuario,Contra);//Establece conexion bdd
        }catch(ClassNotFoundException | SQLException ex)
        {
             ex.printStackTrace();
            throw new Exception("Error de Sistemas");
        }
    }
    protected void desconectarBase() throws Exception{
        try {
            if(resultado != null)
            {
                resultado.close();
            }
            if(sentencia !=null)
            {
                sentencia.close();
                
            }
            if(conexion != null)
            {
                conexion.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
            throw  new Exception("Error de Sistemas");
        }
    }
    
    protected void inserModEli(String sql) throws  Exception{
        try{
            conectarBase();
            sentencia=conexion.createStatement();
            sentencia.executeUpdate(sql);
        }catch(SQLException ex)
        {
            throw ex;
        }finally {
            desconectarBase();
        }
        
    }
    protected void consultarSQL(String sql) throws Exception{
        try{
            conectarBase();//Creo la conexion
            sentencia=conexion.createStatement();//Creamos la sentencia
            resultado=sentencia.executeQuery(sql);//Ejecuto la sentencia y consigo resultado
            
        } catch (Exception ex){
            ex.printStackTrace();
            throw new Exception("Error de Sistemas");
        }
            
            
    }
    
}
