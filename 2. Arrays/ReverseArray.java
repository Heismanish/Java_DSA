import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {8728, 999,234 , 1234, 1235, 50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr ){
        // two pointer method.
        int end = arr.length-1;
        int start = 0;
        while (start < end){
            //swap
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    static void swap (int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
