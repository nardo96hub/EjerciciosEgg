/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Cliente;
import _7_AccesoBDD.Ej1.persistencia.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ServicioCliente {
      public static ArrayList<Cliente> guardarClienteJava() throws Exception
    {
        ClienteDAO cliente=new ClienteDAO();
        return cliente.cargarCliente();
    }
}
