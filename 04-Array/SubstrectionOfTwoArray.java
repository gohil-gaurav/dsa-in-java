public class SubstrectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 2, 4, 6 };

        int[] result = subtractArrays(arr1, arr2);
        printArray(result);
    }

    public static int[] subtractArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
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
