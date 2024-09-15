// 1. Iterative Method (Brute Force Method)

public class IterativeMethod{

    static int Largest(int[] arr, int i){
        for (int j=0; j<arr.length; j++){
            if(arr[j]>i){
                i = arr[j];
            }
        }
        return i;
    }
    public static void main(String[] args){
        int[] arr = {1, 33, 55, 89, 76, 99, 76, 2};
        int i = arr[0];

        System.out.println("Largest element in the array is : " + Largest(arr, i));
    }
}