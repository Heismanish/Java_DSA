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
    /*int [][] matrix = {
                            {1,2,3,7},
                            {6,4,8,35},
                            {9,7,37,101},
                            {10,12,40,210}
                             };*/
    /*  int target = take.nextInt();     
     //System.out.println(target);   
     System.out.println(Arrays.toString(NormalSearch(multidArray,target)));      */
     
     
     // BINARY SEARCH IN 2D ARRAY:

      // Q. Search in a perfectly Sorted matrix:
       int [][]matrix = { {1,2,3,4},
              {5,6,7,8},
              {9,10,11,12},
               {13,14,15,16}
      };
      //int target = take.nextInt();
      System.out.println(Arrays.toString(bSearchNew(matrix, 10)));
      

     
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
        int col = matrix[0].length; // be cautious, matrix may be empty.

        if( row == 1){ // if there is only one row in matrix
            return bSearch(matrix, 0, 0,col-1 , target);
        }

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        while( rStart < (rEnd-1)){ //  will end when only two rows left.
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

        // to search in the remaining two rows.
        if(matrix[rStart][cMid] == target){
            return new int [] {rStart,cMid};
        } 
        if(matrix[rStart+1][cMid] == target){
            return new int [] {rStart+1,cMid};
        }

        // to search in remaining four parts left.
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
        // 4th half
        if(target <= matrix[rStart+1][cMid+1]){
            return bSearch(matrix, rStart+1, cMid-1,col-1, target);
        }
        return new int [] {-1,-1};

    
    }



    static int [] bSearchNew(int [][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        
        if(row == 1){
            return bSearch(matrix,0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = matrix.length -1 ;
        int cMid = col/2; 

        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
             if(matrix [mid][cMid] == target){
                return new int [] {mid,cMid};
             }
             if(matrix[mid][cMid]> target){
                rEnd = mid;
             } 
             if(matrix[mid][cMid]< target){ 
                rStart = mid;
             }
        }

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target ){
            return new int [] {rStart,cMid}; 
        }

        if(matrix[rStart][cMid-1] >= target){
            return bSearch(matrix, rStart, 0, cMid-1, target);
        }
        if(matrix[rStart][cMid+1] <= target && matrix[rStart][col-1] > target ){
            return bSearch(matrix,rStart,cMid+1,col-1,target);
        }
        if(matrix[rStart+1][cMid-1] >= target){
            return bSearch(matrix,rStart+1,0,cMid-1,target);
        }
        else{
            return bSearch(matrix,rStart+1,cMid+1,col-1,target);
        }
        //return new int []{-1,-1};
    
    }

}