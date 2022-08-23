public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
        System.out.println(pal(str));
    }
    static boolean isPalindrome(String str){
        if ( str == null || str.length() == 0 ){
            return true;
        }
        str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++ ){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
             if( start != end){
                 return false;
             }
        }
        return true;
    }

    static boolean pal( String str){
        if( str.length() == 0 || str == null  ){
            return false;
        }
        str.toLowerCase();
        StringBuilder s = new StringBuilder(str);
        s.reverse();

        if(str.equals(s.toString())){
            return true;
        }
        else return false;
    }
}
