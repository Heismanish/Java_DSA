import java.util.*;

public class Selection_Sort{
    public static void main (String [] args){
          // Selection Sort:
          // Time complexity: worst->  O(n^2)
          //                  best -> O(n^2) 
          // not stable
          // performs well in smaller arrays. 
          int [] arr = {13,11,-9,0,3,12,98};
        /*  selectionSort(arr);
          System.out.println(Arrays.toString(arr)); 
          */
          sortInDescending(arr);
          System.out.println(Arrays.toString(arr));
          
    }

    static void selectionSort(int [] arr){
        for (int i = 0; i< arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr, 0,last);
            swap(arr,maxIndex, last);
        }
    }

    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static void sortInDescending(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length-i-1;
            int minIndex = getminIndex(arr, 0, last);
            swap(arr,minIndex,last);
        } 
    }

    static int getminIndex(int[] arr, int start,int end){
        int min = start;
        for(int i=0; i<end; i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
}