package _7_AccesoBDD.Ej1.entidades;

public class Familia {

    private int id;
    private String nombre;
    private int edad_min;
    private int edad_max;
    private int num_hijos;
    private String email;

    public Familia() {
    }

    public Familia(int id, String nombre, int edad_min, int edad_max, int num_hijos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad_min = edad_min;
        this.edad_max = edad_max;
        this.num_hijos = num_hijos;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_min() {
        return edad_min;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    public int getEdad_max() {
        return edad_max;
    }

    public void setEdad_max(int edad_max) {
        this.edad_max = edad_max;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Familia{" + "id=" + id + ", nombre=" + nombre + ", edad_min=" + edad_min + ", edad_max=" + edad_max + ", num_hijos=" + num_hijos + ", email=" + email + '}';
    }
    
    
}

