/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Familia;
import _7_AccesoBDD.Ej1.persistencia.FamiliaDAO;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ServicioFamilia {
      public static ArrayList<Familia> guardarFamiliaJava() throws Exception
    {
        FamiliaDAO f=new FamiliaDAO();
        return f.cargarFamilia();
    }
      public static ArrayList<Familia> consultaPunto1() throws Exception
      {
          FamiliaDAO f=new FamiliaDAO();
          return f.Punto1();
      }
       public static ArrayList<Familia> consultaPunto3() throws Exception
      {
          FamiliaDAO f=new FamiliaDAO();
          return f.Punto3();
      }
        public static ArrayList<Familia> consultaPunto4() throws Exception
      {
          FamiliaDAO f=new FamiliaDAO();
          return f.Punto4();
      }
}
