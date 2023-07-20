public class Marks{
    public static void main(String[] args){
    int[] marks_raju={20,30,40,50};
    calculate(marks_raju);
    }
    
   static void calculate(int[] markss){
    for(int i=0;i<markss.length;i++){
    if(markss[i]>0){
    System.out.println("passed the subject");
    }
    }
    }
    
    }
    
    