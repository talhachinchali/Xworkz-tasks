public class Camera {
    static void click(String city,int date,double d,String quality,String name){
        System.out.println("city is "+ city);
        if(date>0){
            System.out.println("date is +"+date);
        }
        if(d>0){
            System.out.println("people are "+d);
        }
        System.out.println(("quality of camera is "+quality));
        System.out.println("user of camera is "+name);

    }
}
