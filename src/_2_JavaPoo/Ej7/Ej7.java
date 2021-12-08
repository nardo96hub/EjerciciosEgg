package _2_JavaPoo.Ej7;

public class Ej7 {

    public static void main(String[] args) {
        int Totalp=0;
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)a[i]=0;
       
        Persona p1 = new Persona("Jorge", 15, "H", 75.0, 1.75);
        Persona p2 = new Persona("Martin", 18, "M", 90.6, 1.60);
        Persona p3 = new Persona("Jorge", 15, "H", 100.0, 1.90);
        Persona p4 = new Persona();
        p4 = p4.crearPersona();
        Totalp = 4;
        S s=new S();
        s.contador(p1, a);
         s.contador(p2, a);
          s.contador(p3, a);
           s.contador(p4, a);
           s.mostrar(a, Totalp);
        
        /*switch (p1.calcularMC()) {
            case -1:
                pd++;
                break;
            case 0:
                pi++;
                break;
            case 1:
                pe++;
                break;

        }
        switch (p2.calcularMC()) {
            case -1:
                pd++;
                break;
            case 0:
                pi++;
                break;
            case 1:
                pe++;
                break;

        }
        switch (p3.calcularMC()) {
            case -1:
                pd++;
                break;
            case 0:
                pi++;
                break;
            case 1:
                pe++;
                break;

        }
        switch (p4.calcularMC()) {
            case -1:
                pd++;
                break;
            case 0:
                pi++;
                break;
            case 1:
                pe++;
                break;

        }

        if (p1.esMayordeEdad()) {
            may++;
        }
        if (p2.esMayordeEdad()) {
            may++;
        }
        if (p3.esMayordeEdad()) {
            may++;
        }
        if (p4.esMayordeEdad()) {
            may++;
        }

        System.out.println("La cantidad de un total de " + Totalp + " personas que estan por debajo de su peso es " + (pd * 100 / Totalp)+"%");
        System.out.println("La cantidad de un total de " + Totalp + " personas que estan en su  peso ideal es " + (pi * 100 / Totalp)+"%");
        System.out.println("La cantidad de un total de " + Totalp + " personas que estan por encima de su peso es " + (pe * 100 / Totalp)+"%");
        System.out.println("El porcentaje de personas mayores de edad es:" + (may * 100 / (Totalp))+"%");
        System.out.println("El porcentaje de personas menores de edad es:" + ((Totalp - may) * 100 / (Totalp))+"%");*/
    }

}
