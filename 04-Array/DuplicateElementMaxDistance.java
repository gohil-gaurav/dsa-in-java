public class DuplicateElementMaxDistance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 1 };
        int maxDistance = maxDuplicateDistance(arr);
        System.out.println(maxDistance);
    }

    public static int maxDuplicateDistance(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance;
    }
}
