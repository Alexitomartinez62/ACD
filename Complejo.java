package Ejercicio1;
public class Complejo {
    private double dPReal;
    private double dPImag;

  
    //Constructores
    public Complejo() {
   
    }
    public Complejo(double dPReal, double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }



    //Getters and Setters
    public double getImag() {
        return dPImag;
    }

    public void setImag(double dPImag) {
        this.dPImag = dPImag;
    }

    public double getReal() {
        return dPReal;
    }

    public void setReal(double real) {
        this.dPReal = real;
    }
   
    //Suma de numeros
    public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.dPReal = dPReal + c.dPReal;
        aux.dPImag = dPImag + c.dPImag;
        return aux;
    }
   


    @Override
    public String toString() {
        return "(" + dPReal + ", " + dPImag + ")";
    }

   
}