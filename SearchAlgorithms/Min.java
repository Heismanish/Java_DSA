public class Min {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,-1,5,35};
        System.out.println(minElement(arr));
    }
    private static int minElement(int [] arr){
        int ans = arr[0];
        for(int a = 0; a < arr.length; a++ ){
            if (ans < arr[a]){
                ans = arr[a];
            }
        }
        return ans;
    }
}
