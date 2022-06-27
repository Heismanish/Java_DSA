import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_String {
    public static void main(String[] args) {

        // Array of objects
        Scanner take = new Scanner(System.in);
        String [] str = new String[4];
        for (int i = 0; i < str.length; i++ ){
            str[i] = take.next();
        }
        System.out.println(Arrays.toString(str));

         // modifying
         str [2] = "manish";
        System.out.println(Arrays.toString(str));

    }
}
