import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] num = {2,3,4,5,6};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        // here value of array at 0th position is changed
        // Arrays are mutable.
    }
    static void change (int[] arr ){
        arr[0] = 9;
    }
}
