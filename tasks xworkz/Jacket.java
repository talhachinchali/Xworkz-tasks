public class Jacket {
    String color;
    String size;
    String material;
    double price;
    boolean hasHood;

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket();
        System.out.println(jacket1.color);
        System.out.println(jacket1.size);
        System.out.println(jacket1.material);
        System.out.println(jacket1.price);
        System.out.println(jacket1.hasHood);

        jacket1.color = "Blue";
        jacket1.size = "Medium";
        jacket1.material = "Cotton";
        jacket1.price = 49.99;
        jacket1.hasHood = true;

        System.out.println("================After Update===================");
        System.out.println(jacket1.color);
        System.out.println(jacket1.size);
        System.out.println(jacket1.material);
        System.out.println(jacket1.price);
        System.out.println(jacket1.hasHood);

        System.out.println("**************This is for Second Instance*****************");
        Jacket jacket2 = new Jacket();
        System.out.println(jacket2.color);
        System.out.println(jacket2.size);
        System.out.println(jacket2.material);
        System.out.println(jacket2.price);
        System.out.println(jacket2.hasHood);

        jacket2.color = "Black";
        jacket2.size = "Large";
        jacket2.material = "Leather";
        jacket2.price = 99.99;
        jacket2.hasHood = false;

        System.out.println("================After Update===================");
        System.out.println(jacket2.color);
        System.out.println(jacket2.size);
        System.out.println(jacket2.material);
        System.out.println(jacket2.price);
        System.out.println(jacket2.hasHood);
    }
}
