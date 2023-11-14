import java.util.*;
public class Question5{
    public static boolean Eligible(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.print(Eligible(age));
    }
}