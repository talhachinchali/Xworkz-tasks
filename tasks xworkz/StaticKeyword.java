public class StaticKeyword {
    static int a;
    public static void main(String[] args){
        
      StaticKeyword obj=new StaticKeyword();
      obj.a=30;
      StaticKeyword obj1=new StaticKeyword();
      obj1.a=20;
      System.out.println("obj is "+obj.a);
      System.out.println("obj1 is "+obj1.a);
      Boy boy=new Boy();
      boy.b=20;
      Boy boy1=new Boy();
      boy1.b=30;
      System.out.println(("boy is "+boy.b));
      System.out.println(("boy1 is "+boy1.b));
      
    }
   
   
}
class Boy{
    int b;
    static void  method(){
        
    System.out.println("method is running");
}
}