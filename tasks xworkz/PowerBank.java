public class PowerBank {
    String brand;
    int capacity;
    double voltage;
    boolean isFastChargingSupported;
    double price;
    int i;
    public static void main(String[] args) {
       PowerBank p=new PowerBank();
       
        System.out.println(p.i);
        PowerBank powerbank1 = new PowerBank();
        System.out.println(powerbank1.brand);
        System.out.println(powerbank1.capacity);
        System.out.println(powerbank1.voltage);
        System.out.println(powerbank1.isFastChargingSupported);
        System.out.println(powerbank1.price);

        powerbank1.brand = "Anker";
        powerbank1.capacity = 10000;
        powerbank1.voltage = 5.0;
        powerbank1.isFastChargingSupported = true;
        powerbank1.price = 29.99;

        System.out.println("================After Update===================");
        System.out.println(powerbank1.brand);
        System.out.println(powerbank1.capacity);
        System.out.println(powerbank1.voltage);
        System.out.println(powerbank1.isFastChargingSupported);
        System.out.println(powerbank1.price);

        System.out.println("**************This is for Second Instance*****************");
        PowerBank powerbank2 = new PowerBank();
        System.out.println(powerbank2.brand);
        System.out.println(powerbank2.capacity);
        System.out.println(powerbank2.voltage);
        System.out.println(powerbank2.isFastChargingSupported);
        System.out.println(powerbank2.price);

        powerbank2.brand = "RAVPower";
        powerbank2.capacity = 20000;
        powerbank2.voltage = 5.0;
        powerbank2.isFastChargingSupported = true;
        powerbank2.price = 39.99;

        System.out.println("================After Update===================");
        System.out.println(powerbank2.brand);
        System.out.println(powerbank2.capacity);
        System.out.println(powerbank2.voltage);
        System.out.println(powerbank2.isFastChargingSupported);
        System.out.println(powerbank2.price);
    }
}
