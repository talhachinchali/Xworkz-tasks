public class Metro {
    String line;
    String city;
    int numberOfStations;
    boolean hasWifi;
    double fare;

    public static void main(String[] args) {
        Metro metro1 = new Metro();
        System.out.println(metro1.line);
        System.out.println(metro1.city);
        System.out.println(metro1.numberOfStations);
        System.out.println(metro1.hasWifi);
        System.out.println(metro1.fare);

        metro1.line = "Red Line";
        metro1.city = "City Bangalore";
        metro1.numberOfStations = 20;
        metro1.hasWifi = true;
        metro1.fare = 2.50;

        System.out.println("================After Update===================");
        System.out.println(metro1.line);
        System.out.println(metro1.city);
        System.out.println(metro1.numberOfStations);
        System.out.println(metro1.hasWifi);
        System.out.println(metro1.fare);

        System.out.println("**************This is for Second Instance*****************");
        Metro metro2 = new Metro();
        System.out.println(metro2.line);
        System.out.println(metro2.city);
        System.out.println(metro2.numberOfStations);
        System.out.println(metro2.hasWifi);
        System.out.println(metro2.fare);

        metro2.line = "Blue Line";
        metro2.city = "City Kolkata";
        metro2.numberOfStations = 15;
        metro2.hasWifi = false;
        metro2.fare = 2.00;

        System.out.println("================After Update===================");
        System.out.println(metro2.line);
        System.out.println(metro2.city);
        System.out.println(metro2.numberOfStations);
        System.out.println(metro2.hasWifi);
        System.out.println(metro2.fare);
    }
}
