import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1;i<=(num+(num-1));i+=2){
        System.out.print(i);
        if(num%2==0&&i!=(num+(num-1)))
        System.out.print(",");
        if(i!=(num+(num-1))&&num%2!=0)
        System.out.print(",");
        }


}
}