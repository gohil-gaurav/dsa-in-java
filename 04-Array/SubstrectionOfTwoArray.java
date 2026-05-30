import java.util.*;
public class SubstrectionOfTwoArray {
    public static int[] subtractArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int borrow = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            int a = arr1[i] - borrow;
            int b = arr2[i];
            if (a < b) {
                a = a + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = a - b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]= sc.nextInt();
        }
        res = subtractArray(arr1, arr2);
        for(int i =0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}
