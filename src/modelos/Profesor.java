package modelos;

public class Profesor extends IntegrantParalel{
    public String codigo;
    public int añosdeTrabajo;
    public double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.codigo = codigo;
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
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public double calcularSueldo(){
        return añosdeTrabajo*600 + BonoFijo;
    } 
    
}
