class SubmarineKiller {
    public static void main(String[] args) {
        System.out.println("Invoking main in SubmarineKiller");

        Submarine submarine = new Submarine();
        System.out.println("Company Name: " + submarine.companyName);
        System.out.println("Max Depth: " + submarine.maxDepth);
        System.out.println("Price: " + submarine.price);
        System.out.println("=============================");

        Submarine submarine1 = new Submarine("Nautilus", 1000, 5000000);
        System.out.println("Company Name: " + submarine1.companyName);
        System.out.println("Max Depth: " + submarine1.maxDepth);
        System.out.println("Price: " + submarine1.price);
    }
}

class Submarine {
    String companyName;
    int maxDepth;
    int price;

    Submarine() {
        System.out.println("Invoking no-argument constructor in Submarine");
        this.companyName = "OceanTech";
        this.maxDepth = 500;
        this.price = 10000000;
    }

    Submarine(String companyName, int maxDepth, int price) {
        System.out.println("Invoking String, int, int constructor in Submarine");
        this.companyName = companyName;
        this.maxDepth = maxDepth;
        this.price = price;
    }
}
