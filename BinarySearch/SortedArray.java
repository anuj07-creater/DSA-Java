package BinarySearchArray;
import java.util.*;
public class SortedArray {
    public static void main(String[] args){
        int[][] EmpId={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target=12;
        System.out.println(Arrays.toString(search(EmpId,target)));
    }
    static int[] binarySearch(int[][] arr,int target,int row,int cStart,int cEnd){
        int mid;
        while(cStart<=cEnd){
            mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]>target){
                cEnd=mid-1;
            }
            else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int cols=arr[0].length;
        int rows=arr.length;
        int rStart=0,rEnd=rows-1;
        int cMid=cols/2;

        if(cols==0){
            return new int[]{-1,-1};
        }
        if(rows==1){
          binarySearch(arr, target, rows-1, 0, cols-1);
        }
        int mid;
        while(rStart<rEnd-1){
            mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(arr[mid][cMid]>target){
                rEnd=mid;
            }
            else{
                rStart=mid;
            }
        }

        // if(target==arr[rStart][cMid]){
        //     return new int[]{rStart,cMid};
        // }
         if(target==arr[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        else if(target<=arr[rStart][cMid-1]){
            return binarySearch(arr, target, rStart,0, cMid-1);
        }
       else if(target<=arr[rStart][cols-1]&&target>=arr[rStart][cMid]){
            return binarySearch(arr, target, rStart,cMid+1, cols-1);
        }
       else  if(target<=arr[rStart+1][cMid-1]){
            return binarySearch(arr, target, rStart+1, 0, cMid-1);
        }
        else{
            return binarySearch(arr, target, rStart+1, cMid+1, cols-1);
        }
    }
}
