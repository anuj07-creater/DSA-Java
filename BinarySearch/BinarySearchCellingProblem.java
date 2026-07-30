package BinarySearchArray;
public class BinarySearchCellingProblem {  
    public static void main(String[] args){
        int[] marks={96,92,89,84,81,77,73,68,62,57,53};
        int target=1000;
        int a=Search(marks,target);
        System.out.println(a);
        //System.out.print(Celling(marks,target,a));

    }
    static int Search(int[] arr,int target){
        int start=0,end=arr.length-1,mid;
        if(arr[0]<arr[arr.length-1]){
        if(arr.length==0 || arr[arr.length-1]<target){
            return -1;
        }
    }
    else{
        if (arr.length==0 || arr[arr.length-1]>target) {
            return -1;
        }
    }
        while(start<=end){
             mid=start+(end-start)/2;
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
             else {
                return arr[mid];
            }
        }
        return arr[start];
        // mid=start+(end-start)/2;

        // int ans;
        // if(target>arr[mid]){
        //     ans=arr[mid+1];
        //     return ans;
        // }
        // else if(target>arr[arr.length-1]){
            
        //     return -1;
        // }
        // else{
        //     ans=arr[mid];
        //     return ans;
        //}
    }
   
}