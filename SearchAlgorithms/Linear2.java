public class Linear2 {

    public static void main(String[] args) {
        int [] arr = {1,31,12,11,32,-4};
        int target = 332;
        System.out.println(linear(arr,target, 2,5 ));

    }
    static int linear(int[] array, int target,int start, int end){
        // when array is empty
        if (array.length == 0 ){
            return -1;
        }

        // search in the array, return index if found.
        // return -1 if not found
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }

        // will execute when none of the above return
        // that is target not found.
        return -1;

    }
}
