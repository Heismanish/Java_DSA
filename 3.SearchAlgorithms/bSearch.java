public class bSearch {

        public static void main(String[] args) {
            int [] arr = {2,4,8,2,43,12,32,54,31,42,25,17};
            int target = 25;
            int ans = binarySearch(arr, target);
            System.out.println(ans);

        }

        // to return index of the target.
        static int binarySearch(int [] arr, int target){
            int start = 0;
            int end = arr.length-1;


            while( start <= end) {
                int mid = start + (end -start)/2;

                if( target < arr[mid]){
                    end = mid-1;
                } else if (target > arr[mid]) {
                    start = mid+1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

}
