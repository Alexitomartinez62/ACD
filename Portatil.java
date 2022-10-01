package Ejercicio2;

public class Portatil extends Ordenador  {

    public Portatil(String sCodigo, String aRam, String vCpu, double aPrecio) {
        super(sCodigo, aRam, vCpu, aPrecio);
        //TODO Auto-generated constructor stub
    }
    

    private double peso;

    public Portatil(String sCodigo, String aRam, String vCpu, double aPrecio, double peso) {
        super(sCodigo, aRam, vCpu, aPrecio);
        this.peso = peso;
    }
    public void mostrarDatosPortatil(){
        System.out.println("Codigo: "+getsCodigo()+
                            "\nRAM : "+getaRam()+
                            "\nCPU : "+getvCpu()+
                            "\nPrecio : "+getaPrecio()+
                            "\nPeso :"+peso);
    }

}