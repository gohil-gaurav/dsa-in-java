import java.util.*;

public class MissingNumber {
    public static void missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n+1) /2;
        int actualSum = 0;
        for(int x : nums){
            actualSum += x;
        }
        int ans = sum-actualSum;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 5};
        missingNumber(arr);
    }
}