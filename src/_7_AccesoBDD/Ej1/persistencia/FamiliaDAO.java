/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.persistencia;

import _7_AccesoBDD.Ej1.entidades.Familia;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class FamiliaDAO extends DAO {

    public ArrayList<Familia> cargarFamilia() throws Exception {

        try {
            String sql = "select * from familias";
            consultarSQL(sql);
            Familia familia;
            ArrayList<Familia> familias = new ArrayList();

            while (resultado.next()) {
                familia = new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4),
                         resultado.getInt(5), resultado.getString(6));
                familias.add(familia);
            }
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla familia");
        } finally {
            desconectarBase();
        }

    }

    public ArrayList<Familia> Punto1() throws Exception {
        try {
            String sql = "select * from familias where num_hijos<=3 and edad_maxima<10";
            Familia fam;
            ArrayList<Familia> familias = new ArrayList();
            consultarSQL(sql);
            //System.out.println("El resultado de la consulta es:");
            while (resultado.next()) {

                fam = new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6));
                //System.out.println(fam);
                familias.add(fam);
            }
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla familia");
        }finally {
            desconectarBase();
        }
            

    }
    public ArrayList<Familia> Punto3() throws Exception {
        try {
            String sql = "select *from familias where nombre like \"%y\"";
                    Familia f;
                    consultarSQL(sql);ArrayList<Familia>fs=new ArrayList();
                    while (resultado.next()) {
                        f = new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6));
                        //System.out.println(f);
                        fs.add(f);
                    }
                   return fs;
        } catch (Exception e) {
               e.printStackTrace();
            throw new Exception("Error al cargar tabla familia");
        }finally{
             desconectarBase();
        }
        
    }
     public ArrayList<Familia> Punto4() throws Exception {
        try {
             String sql = "select * from familias where email like \"%@hotmail%\"";
                    Familia hot;
                    ArrayList<Familia> hots=new ArrayList();
                    consultarSQL(sql);
                    while (resultado.next()) {
                        hot = new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getInt(5), resultado.getString(6));
                        //System.out.println(hot);
                        hots.add(hot);
                    }
            return hots;       
        } catch (Exception e) {
               e.printStackTrace();
            throw new Exception("Error al cargar tabla familia");
        }finally{
             desconectarBase();
        }
        
    }
}
