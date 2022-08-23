public class Patterns {
    public static void main(String[] args) {
        pattern18(5);

    }


    static void pattern1 (int n){
        for (int row = 1; row <= n; row++ ){
            for (int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++ ){
            // for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            // when new row is printed, we need to add a new line.
            System.out.println();
        }
    }

    static void pattern3 (int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n-row+1; col++){ // find formula relating row and column.
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4 (int n){
        for (int row = 1; row <= n; row++ ){
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    static void pattern5 (int n){
        for (int row = 0; row < 2 * n; row++ ){
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6 ( int n ){
        for (int row = 1; row <= n; row++){
            int space = n-row;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row = n; row > 0; row--){
            int spaces = n-row;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for( int col = 0; col < row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row = 1; row <= n; row++ ){
            int space = n-row;
            for(int s = 0; s < space; s++ ){
                System.out.print(" ");
            }

            for(int col = 1; col < row; col++){
                System.out.print("*");
            }
            for( int col = row; col < 2 * row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row = n; row > 0; row--){
            int space = n-row;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row ; col++){
                System.out.print("*");
            }
            for(int col = row+1; col < 2*row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            int space = n-row;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n) {
        for(int row = n; row > 0; row-- ){
            int space = n-row ;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row = 1; row <= 2*n; row++){
            int noOfCol = n < row ? row - n: n-row +1 ;
            int space = n - noOfCol;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= noOfCol; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   /* static void pattern13(int n){
        for(int row = 1; row <= n;row++ ){
            //int noOfCol = row > 1 && row < (2 * n)-1? 2 :row ;
            int noOfCol;
            if( row > 1 && row < n ){
                noOfCol = 2;
            } else if (row == 1) {
                noOfCol = 1;
            } else {
                noOfCol = 2*n-1;
            }
            int startSpace =  n-row;
            for(int s = 0; s < startSpace; s++ ){
                System.out.print(" ");
            }
            for( int col = 0; col < noOfCol; col++ ){
                System.out.print("*");
                if(row != n){
                int midSpace =2*row-3 ;
                for(int s = 0; s< midSpace; s++){
                    System.out.print(" ");
                }
                }
            }
            System.out.println();

        }
    }
*/

    static void pattern13(int n){
        for (int row = 0; row < n; row++ ){

            for(int s = 0; s < n-row; s++ ){
                System.out.print(" ");
            }

            for(int col = 0; col <= row ; col++ ){
                if( row == n-1 || col ==0){
                    System.out.print("*");
                } else{
                System.out.print(" ");
                }
            }
            for(int col = 0; col < row ; col++ ){
                if( row == n-1 || col == row-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int row = n; row > 0; row--){
            //int space = n-row ;
            for(int s = 0; s < n-row; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < row ;col++ ){
                if( col == 0 || row == n ){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
            }
            for(int col = 1; col < row ;col++ ){
                if( col == row-1 || row == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int row = 1; row <2*n; row++ ){
            int space = row > n? row-n:n-row ;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            int colInRow = n < row ? 2*n-row: row ;
            for(int col = 0; col < colInRow; col++){
                if(col == 0){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int col = 1; col < colInRow;col++ ){
                if( col == colInRow-1 ){
                    System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 0; s < n-row; s++){
                System.out.print(" ");
            }
            int c = 1;
            for (int col = 1; col <= row ; col++ ){
                System.out.print( c + " ");
                c = c*(row-col)/col;
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row < 2 * n; row++ ) {
            int c = row > n ? 2 * n- row: row;
            for (int s = 0 ; s < n - c; s++){
                System.out.print("  ");// have added spaces after each number hence we need two spaces here
            }
            for (int col = c; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern18 (int n){
        for(int row = 0; row < 2*n; row++){
            int colPattern = row >= n? row-n+1 : n-row ;
            for(int col = 0; col < colPattern; col++ ){
                System.out.print("*");
            }
            int space1 = row >= n ? 2*n-row-1 : row ;
            for(int s = 0; s < space1; s++){
                System.out.print("  ");
            }
            for(int col = 0; col < colPattern;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        //for(){}
    }
    static void pattern28 (int n){
        for (int row = 1; row < 2 * n; row++ ){
            int totalColsInRow = row > n ? 2 * n - row: row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0 ; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern30 (int n){
        for (int row = 1; row <= n; row++ ) {

            int noOfSpaces = n - row;
            for (int s = 0 ; s < noOfSpaces; s++){
                System.out.print("  ");// have added spaces after each number hence we need two spaces here
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }




}
