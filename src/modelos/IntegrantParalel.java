/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Kevin Chevez pc
 */
public abstract class IntegrantParalel {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;
    protected String telefono;
    protected ArrayList<Paralelo> paralelos;
    protected String facultad;


    public IntegrantParalel(String nombre, String apellido, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }

    public IntegrantParalel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    
    
    
     /**
     * Calcula calificación. El teorico y el practico se calcula por parcial.
     * @param p
     * @param nexamen
     * @param ndeberes
     * @param nlecciones
     * @param ntalleres
     * @return Devuelve la nota inicial contando examen, deberes, lecciones y 
     * talleres.
     */
    public double CalcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaInicial=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaInicial=notaTeorico+notaPractico;
            }
        }
        return notaInicial;
    }
   
    /**
     * Calcula calificacion. Esta nota es solo el 
     * promedio de las dos calificaciones anteriores.
     * @param p
     * @return Devuelve la nota contando examen, deberes, lecciones y 
     * talleres.
     */
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
            }
        }
        return notaTotal;
    }
}
