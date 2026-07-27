package ArrayAndArrayList;
import java.util.*;
public class Array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int[][] rollNo={{1,2,3},{4,5,6,7},{8,9}};
        // for(int row=0;row<rollNo.length;row++)
        // {
        //     for(int col=0;col<rollNo[row].length;col++){
        //         System.out.print(rollNo[row][col]+"  ");
        //     }
        //     System.out.println();
        // }
       int[][] rollNo=new int[3][3];
        System.out.println("enter the array elements of [3][3] array:");
        for(int row=0;row<rollNo.length;row++){//array_name.length in 2d array is always the length of row
            for(int col=0;col<rollNo[row].length;col++){
                rollNo[row][col]=sc.nextInt();
            }
        }
        System.out.println("the 2D array is: ");
        for(int row=0;row<rollNo.length;row++){
            for(int col=0;col<rollNo[row].length;col++){
                System.out.print(rollNo[row][col]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
