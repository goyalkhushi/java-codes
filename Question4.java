import java.util.*;
public class Question4{
    public  static double getCircumference(int r){
        return 2*3.14*r;
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(getCircumference(r));
        double r=sc.nextDouble();
        System.out.print(getCircumference(r));
    }
}