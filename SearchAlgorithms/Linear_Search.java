import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search{
    public static void main(String [] args){
        Scanner take = new Scanner(System.in);
        int[] array = new int[9];
        System.out.println("Enter elements if array:");
        for(int i =0 ; i< array.length; i++){
            array[i] = take.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter target: ");
        int target = take.nextInt();
        for(int i = 0; i< array.length; i++){
            if(array[i] == target){
                System.out.println(target +" is at index "+i);
                break;
            }
        }
       
    }
}