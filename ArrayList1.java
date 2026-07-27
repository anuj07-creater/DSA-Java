package ArrayAndArrayList;
import java.util.*;
public class ArrayList1 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> roll= new ArrayList<>();
        for(int i=0;i<3;i++){
            roll.add(new ArrayList<>());
        }
        System.out.println("enter the nine roll number:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                roll.get(i).add(sc.nextInt());
            }
        }
        System.out.println(roll);
        System.out.println("enter the nested arraylist in which you want to add element:");
        int i=sc.nextInt();
        System.out.println("enter the index & element at which you want to add: ");
        int j=sc.nextInt();
        int e=sc.nextInt();
        roll.get(i).add(j,e);
        System.out.println("updated array:"+roll);
        System.out.println("enter the nested arraylist in which you want to set element:");
        int a=sc.nextInt();
        System.out.println("enter the index & element at which you want to set: ");
        int b=sc.nextInt();
        int c=sc.nextInt();
        roll.get(a).set(b,c);
        System.out.println("updated array:"+roll);
        sc.close();
    }
}

