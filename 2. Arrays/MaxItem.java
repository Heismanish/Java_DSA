public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {8728, 999, 1234, 1235, 50};
        System.out.println(maxRange(arr , 1,3));

    }
     static int max(int[] arr){
        int maxVal = arr[0];
        for (int i =0; i < arr.length; i++ ){
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
        }
         return maxVal;
    }

     static int maxRange(int[] arr, int st, int endpt){

        if(endpt > st){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr [st];
        for (int i = st; i <= endpt ; i++ ){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
