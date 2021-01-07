package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public double calcularSueldo(){
        return añosdeTrabajo*600 + BonoFijo;
    } 
    
    
}
