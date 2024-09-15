// 3. Sorting Method

// ii). Using Arrays.sort() method

import java.util.Arrays;

public class SortingMethod2 {
    public static void main(String[] args){
        int[] arr = {1, 33, 55, 89, 76, 99, 76, 2, 5, 4, 98, 90, 87};

        Arrays.sort(arr);
        System.out.println(arr);

        System.out.println("Largest element in an array: " + arr[arr.length - 1]);
    }
}
