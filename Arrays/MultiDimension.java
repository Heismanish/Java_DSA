import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        /*
           1 2 3
           4 5 6
           7 8 9
        */

        // Multidimensional Array:

        // int [][] arr = new int[3][3];
        //  num of rows(mandatory)^  ^ number of columns(not mandatory)

        int [][] arr2D ={
                {1,2,3}, // 0th index
                {4,5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        };

        int [][] arr = new int[2][3];
        System.out.println(arr.length); // gives no. of rows

        // input
        for (int row = 0; row < arr.length; row ++){
            // for each column in every row
            for (int col = 0; col < arr[row].length; col ++){
                arr[row][col] = take.nextInt();
            }
        }

        // output
/*
        for (int row = 0; row < arr.length; row ++){
            // for each column in every row
            for (int col = 0; col < arr[row].length; col ++){ // arr[row].length is number column
                System.out.print(arr[row][col] +  " ") ;
            }
            System.out.println();
        }
*/


        //  output
        /*
        for (int row = 0; row < arr.length; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }

         */

        // output
        for( int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
