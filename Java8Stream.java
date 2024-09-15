// 2. Java 8 Stream

import java.util.Arrays;

public class Java8Stream {
   public static void main(String[] args){
    int[] arr = {1, 33, 55, 89, 76, 99, 76, 2};

    int max = Arrays.stream(arr).max().getAsInt();

    System.out.println("Largest element int the array is: " + max);
   }

}
