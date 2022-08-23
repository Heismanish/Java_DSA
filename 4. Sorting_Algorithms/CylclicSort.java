import java.util.Arrays;

public class CylclicSort{
    public static  void main(String [] args){
        int [] Array = {5,3,1,2,4,7,6};
        cycleSort(Array);
        System.out.println(Arrays.toString(Array));
        
    }

    static void cycleSort(int [] Arr){
        int i = 0;
        while(i < Arr.length){
            int correct  = Arr[i]-1;
            if( Arr[correct] != Arr[i]){
                swap(Arr, i,correct);
            } else {
                i++;
            }
        }
    }

    static void swap (int [] Arr,int first,int second){
        int temp = Arr[first];
        Arr[first] = Arr[second];
        Arr[second] = temp;
    }
}