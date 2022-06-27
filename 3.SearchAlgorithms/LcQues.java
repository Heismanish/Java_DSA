public class LcQues {
    public static void main(String[] args) {
        int[] a = {1,-43,23,654,2131,32234};
        System.out.println(checkEven(a));

    }

    // to check how many even digit numbers we have in the array.
    static int checkEven(int [] arr){
        int count = 0;
        for (int i : arr) {
            if (digits2(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    // to find number of digits in a number.
    // highly optimised way.
    static int digits2(int num){
        if (num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num)+1); // to be covered later.
    }

    // to find number of digits in a number.
    static int digits(int num){
        if (num < 0){
            num *= -1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return  count;
    }
}
