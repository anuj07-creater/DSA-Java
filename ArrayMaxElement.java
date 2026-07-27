package ArrayAndArrayList;
import java.util.*;

public class ArrayMaxElement {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] emp_id = new int[5];
        System.out.println("enter the "+emp_id.length+" employee id:");
        for (int i = 0; i < emp_id.length; i++) {
            emp_id[i] = sc.nextInt();
        }
        System.out.println(max(emp_id));
        System.out.println(maxRange(emp_id, 1, 3));
        sc.close();
    }

    static int max(int[] emp_id) {
        int maxNo = emp_id[0];
        for (int i = 1; i < emp_id.length; i++) {
            if (emp_id[i] > maxNo) {
                maxNo = emp_id[i];
            }
        }
        return maxNo;
    }

    static int maxRange(int[] emp_id, int start, int end) {
        int maxNo = emp_id[start];
        for (int i = start + 1; i <= end; i++) {
            if (emp_id[i] > maxNo) {
                maxNo = emp_id[i];
            }
        }
        return maxNo;

    }
}
