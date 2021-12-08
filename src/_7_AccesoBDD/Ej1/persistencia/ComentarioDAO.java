/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.persistencia;

import _7_AccesoBDD.Ej1.entidades.Comentario;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ComentarioDAO  extends DAO{
    public ArrayList<Comentario> cargarComentario() throws Exception
    {
      
     try{
         String sql="select * from comentarios";
        consultarSQL(sql);
        Comentario comentario;
        ArrayList<Comentario> comentarios=new ArrayList();
       
        while(resultado.next())
        {
           comentario=new Comentario(resultado.getInt(1),resultado.getString(2));
           comentarios.add(comentario);
        }
        return comentarios;
     }catch(Exception e)
     {
         e.printStackTrace();
         throw new Exception("Error al cargar tabla comentario");
     }finally{
         desconectarBase();
     }
        
    }
}
