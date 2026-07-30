package ArrayAndArrayList.Arrays;
import java.util.*;

public class ArrayShuffleLeedcode {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array: ");
     int i=sc.nextInt();
     int[] nums= new int[i];
    System.out.println("enter the array:");
     for(int a=0;a<nums.length;a++){
        nums[a]=sc.nextInt();
     }
     
     int[] out= new int[nums.length];
        for(int b=0;b<(nums.length/2);b++){
            int x=nums[b];
            out[b*2]=x;
            out[(b*2)+1]=nums[(nums.length%2)+b];
        }
        for(int c=0;c<nums.length;c++){
            System.out.print(out[c]+"");
        }
    }
    
}
