import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array

        int[] arr = {1 ,3,4,9,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change (int[] nums){ // nums is pointing to the arr object

        // if any change is made via this reference variable(nums),
        // same object will be changed
        nums[0] = 99;// array is being modified.
    }
}
