class RocketKiller {
    public static void main(String[] args) {
        System.out.println("Invoking main in RocketKiller");

        Rocket rocket = new Rocket();
        System.out.println("Company Name: " + rocket.companyName);
        System.out.println("Thrust: " + rocket.thrust);
        System.out.println("Price: " + rocket.price);
        System.out.println("=============================");

        Rocket rocket1 = new Rocket("Falcon 9", 1000000, 60000000);
        System.out.println("Company Name: " + rocket1.companyName);
        System.out.println("Thrust: " + rocket1.thrust);
        System.out.println("Price: " + rocket1.price);
    }
}

class Rocket {
    String companyName;
    int thrust;
    int price;

    Rocket() {
        System.out.println("Invoking no-argument constructor in Rocket");
        this.companyName = "SpaceX";
        this.thrust = 500000;
        this.price = 50000000;
    }

    Rocket(String companyName, int thrust, int price) {
        System.out.println("Invoking String, int, int constructor in Rocket");
        this.companyName = companyName;
        this.thrust = thrust;
        this.price = price;
    }
}
