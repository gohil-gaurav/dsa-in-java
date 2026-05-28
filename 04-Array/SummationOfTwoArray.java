public class SummationOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 3, 2, 1 };

        int[] result = addArrays(arr1, arr2);
        printArray(result);
    }

    public static int[] addArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
