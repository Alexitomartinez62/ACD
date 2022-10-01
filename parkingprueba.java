package Ejercicio3;

public class parkingprueba {
    public static void main(String[] args) throws Exception {
        System.out.println("Cargando Parking");
        try{
            vehiculo cocherenault= new vehiculo("5564SDF");
            vehiculo cocheferrari=new vehiculo("9758LOE");
            vehiculo cocheseat=new vehiculo("9631PWÑ");
            vehiculo cocheford=new vehiculo("2048SDE");
            vehiculo cochedacia=new vehiculo("6304PMA");
            parkingvehiculo parking1=new parkingvehiculo("IES Pio Baroja 4", 80);
            parking1.aparcaCoche(cochedacia);
            parking1.aparcaCoche(cocherenault);
            parking1.aparcaCoche(cocheferrari);
            parking1.aparcaCoche(cocheseat);
            parking1.aparcaCoche(cocheford);
            Thread.sleep(120*1000);
            parking1.sacaCoche(cochedacia);
            parking1.sacaCoche(cocheferrari);
            Thread.sleep(60*1000);
            parking1.sacaCoche(cocherenault);
            parking1.sacaCoche(cocheseat);
            Thread.sleep(60*1000);
            parking1.sacaCoche(cocheford);
            double dFacturaP=parking1.getFactura(cochedacia);
            double dFacturaM=parking1.getFactura(cocheferrari);
            double dFacturaO=parking1.getFactura(cocherenault);
            double dFacturaC=parking1.getFactura(cocheseat);
            double dFacturaS=parking1.getFactura(cocheford);
            System.out.println("El Dacia tiene que pagar="+dFacturaP+
            "\nEl Ferrari tiene que pagar="+dFacturaM+ 
            "\nEl Renault tiene que pagar="+dFacturaO+
            "\nEl Seat tiene que pagar="+dFacturaC+ 
            "\nEl Ford tiene que pagar="+dFacturaS);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
