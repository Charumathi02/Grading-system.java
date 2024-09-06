import java.util.Scanner;
public class Score {
    public static void main(String[] args) throws Exception {
       int score;
       Scanner sc=new Scanner(System.in);
       score =sc.nextInt();
       if(score>90){
        System.out.println("A");
       }
       else if(score >=80 && score<=89){
        System.out.println("B");
       }
       else if(score >=70 && score<=79){
        System.out.println("B");
       }
       else if(score >=60 && score<=69){
        System.out.println("B");
       }
       else{
        System.out.println("F");
       }
    }
}

