import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        // Bubble / Sinking / Exchange sort:
        // Adjacent elements are compared and swapped.
        // space complexity = O(1) : constant -> no extra space required,i.e., copying the array,etc. not required.
        int [] arr ={10,4,3,2,1,8};
        int [] sArr = {1,3,5,7,9};
       
        bubbleSort(sArr);
        System.out.println(Arrays.toString(sArr));
        
    }

    static void bubbleSort(int[] arr){

        boolean swapped = false;
        
        // runs this step n-1 times [ n is array length ]
        for(int i = 0; i < arr.length; i++){
            // for each step, max item will come at the last respective index.
            for(int j =1; j< arr.length - i; j++) {
                // swap if the item is smaller than the previous value.
                if( arr[j-1] > arr[j]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr [j-1] = temp;
                    swapped = true;
             }
            }
            if(!swapped){ // !false = true ,i.e., if swapped is false then break.
                // if no value is swapped for a particular value of i, then it means the array is sorted hence break.  
                break;
            }
            
        }
    }
}