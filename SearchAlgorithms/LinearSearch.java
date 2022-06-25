public class LinearSearch {
    public static void main(String[] args){
        System.out.println("hello world" );
        int[] arr = {1,43,65,1,9,23,21};
        System.out.println(linearSearch3(arr,21));

       // Generic Method to search for a number in an array
       /*
       for (int i = 0; i < arr.length; i++ ){
            if(arr[i] == 10 ){
                System.out.println("5 exists");
            }
        }
        */

    }

    // to search target and return true if found and false if not.
    private static boolean linearSearch3(int[] array, int target){
        if (array.length == 0 ){
        return false;
    }

    // search in the array, return index if found.
    // return -1 if not found
        for (int index = 0; index < array.length; index++) {
        int element = array[index];
        if (element == target) {
            return true;
        }
    }

    // will execute when none of the above return
    // that is target not found.
        return false;
    }

    // to search target and return target of found.
    private static int linearSearch2(int[] array, int target ){
        if (array.length == 0 ){
            return Integer.MAX_VALUE;
        }

        // search in the array, return index if found.
        // return -1 if not found
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return element;
            }

        }

        // will execute when none of the above return
        // that is target not found.
        return Integer.MAX_VALUE;
    }


    // to search target and give index if found.
    private static int linearSearch(int[] array,int target ){
        // when array is empty
        if (array.length == 0 ){
            return -1;
        }

        // search in the array, return index if found.
        // return -1 if not found
        for (int element: array) { //enhanced for loop
            if (element == target) {
                return element;
            }
        }

        // will execute when none of the above return
        // that is target not found.
        return -1;

    }
}
