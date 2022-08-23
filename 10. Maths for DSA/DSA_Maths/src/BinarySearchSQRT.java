public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p =4;
        System.out.printf("%.4f",sqrt(n,p));
    }

    // Time Complexity = O(log(n))
    static double sqrt( int n,int p ){
        int s = 0;
        int e = n;

        double root = 0.0;

        // will work till the root value is an integer.
        while( e >= s){
            int mid = s+(e-s)/2;

            if( mid * mid == n ){
                return mid;
            }
            if( mid * mid > n ){
                e = mid-1;
            }
            if (mid * mid < n){
                s = mid+1;
            }
        }

        double incr = 0.1;
        for( int i = 1; i <= p; i++){
            while( root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
