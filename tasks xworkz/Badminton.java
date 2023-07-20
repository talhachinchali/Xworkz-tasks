public class Badminton {
    String brand;
    String racketType;
    int weight;
    boolean isProfessionalGrade;
    double price;

    public static void main(String[] args) {
        Badminton racket1 = new Badminton();
        System.out.println(racket1.brand);
        System.out.println(racket1.racketType);
        System.out.println(racket1.weight);
        System.out.println(racket1.isProfessionalGrade);
        System.out.println(racket1.price);

        racket1.brand = "Yonex";
        racket1.racketType = "Carbon Fiber";
        racket1.weight = 85;
        racket1.isProfessionalGrade = true;
        racket1.price = 199.99;

        System.out.println("================After Update===================");
        System.out.println(racket1.brand);
        System.out.println(racket1.racketType);
        System.out.println(racket1.weight);
        System.out.println(racket1.isProfessionalGrade);
        System.out.println(racket1.price);

        System.out.println("**************This is for Second Instance*****************");
        Badminton racket2 = new Badminton();
        System.out.println(racket2.brand);
        System.out.println(racket2.racketType);
        System.out.println(racket2.weight);
        System.out.println(racket2.isProfessionalGrade);
        System.out.println(racket2.price);

        racket2.brand = "Li-Ning";
        racket2.racketType = "Graphene";
        racket2.weight = 88;
        racket2.isProfessionalGrade = false;
        racket2.price = 129.99;

        System.out.println("================After Update===================");
        System.out.println(racket2.brand);
        System.out.println(racket2.racketType);
        System.out.println(racket2.weight);
        System.out.println(racket2.isProfessionalGrade);
        System.out.println(racket2.price);
    }
}
