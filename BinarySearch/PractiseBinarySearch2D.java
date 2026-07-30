
import java.util.*;
class PractiseBinarySearch2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={{23,25,27,32},{36,38,43,47},{50,53,56,60},{63,66,69,72}};
        System.out.println("enter the target:");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }

     static int[] binarySearch(int[][] arr,int target,int row,int cStart,int cEnd){
        while(cStart<=cEnd){
        int mid=cStart+(cEnd-cStart)/2;

        if(arr[row][mid]==target){
            return new int[] {row,mid};
        }
        else if(arr[row][mid]<target){
            cStart=mid+1;
        }
        else{
            cEnd=mid-1;
        }
    }
    return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        
        if(cols==0){
            return new int[]{-1,-1};
        }
        if(rows==1){
            return binarySearch(arr,target,rows-1,0,cols-1);
        }

        int rStart=0,rEnd=rows-1;
        int cMid=cols/2;
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(arr[mid][cMid]<target){
                  rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }
      if(arr[rStart][cMid]==target){
        return new int[]{rStart,cMid};
      }
      if(arr[rStart+1][cMid]==target){
        return new int[]{rStart+1,cMid};
      }
      else if(arr[rStart][cMid]>target && cMid-1>=0){
        return binarySearch(arr, target,rStart,0,cMid-1);
      }
      else if(arr[rStart][cMid]<target && arr[rStart][cols-1]>=target){
        return binarySearch(arr, target,rStart,cMid+1,cols-1);
      }
      else if(arr[rStart+1][cMid]>target && cMid-1>=0){
        return binarySearch(arr, target,rStart+1,0,cMid-1);
      }
      else{
        return binarySearch(arr, target,rStart+1,cMid+1,cols-1);
      }
    }
}