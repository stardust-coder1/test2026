package test_9;

public class MathDemo2 {
    public static int []pSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr [j]>arr[j+1]){
                    int tap =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tap;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,5};
        pSort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
