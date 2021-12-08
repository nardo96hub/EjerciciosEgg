/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.persistencia;

import _7_AccesoBDD.Ej1.entidades.Casa;
import _7_AccesoBDD.Ej1.entidades.Generico;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class CasaDAO extends DAO {

    public ArrayList<Casa> cargarCasa() throws Exception {
        try {
            String sql = "select * from casas";
            consultarSQL(sql);
            Casa casa;
            ArrayList<Casa> casas = new ArrayList();

            while (resultado.next()) {
                casa = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12)
                );
                casas.add(casa);
            }
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        } finally {
            desconectarBase();
        }

    }

    public ArrayList<Casa> Punto2() throws Exception {
        try {
            String sql = "select * from casas where pais=\"Reino Unido\" and fecha_desde between '2020-08-01' and '2020-08-31' and fecha_hasta between '2020-08-01' and '2020-08-31'";
            Casa casa;
            ArrayList<Casa> casas = new ArrayList();
            consultarSQL(sql);
            while (resultado.next()) {

                casa = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12)
                );
                //System.out.println(casa);
                casas.add(casa);
            }
            return casas;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Casa> Punto5(LocalDate dia, int d) throws Exception {
        try {
            String sql = "select * from casas where fecha_desde<= '" + dia + "' and datediff(fecha_hasta,fecha_desde)>=" + d;
            Casa c;
            consultarSQL(sql);
            ArrayList<Casa> cs = new ArrayList();
            while (resultado.next()) {
                c = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12)
                );
                //System.out.println(c);
                cs.add(c);
            }
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        } finally {
            desconectarBase();
        }

    }

    public void Punto6() throws Exception {
        try {
            /*   sql = "select * from casas where pais=\"Reino Unido\"";
                    Casa c;
                    consultarSQL(sql);
                    //Muestro tabla antes 
                    while (resultado.next()) {
                        c = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                                resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12)
                        );
                        System.out.println(c);

                    }*/
            String sql = "update casas set precio_habitacion=precio_habitacion+precio_habitacion*0.05 where pais=\"Reino Unido\"  ";
            inserModEli(sql);//Se actualizo?
            //  System.out.println("n\n");
            /* sql = "select * from casas where pais=\"Reino Unido\"";
                    consultarSQL(sql);
                    Casa c;
                    while (resultado.next()) {
                        c = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                                resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12));
                        System.out.println(c);
                    }*/

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        } finally {
            desconectarBase();
        }

    }

    public void Punto7() throws Exception {
        try {
            String sql = "select pais,count(pais)  from casas group by pais";
            consultarSQL(sql);
            // Casa p;
            while (resultado.next()) {
                /*p=new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                                resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12));
                 */

                System.out.println("Pais:" + resultado.getString(1) + "_ Cantidad de ciudades:" + resultado.getInt(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        } finally {
            desconectarBase();
        }

    }

    public ArrayList<Casa> Punto8() throws Exception {
        try {
            Casa li;
            //Comentario co;

           String sql = "select distinct * "
                    + "from casas,comentarios  "
                    + "where casas.id_casa=comentarios.id_casa and casas.pais='Reino Unido' and comentarios.comentario like \"%limpia%\"";
            consultarSQL(sql);
            ArrayList<Casa> lis=new ArrayList();
            while (resultado.next()) {
                li = new Casa(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), resultado.getString(6),
                        resultado.getDate(7), resultado.getDate(8), resultado.getInt(9), resultado.getInt(10), resultado.getDouble(11), resultado.getString(12));
                // co=new Comentario(resultado.getInt(1),resultado.getString(3));
                // System.out.println(resultado.getInt(1)+" "+resultado.getString(2));
                //System.out.println(li);
                lis.add(li);
                //System.out.println("Id_casa="+li.getId()+" Pais="+li.getPais()+" Comentario="+co.getComentario());

            }
            return lis;
            
        } catch (Exception e) {
             e.printStackTrace();
            throw new Exception("Error al cargar tabla casa");
        }finally{
            desconectarBase();
        }

    }
}
