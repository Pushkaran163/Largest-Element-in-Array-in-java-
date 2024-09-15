// 3. SORTING METHOD

// i). User Defined Method

public class SortingMethod1{

    static int Largest(int[] arr){
        for (int i = 0; i<arr.length; ++i){
            int k = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = k;
        }
        return arr[arr.length - 1];

    }

    public static void main(String[] args){
        int[] arr = {1, 33, 55, 898, 89, 76, 99, 76, 2};

        System.out.println("Largest element in the array is : " + Largest(arr));
    }

}