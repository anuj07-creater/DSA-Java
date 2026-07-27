package ArrayAndArrayList;
import java.util.*;
public class Array {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int[] rollNo= new int[5];
      System.out.println("enter the 5 roll number: ");
      for(int i=0;i<rollNo.length;i++){
      rollNo[i]=sc.nextInt();
      }
      System.out.println("roll numbers are:");
      for(int i=0;i<rollNo.length;i++){
        System.out.println(" "+rollNo[i]);
      }
    // int[] arr={1,2,3,4};
    // for(int i=0;i<=3;i++){
    //     System.out.println(arr[i]);
    // }
    sc.close();
    }
    
}
