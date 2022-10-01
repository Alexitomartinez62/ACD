package Ejercicio2;


public class TestOrdenador {
    public static void main(String[] args){
        Portatil portatil = new Portatil("256321", "128", "i5424841", 699,200);
        portatil.mostrarDatosPortatil();
        Sobremesa sobremesa = new Sobremesa("654891","64", "i359696", 599,"PCU");
        sobremesa.mostrarDatosSobremesa();
    }
}