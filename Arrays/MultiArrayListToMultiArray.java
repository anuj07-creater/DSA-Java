package ArrayAndArrayList.Arrays;
import java.util.*;
public class MultiArrayListToMultiArray {
 public static void main(String[] args){
  List<List<Integer>> list=new ArrayList<>();
  list.add(new ArrayList<>(List.of(1,2)));
  list.add(new ArrayList<>(List.of(5,8)));
  list.add(new ArrayList<>(List.of(9,1)));
  list.add(new ArrayList<>(List.of(4,1)));
  System.out.println("list: "+list);
  int[][] arr=new int[list.size()][];
  for(int i=0;i<list.size();i++){
     arr[i]=new int[list.get(i).size()];
     for(int j=0;j<list.get(i).size();j++){
        arr[i][j]=list.get(i).get(j);
     }
     System.out.println(Arrays.toString(arr[i]));
  }
  System.out.println("array: "+Arrays.deepToString(arr));
 }   
}
