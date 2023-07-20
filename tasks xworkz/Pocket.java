public class Pocket {
    String material;
    int depth;
    boolean hasZipper;
    int width;
    boolean isInnerPocket;

    public static void main(String[] args) {
        Pocket pocket1 = new Pocket();
        System.out.println(pocket1.material);
        System.out.println(pocket1.depth);
        System.out.println(pocket1.hasZipper);
        System.out.println(pocket1.width);
        System.out.println(pocket1.isInnerPocket);

        pocket1.material = "Cotton";
        pocket1.depth = 10;
        pocket1.hasZipper = true;
        pocket1.width = 12;
        pocket1.isInnerPocket = false;

        System.out.println("================After Update===================");
        System.out.println(pocket1.material);
        System.out.println(pocket1.depth);
        System.out.println(pocket1.hasZipper);
        System.out.println(pocket1.width);
        System.out.println(pocket1.isInnerPocket);

        System.out.println("**************This is for Second Instance*****************");
        Pocket pocket2 = new Pocket();
        System.out.println(pocket2.material);
        System.out.println(pocket2.depth);
        System.out.println(pocket2.hasZipper);
        System.out.println(pocket2.width);
        System.out.println(pocket2.isInnerPocket);

        pocket2.material = "Leather";
        pocket2.depth = 8;
        pocket2.hasZipper = false;
        pocket2.width = 10;
        pocket2.isInnerPocket = true;

        System.out.println("================After Update===================");
        System.out.println(pocket2.material);
        System.out.println(pocket2.depth);
        System.out.println(pocket2.hasZipper);
        System.out.println(pocket2.width);
        System.out.println(pocket2.isInnerPocket);
    }
}
