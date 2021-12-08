/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.persistencia;

import _7_AccesoBDD.Ej1.entidades.Estancia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class EstanciaDAO extends DAO {

    public ArrayList<Estancia> cargarEstancia() throws Exception {

        try {
            String sql = "select * from estancias";
            consultarSQL(sql);
            Estancia estancia;
            ArrayList<Estancia> estancias = new ArrayList();

            while (resultado.next()) {
                estancia = new Estancia(resultado.getInt(1), resultado.getString(4), resultado.getDate(5), resultado.getDate(6));
                estancias.add(estancia);
            }
            return estancias;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }

    /*
         //busco id nuevo ya que no se autoincrementa

                 
                    sql = "select * from estancias";

                    consultarSQL(sql);
                    Estancia es;
                    System.out.println("Entro a cargar");
                    while (resultado.next()) {
                        es = new Estancia(resultado.getInt(1), resultado.getString(4), resultado.getDate(5), resultado.getDate(6));
                        System.out.println(es);
                    }
                    desconectarBase();
                    System.out.println("Entro a into");

                    sql = "insert into estancias(id_estancias, id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) values(" + ides + ", " + id_cliente + ", " + id_casa + ", '" + nombre_hues + "', '" + fecha_desde + "', '" + fecha_hasta + "')";
                    inserModEli(sql);
                    System.out.println("Se cargo bien?");
                    //Muestro luego de ingresar
                    sql = "select * from estancias";
                    System.out.println("Entro en la consulta?");
                    consultarSQL(sql);

                    while (resultado.next()) {
                        es = new Estancia(resultado.getInt(1), resultado.getString(4), resultado.getDate(5), resultado.getDate(6));
                        System.out.println(es);
                    }

                    desconectarBase();
     */
    public void Punto9(String n, LocalDate fd, LocalDate fh) throws Exception {
        try {
            String sql = "select (max(id_estancias)+1) from estancias";
            int ide = IdEstancia(sql), idcl, idca;
            idcl = VerificarIdCliente();
            idca = VerificarIdCasa();
            sql = "select count(id_casa) from estancias where fecha_desde in('" + fd + "') and fecha_hasta in ('"
                    + fh + "') and id_casa=" + idca;
            int con = verificarAgregar(sql);
            if (con == 0) {
                sql = "insert into estancias(id_estancias,id_cliente,id_casa,nombre_huesped,fecha_desde,fecha_hasta) values ("+ide+","+
                        + idcl + ", " + idca + ", '" + n + "','" + fd + "','" + fh + "')";
                inserModEli(sql);
            }
            /*
      
        
        
        
        
        if(contador==0)//Se creo contador para evitar posible error 
        {
            
         
           // System.out.println("Hola");
            sql="insert into estancias(id_cliente,id_casa,nombre_huesped,fecha_desde,fecha_hasta) values ("
                +id_cliente+", "+id_casa+", '"+nombre+"','"+fecha_desde+"','"+fecha_hasta+"')";
            insertarModificarEliminar(sql);
            
            
        }
        
             */
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }

    public int IdEstancia(String sql) throws Exception {
        try {
            int ide = 0;
            consultarSQL(sql);
            while (resultado.next()) {
                ide = resultado.getInt(1);
            }
            return ide;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }

    public int verificarAgregar(String sql) throws Exception {

        try {
            consultarSQL(sql);
            int c = -1;
            while (resultado.next()) {
                c = resultado.getInt(1);
            }
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }

    public int VerificarIdCliente() throws Exception {
        try {
            Scanner l = new Scanner(System.in).useDelimiter("\n");
            String sql = "select id_clientes from clientes"; //Busco los id permitidos
            ArrayList<Integer> idclientes = new ArrayList();
            consultarSQL(sql);
            while (resultado.next()) {
                idclientes.add(resultado.getInt(1));
            }

            System.out.println("Los valores que puede ingresar son:");
            for (Integer i : idclientes) {
                System.out.println(i);
            }
            int id;
            System.out.println("Ingrese un id de cliente ");
            id = l.nextInt();
            //id = 4;
            while (!idclientes.contains(id)) {
                System.out.println("Ingrese un id ");
                id = l.nextInt();
            }

            return id;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }

    public int VerificarIdCasa() throws Exception {
        try {
            Scanner l = new Scanner(System.in).useDelimiter("\n");
            String sql = "select id_casa from casas";
            ArrayList<Integer> idcasa = new ArrayList();
            consultarSQL(sql);
            while (resultado.next()) {
                idcasa.add(resultado.getInt(1));
            }
            System.out.println("Los valores que puede ingresar son:");
            for (Integer i : idcasa) {
                System.out.println(i);
            }
            int id;
            System.out.println("Ingrese un id de Casa");
            id = l.nextInt();
            //id = 3;
            while (!idcasa.contains(id)) {
                System.out.println("Ingrese un id");
                id = l.nextInt();
            }

            return id;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al cargar tabla estancia");
        } finally {
            desconectarBase();
        }

    }
}
