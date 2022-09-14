import java.util.Arrays;
import java.util.Scanner;

public class Array_primitive {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);

        // Array of Primitives.
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 162;
        arr[2] = 19;
        arr[3] = 43;
        arr[4] = 2;
        // [12,162,19,43,2]
        System.out.println(arr[4]);

        // input using for loops
        for (int i = 0; i < arr.length; i++){
            arr[i] = take.nextInt();
        }

        // output using toString method.
        System.out.println(Arrays.toString(arr));

        // output using for loop.
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i] +" ");
        }

        // enhanced form of for loop.
        for (int j : arr) { // for every element in array, print the element
            System.out.println(j + " "); // here j represents element of the array
        }

        // Array of Strings
        String [] str = new String[4];
        for (int i = 0; i < str.length; i++ ){
            str[i] = take.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
