package BinarySearchArray;
public class BinarySearchAnySortedArr {
    public static void main(String[] args){
        int[] marks={53,57,62,68,73,77,81,84,89,92,96};
        int target=0;
        System.out.println(Search(marks,target));

    }
    static int Search(int[] arr,int target){
        int start=0,end=arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                if(arr[1]<arr[2]){
                    start=mid+1;
                }
                else{
                    end=end-1;
                }
            }
            else if(target<arr[mid]){
                if(arr[1]<arr[2]){
                 end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
