public class BSRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,11,14,54,222};
        int target  = 3;
        System.out.println(bS(arr,target,0,arr.length-1));
    }
    static int bS(int [] arr, int target, int s ,int e){
        if (s > e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if( arr[mid] == target){
            return mid;
        }
        if( target < arr[mid]){
            return bS(arr, target,s,mid-1);
        }
        return bS(arr, target, mid+1,e);
    }
}
