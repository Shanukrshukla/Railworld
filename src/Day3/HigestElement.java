package Day3;

import java.util.Scanner;

public class HigestElement {

    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        int largest;
        for (largest=0; largest< arr.length; ++largest){
            arr[largest] = sc.nextInt();
        }

        largest = arr[0];

        int secondLargest;
        for (secondLargest = 0; secondLargest<arr.length; ++ secondLargest){
            if (arr [secondLargest] > largest){
                largest = arr[secondLargest];
            }
        }

        System.out.println(largest);
        secondLargest = arr[0];

        for (int i = 0; i< arr.length;++i){
            if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
