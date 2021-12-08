
package _7_AccesoBDD.Ej1.servicio;

import _7_AccesoBDD.Ej1.entidades.Casa;
import _7_AccesoBDD.Ej1.entidades.Cliente;
import _7_AccesoBDD.Ej1.entidades.Comentario;
import _7_AccesoBDD.Ej1.entidades.Estancia;
import _7_AccesoBDD.Ej1.entidades.Familia;
import _7_AccesoBDD.Ej1.entidades.Generico;
import _7_AccesoBDD.Ej1.entidades.ObjArreglo;

import _7_AccesoBDD.Ej1.persistencia.DAO;





import java.util.Map;
import java.util.Scanner;


public class Consultas extends DAO {

    private ObjArreglo resul = new ObjArreglo();

    private void CargarEntidad() throws Exception {
        for (int i = 0; i < 5; i++) {
            Generico n = new Generico();
            switch (i) {
                case 0:
                   // n.setObj(ServicioCasa.guardarCasaJava().getClass());
                    n.setObj(new Casa());
                    n.setResul(ServicioCasa.guardarCasaJava());

                    resul.getConsultas().put("Casa", n);
                    break;
                case 1:
                    n=new Generico();
                   // n.setObj(ServicioCliente.guardarClienteJava().getClass());
                    n.setObj(new Cliente());
                    n.setResul(ServicioCliente.guardarClienteJava());
                    resul.getConsultas().put("Cliente", n);
                    break;
                case 2:
                    n=new Generico();
                   // n.setObj(ServicioComentario.guardarComentarioJava().getClass());
                    n.setObj(new Comentario());
                    n.setResul(ServicioComentario.guardarComentarioJava());
                    resul.getConsultas().put("Comentario", n);
                    break;
                case 3:
                    n=new Generico();
                    //n.setObj(ServicioEstancia.guardarEstanciaJava().getClass());
                    n.setObj(new Estancia());
                    n.setResul(ServicioEstancia.guardarEstanciaJava());
                    resul.getConsultas().put("Estancia", n);
                    break;
                case 4:
                    n=new Generico();
                   // n.setObj(ServicioFamilia.guardarFamiliaJava().getClass());
                    n.setObj(new Familia());
                    n.setResul(ServicioFamilia.guardarFamiliaJava());
                    resul.getConsultas().put("Familia", n);
                    break;

            }

        }

    }

    public void consultas() throws Exception {
        String resp = "";
    

        int op;
        Scanner l = new Scanner(System.in).useDelimiter("\n");
        //do {
        for (op = 1; op < 9; op++) {
            /* System.out.println("*****MENU DE OPCIONES******");
            System.out.println("1.Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.");
            System.out.println("2. Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.");
            System.out.println("3. Imagínate que, como cliente, estás interesado en mandar a tu hijo a una familia, de la que únicamente recuerdas que su nombre familiar terminaba en ‘y’. Escribe la consulta que te recupere las familias que cumplan tus restricciones.");
            System.out.println("4.Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.");
            System.out.println("5.Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico.");
            System.out.println("6.Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios actualizados.");
            System.out.println("7.Obtener el número de casas que existen para cada uno de los países diferentes.");
            System.out.println("8.Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’.");
            System.out.println("9.Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.");

            System.out.println("\nIngrese una Opcion entre [1,9]");
            op = l.nextInt();
            while (op < 1 || op > 9) {
                System.out.println("\nIngrese una Opcion entre [1,9]");
                op = l.nextInt();
            }*/
            switch (op) {
                case 1: {
                    System.out.println("Entro en consulta 1");
                    Generico n = new Generico();
                 
                    n.setObj(ServicioFamilia.consultaPunto1().getClass());
                    n.setResul(ServicioFamilia.consultaPunto1());
                 
                    resul.getConsultas().put("Consulta1", n);
                   
                    //System.out.println(resul.getConsultas().get);
                    System.out.println("Salio de consulta 1");
                }
                break;
                case 2: {
                    System.out.println("Entro en consulta 2");
                    
                    Generico n = new Generico();
                    n.setObj(new Casa());
                  // n.setObj(ServicioCasa.consultaPunto2().getClass());
                    n.setResul(ServicioCasa.consultaPunto2());
                    resul.getConsultas().put("Consulta2", n);
                    System.out.println("Salio de consulta 2");
                }
                break;
                case 3: {
                    System.out.println("Entro 3");
                 
                    Generico n = new Generico();
                    n.setObj(new Familia());
                    //n.setObj(ServicioFamilia.consultaPunto3().getClass());
                    n.setResul(ServicioFamilia.consultaPunto3());
                    resul.getConsultas().put("Consulta3", n);
                    System.out.println("Salgo 3");
                }
                break;
                case 4: {
                    System.out.println("Entro 4");
                   
                    Generico n = new Generico();
                    //n.setObj(ServicioFamilia.consultaPunto4().getClass());
                     n.setObj(new Familia());
                    n.setResul(ServicioFamilia.consultaPunto4());
                    resul.getConsultas().put("Consulta4", n);
                    System.out.println("Salgo 4");
                }
                break;
                case 5: {
                  
                    Generico n = new Generico();
                     n.setObj(new Casa());
                    //n.setObj(ServicioCasa.consultaPunto5().getClass());
                    n.setResul(ServicioCasa.consultaPunto5());
                    resul.getConsultas().put("Consulta5", n);
                }
                break;
                case 6: {
                
                    ServicioCasa.consultaPunto6();
                }
                break;
                case 7: {
                   
                    ServicioCasa.consultaPunto7();

                }
                break;
                case 8: {
                    
                    
                    Generico n = new Generico();
                   // n.setObj(ServicioCasa.consultaPunto8().getClass());
                   n.setObj(new Casa());
                    n.setResul(ServicioCasa.consultaPunto8());
                    resul.getConsultas().put("Consulta8", n);

                }
                break;
                case 9: {
                  
                    ServicioEstancia.consultaPunto9();

                }
                break;
            }
            /* System.out.println("\nDesea ingresar otra opcion?");
            resp = l.next();*/

        } //while (resp.equalsIgnoreCase("s"));
        CargarEntidad();
        imprimirResultados();
    }

    public void imprimirResultados() {
        System.out.println("Resultados extraidos de la base de datos:\n");
        for (Map.Entry<String, Generico> e : resul.getConsultas().entrySet()) {
            System.out.println("\n"+e.getKey());
            System.out.println("-----------\n");
            for (Object object : e.getValue().getResul()) {
                System.out.println(object);
            }
        }
    }
}
