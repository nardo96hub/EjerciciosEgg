/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Comentario;
import _7_AccesoBDD.Ej1.persistencia.ComentarioDAO;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ServicioComentario {
      public static ArrayList<Comentario> guardarComentarioJava() throws Exception
    {
        ComentarioDAO c=new ComentarioDAO();
        return c.cargarComentario();
    }
}
