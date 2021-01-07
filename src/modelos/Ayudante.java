package modelos;



public class Ayudante extends Estudiante{
    //APLICANDO REFACTORING - Replace Delegation with Inheritance.

    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
