import java.util.*;
public class Array3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.print("the array is sorted in Ascending order");
        }
        else{
            System.out.print("The array is not sorted in Ascending order");
        }
        
    }
}