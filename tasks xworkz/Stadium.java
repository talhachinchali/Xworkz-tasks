public class Stadium {
    String name;
    String location;
    int capacity;
    boolean hasRoof;
    double ticketPrice;

    public static void main(String[] args) {
        Stadium stadium1 = new Stadium();
        System.out.println(stadium1.name);
        System.out.println(stadium1.location);
        System.out.println(stadium1.capacity);
        System.out.println(stadium1.hasRoof);
        System.out.println(stadium1.ticketPrice);

        stadium1.name = "Chinnaswami Stadium";
        stadium1.location = "City bangalore";
        stadium1.capacity = 50000;
        stadium1.hasRoof = true;
        stadium1.ticketPrice = 50.0;

        System.out.println("================After Update===================");
        System.out.println(stadium1.name);
        System.out.println(stadium1.location);
        System.out.println(stadium1.capacity);
        System.out.println(stadium1.hasRoof);
        System.out.println(stadium1.ticketPrice);

        System.out.println("**************This is for Second Instance*****************");
        Stadium stadium2 = new Stadium();
        System.out.println(stadium2.name);
        System.out.println(stadium2.location);
        System.out.println(stadium2.capacity);
        System.out.println(stadium2.hasRoof);
        System.out.println(stadium2.ticketPrice);

        stadium2.name = "hidden garden Stadium";
        stadium2.location = "City Mumbai";
        stadium2.capacity = 70000;
        stadium2.hasRoof = false;
        stadium2.ticketPrice = 75.0;

        System.out.println("================After Update===================");
        System.out.println(stadium2.name);
        System.out.println(stadium2.location);
        System.out.println(stadium2.capacity);
        System.out.println(stadium2.hasRoof);
        System.out.println(stadium2.ticketPrice);
    }
}
