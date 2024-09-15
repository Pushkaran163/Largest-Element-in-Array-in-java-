// 4. Using Collections.max()
import java.util.Collections;

import java.util.ArrayList;
import java.util.List;

public class collectionMax {
    public static void main(String[] args){
        int[] arr = {1, 33, 55, 89, 76, 99, 76, 2};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println("Largest element in the array is: "+ Collections.max(list));
    }
}
