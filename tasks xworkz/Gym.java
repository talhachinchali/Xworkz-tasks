public class Gym {
    String name;
    String location;
    int capacity;
    boolean hasPool;
    double membershipFee;

    public static void main(String[] args) {
        Gym gym1 = new Gym();
        System.out.println(gym1.name);
        System.out.println(gym1.location);
        System.out.println(gym1.capacity);
        System.out.println(gym1.hasPool);
        System.out.println(gym1.membershipFee);

        gym1.name = "FitZone";
        gym1.location = "City Bangalore";
        gym1.capacity = 100;
        gym1.hasPool = true;
        gym1.membershipFee = 50.0;

        System.out.println("================After Update===================");
        System.out.println(gym1.name);
        System.out.println(gym1.location);
        System.out.println(gym1.capacity);
        System.out.println(gym1.hasPool);
        System.out.println(gym1.membershipFee);

        System.out.println("**************This is for Second Instance*****************");
        Gym gym2 = new Gym();
        System.out.println(gym2.name);
        System.out.println(gym2.location);
        System.out.println(gym2.capacity);
        System.out.println(gym2.hasPool);
        System.out.println(gym2.membershipFee);

        gym2.name = "PowerFit";
        gym2.location = "City Kolkata";
        gym2.capacity = 150;
        gym2.hasPool = false;
        gym2.membershipFee = 40.0;

        System.out.println("================After Update===================");
        System.out.println(gym2.name);
        System.out.println(gym2.location);
        System.out.println(gym2.capacity);
        System.out.println(gym2.hasPool);
        System.out.println(gym2.membershipFee);
    }
}
