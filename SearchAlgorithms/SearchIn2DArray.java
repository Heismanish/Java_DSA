import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,3,5},
                {2,8,6,9},
                {11,12,54,21},
                {-1,43}
        };

        int target = 54;
        int[] ans = Searchin2D(arr,target);
        //System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }

    // Search target element and output index of target.
    static int[] Searchin2D(int[][] arr, int target){

        for(int row = 0 ; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if ( arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }

    // find min value in an array
    static int min (int [][]arr){
        int minimum = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row ++){
            for (int col = 0; col < arr[row].length; col++){
                if( minimum > arr[row][col] ){
                    minimum = arr[row][col];
                }
            }
        }
        return minimum;
    }
}
