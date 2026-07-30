package BinarySearchArray;
public class BinarySearchFlooring {
    public static void main(String[] args){
        int[] marks={2,3,5,9,14,16,18};
        int target=17;
        System.out.print(Flooring(marks,target));
    }
    static int Flooring(int[] arr,int target){
      if(arr[0]>arr[arr.length-1]){
        if(arr.length==0 || arr[0]<target){
            return -1;
        }
      }
      else{
        if(arr.length==0 || arr[0]>target){
          return -1;
        }
      }
        int mid,start=0,end=arr.length-1,ans;
        while(start<=end){
          mid=start+(end-start)/2;
          if(target<arr[mid]){
            if(arr[0]>arr[arr.length-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
          }
          else if(target>arr[mid]){
            if(arr[0]>arr[arr.length-1]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
          }
          else{
            return arr[mid];
          }
        }
        // mid=start+(end-start)/2;
        // if(arr[mid]>target){
        //   ans=arr[mid-1];
        //   return ans;
        
        // }
        // else{
        //    ans=arr[mid];
        //    return ans;
        // }
        return arr[end];
    }
}
