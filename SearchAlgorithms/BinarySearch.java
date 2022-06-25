import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String [] args){
        Scanner take = new Scanner(System.in);
        int[] Arr  = new int [5];

        System.out.println("Enter values:");

        for(int i = 0 ; i < Arr.length; i++){
            Arr[i] = take.nextInt();       
        }   
        System.out.println(Arrays.toString(Arr));
        System.out.println("Enter target:");
        int target = take.nextInt();
        
        System.out.println( agnosticBSearch(Arr, target));
    }

    static int bSearch(int[] Arr,int target){
        System.out.println("Fun starts");
        int start = 0;
        int end = Arr.length-1;
        
        //for (int i = start; i < end; i++)
        while(end >= start){
            int mid = start + (end - start)/2;
            
        if( target== Arr[mid]){
            return mid;
        }

        if(target>Arr[mid]){
            start = mid+1;
            
        }else if( target < Arr[mid]){
            end = mid-1;
        } else {
            System.out.println("target not found");
          }

        }
        return -1;

    }

    static int agnosticBSearch(int [] Arr, int target){
        int start = 0;
        int end = Arr.length-1;
        int mid;

       
         while(end>=start ){
            mid = start +(end - start)/2;
            if(target == Arr[mid ]){
                return mid;
            }
            
            if(Arr[start] < Arr[end] ){
                // Ascending
                 if(target> Arr[mid]){
                     start = mid+1;
                }else if( target < Arr[mid]){
                     end = mid-1;
            }
            } else if( Arr[start] > Arr[end]) { 
                
                // descending
                if(target > Arr[mid]){
                    end = mid-1;
                } else if(target < Arr[mid]){
                    start = mid +1;
                }

            }
    
        }

        return -1;
    }


}
