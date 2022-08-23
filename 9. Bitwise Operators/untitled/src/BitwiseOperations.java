public class BitwiseOperations {
    public static void main(String[] args) {


//        int n = 98;
//        System.out.println(isOdd(n));
       /* int [] arr = {2,3,4,5,6,5,4,2,3};
        System.out.println(ans(arr));*/
        int n3 = 20;
        System.out.println(ithBit(n3,6));
    }
    //1. to determine if a number is odd or not.
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    //2. to determine unique element in array.
    static int ans(int []arr){
        int unique = 0;
        for( int n: arr){
            unique^=n;
        }
        return unique;
    }

    //3. to find ith bit of a number
    static int ithBit(int num,int n){
        //int mask = 1 << n-1; // this is called mask.

        return ((num & (1 << (n - 1))) >> (n - 1));
    }
}
