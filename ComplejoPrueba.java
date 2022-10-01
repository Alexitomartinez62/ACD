package Ejercicio1;
public class ComplejoPrueba {

    public static void main(String[] args) {                                                 
        Complejo c1 = new Complejo(3.5, 6.2);
        Complejo c2 = new Complejo(4.2, 9.4);
        Complejo c3;
        c3 = c1.sumar(c2);
        System.out.println(c1+ " + " +c2 + " = "+c3);
    }
}
    


