public class Electrician {
    public static void main(String[] args){
        System.out.println("Running electrician in main");
        Electrician1.fixWiring();
        Electrician1.fixWiring("Living Room");
        Electrician1.installLighting();
        Electrician1.installLighting("Kitchen");
        Electrician1.replaceOutlet("Bedroom");
        Electrician1.replaceOutlet("Bathroom", 2);
        Electrician1.testCircuit("Basement");
        Electrician1.name("Mark");
        Electrician1.place("New York");
    }
}

 class Electrician1 {
    static void fixWiring() {
        System.out.println("The electrician is fixing the wiring");
    }
    static void place(String place){
        System.out.println("electriacian place is:"+place);
    }

    static void fixWiring(String location) {
        System.out.println("The electrician is fixing the wiring in the " + location);
    }

    static void installLighting() {
        System.out.println("The electrician is installing lighting fixtures");
    }

    static void installLighting(String location) {
        System.out.println("The electrician is installing lighting fixtures in the " + location);
    }

    static void replaceOutlet(String location) {
        System.out.println("The electrician is replacing the outlet in the " + location);
    }

    static void replaceOutlet(String location, int quantity) {
        System.out.println("The electrician is replacing " + quantity + " outlets in the " + location);
    }

    static void testCircuit(String location) {
        System.out.println("The electrician is testing the circuit in the " + location);
    }
    
    static void name(String name){
        System.out.println("Electrician's name is " + name);
    }
}
