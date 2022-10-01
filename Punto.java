package Ejercicio4;


public class Punto {
    protected int iX;
    protected int iY;
   
    
    public Punto(int iX, int iY) {
        this.iX = iX;
        this.iY = iY;
    }
    public int getiX() {
        return iX;
      }
    
      public int getiY() {
        return iY;
      }


    public double dDistancia(Punto otroPunto) {
        double x1 = iX - otroPunto.getiX();
        double y1 = iY - otroPunto.getiY();
        return Math.sqrt(x1 * x1 + y1 * y1);
      }

      
      @Override
    public boolean equals(Object obj) {
      // TODO Auto-generated method stub
      return super.equals(obj);
    }
    public int getiZ() {
      return 0;
    }

  
}