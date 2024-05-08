public class ArrayPeak {
    public static void main(String args[]) {
        int arr[] = new int[]{20, 40, 21, 28, 29};
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}