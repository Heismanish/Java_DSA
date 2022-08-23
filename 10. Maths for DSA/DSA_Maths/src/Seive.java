public class Seive {
    public static void main(String[] args) {
        int n =40;
        boolean [] primes = new boolean[n+1];// array will have all values as false.
        seive(n,primes);

    }

    // false in array is for prime values.
    static void seive(int n, boolean [] primes){
        for(int i = 2; i*i <= n; i++ ){
            if(!primes[i]){
                for(int j = i*2;j <= n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++ ){
            if(!primes[i]){
                System.out.println( i+ " is PRIME");
            }
        }
    }


}
