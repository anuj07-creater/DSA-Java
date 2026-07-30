package BinarySearchArray;
class BinarySearch{
    public static void main(String[] args){
      int[] rollNo={2,5,8,12,15,18,45,77,84,92};
      int target=15;
      System.out.print(Search(rollNo,target));
    }
    static int Search(int[] arr,int target){
      int start=0,end=arr.length-1,mid;
      while(start<=end){
         mid=start+(end-start)/2;
        if(arr[mid]>target){
          if(arr[0]<arr[arr.length-1]){
            end=mid-1;
          }
          else {
            start=mid+1;
          }
        }
        else if(arr[mid]<target){
          if(arr[0]<arr[arr.length-1]){
            start=mid+1;
          }
            else{
              end=mid-1;
            }
        }
        else{
            return mid;
        }
      }
      return -1;
    }
}