public class WirelessController {
    String brand;
    String connectivity;
    boolean hasVibration;
    int batteryLife;
    double price;

    public static void main(String[] args) {
        WirelessController controller1 = new WirelessController();
        System.out.println(controller1.brand);
        System.out.println(controller1.connectivity);
        System.out.println(controller1.hasVibration);
        System.out.println(controller1.batteryLife);
        System.out.println(controller1.price);

        controller1.brand = "Sony";
        controller1.connectivity = "Bluetooth";
        controller1.hasVibration = true;
        controller1.batteryLife = 10;
        controller1.price = 59.99;

        System.out.println("================After Update===================");
        System.out.println(controller1.brand);
        System.out.println(controller1.connectivity);
        System.out.println(controller1.hasVibration);
        System.out.println(controller1.batteryLife);
        System.out.println(controller1.price);

        System.out.println("**************This is for Second Instance*****************");
        WirelessController controller2 = new WirelessController();
        System.out.println(controller2.brand);
        System.out.println(controller2.connectivity);
        System.out.println(controller2.hasVibration);
        System.out.println(controller2.batteryLife);
        System.out.println(controller2.price);

        controller2.brand = "Microsoft";
        controller2.connectivity = "Wireless USB";
        controller2.hasVibration = true;
        controller2.batteryLife = 15;
        controller2.price = 49.99;

        System.out.println("================After Update===================");
        System.out.println(controller2.brand);
        System.out.println(controller2.connectivity);
        System.out.println(controller2.hasVibration);
        System.out.println(controller2.batteryLife);
        System.out.println(controller2.price);
    }
}
