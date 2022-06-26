import java.util.Scanner;
import java.util.Arrays;
public class Bsearchin2D{
    public static void main(String [] args){
        // Time complexity = O(N) -> 2N comparisons are made.
        // Space complexity = O(1) -> no extra spaces taken.
        
     // uppper bound is last element of 1st row.
     // lower bound is first element of 1st ro2.    
     // if element == target -> target found
     // if element < target -> row ++ 
     // if element > target -> column -- 
      Scanner take = new Scanner(System.in);
    int [][] matrix = {
                            {1,2,3,21,99},
                            {6,4,8,35,100},
                            {9,7,37,101,102},
                            {10,12,40,210,211},
                            {13,15,41,220,221} };
    /*  int target = take.nextInt();     
     //System.out.println(target);   
     System.out.println(Arrays.toString(NormalSearch(multidArray,target)));      */
     
     
     // BINARY SEARCH IN 2D ARRAY:

      // Q. Search in a Sorted matrix:
     /*  int [][]matrix = { {1,2,3},
              {4,5,6},
              {7,8,9} 
      }; */
      //int target = take.nextInt();
      System.out.println(Arrays.toString(Search(matrix, 220)));
      

     
    }

    static int[] NormalSearch(int[][] mArray, int target){
        int r = 0;
        int c = mArray.length -1;
        
        while(r < mArray.length && c >= 0){
            if(mArray[r][c] == target){
                return new int[]{r,c};
            }
            if(mArray[r][c] < target){
                r++;
            } else{
                c--; 
            }
        }
        return new int[]{-1,-1};

    }

 // to search in provided row:
    static int [] bSearch(int [][] matrix,int row,int colStart,int colEnd,int target){

        while(colEnd >= colStart){
            int Cmid = colStart + (colEnd-colStart)/2;

            if(matrix[row][Cmid]== target){
                return new int[]{row,Cmid};
            }

            if( matrix[row][Cmid] > target){
                colEnd = Cmid-1;
            }
            if( matrix[row][Cmid] < target){
                colStart = Cmid+1;
            }
        }
        return new int [] {-1,-1};
    }

    static int [] Search(int [][] matrix, int target){
        System.out.println("Searching");
        int row = matrix.length;
        int col = matrix[0].length; // be catious, matrix may be empty.

        if( row == 1){
            return bSearch(matrix, 0, 0,col-1 , target);
        }

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        while( rStart < (rEnd-1)){
            int mid = rStart+ (rEnd-rStart)/2; 

            if(matrix[mid][cMid] == target){
                return new int [] {mid,cMid};
            }
            if(matrix[mid][cMid] <target){
                rStart = mid;
            }else{
                rEnd = mid;
            }

        }

        if(matrix[rStart][cMid] == target){
            return new int [] {rStart,cMid};
        } 
        if(matrix[rStart+1][cMid] == target){
            return new int [] {rStart+1,cMid};
        }

        // 1st half 
        if(target <= matrix[rStart][cMid-1]){
            return bSearch(matrix, rStart, 0, cMid-1, target);
        }
        //2nd half
        if(target <= matrix[rStart+1][cMid-1]){
            return bSearch(matrix, rStart+1, 0,cMid-1, target);
        }
        // 3rd half
        if(target >= matrix[rStart][cMid+1] && matrix[rStart][col-1] >= target){
            return bSearch(matrix, rStart, cMid+1, col-1, target);
        }
        if(target <= matrix[rStart+1][cMid+1]){
            return bSearch(matrix, rStart+1, cMid-1,col-1, target);
        }
        return new int [] {-1,-1};

    
    }
}