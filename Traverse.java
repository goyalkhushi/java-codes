import java.util.*;
public class Traverse{
    public static void Main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
         int cols=sc.nextInt();
         int[][] numbers= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.print("x is found at indices("+i+","+j+")");
                }
            
            }
        }sc.close;
    }
}