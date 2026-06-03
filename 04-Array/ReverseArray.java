public class ReverseArray {

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int a : arr) {
            System.out.print(a+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

        reverseArray(arr);

    }
}
