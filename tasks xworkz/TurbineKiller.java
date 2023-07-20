class TurbineKiller {
    public static void main(String[] args) {
        System.out.println("Invoking main in TurbineKiller");

        Turbine turbine = new Turbine();
        System.out.println("Manufacturer: " + turbine.manufacturer);
        System.out.println("Capacity: " + turbine.capacity);
        System.out.println("Price: " + turbine.price);
        System.out.println("=============================");

        Turbine turbine1 = new Turbine("GE", 100, 5000000);
        System.out.println("Manufacturer: " + turbine1.manufacturer);
        System.out.println("Capacity: " + turbine1.capacity);
        System.out.println("Price: " + turbine1.price);
    }
}

class Turbine {
    String manufacturer;
    int capacity;
    int price;

    Turbine() {
        System.out.println("Invoking no-argument constructor in Turbine");
        this.manufacturer = "Default Manufacturer";
        this.capacity = 500;
        this.price = 1000000;
    }

    Turbine(String manufacturer, int capacity, int price) {
        System.out.println("Invoking String, int, int constructor in Turbine");
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.price = price;
    }
}
