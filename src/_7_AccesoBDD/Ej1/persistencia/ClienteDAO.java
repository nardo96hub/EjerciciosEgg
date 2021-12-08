/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.persistencia;

import _7_AccesoBDD.Ej1.entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ClienteDAO extends DAO{
    
    public ArrayList<Cliente> cargarCliente() throws Exception
    {
     try{
         String sql="select * from clientes";
        consultarSQL(sql);
        Cliente cliente;
        ArrayList<Cliente> clientes=new ArrayList();
       
        while(resultado.next())
        {
           cliente=new Cliente(resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getInt(4),resultado.getString(5),resultado.getString(6),
           resultado.getString(7),resultado.getString(8)
           );
           clientes.add(cliente);
        }
        return clientes;
     }catch(Exception e)
     {
         e.printStackTrace();
         throw new Exception("Error al cargar tabla cliente");
     }finally{
         desconectarBase();
     }
        
    }
  
}
