public class SearchInString {
    public static void main(String[] args){
        String name = "Dikshika";
        char target = 'i';
        System.out.println(search(name, target));

    }

    private static boolean search2(String str, char target){
        if(str.length() ==0 ){
            return false;
        }

        for (char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    private static boolean search(String str, char target){
        if(str.length() ==0 ){
            return false;
        }

        for (int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == target ){
                return true;
            }
        }
        return false;
    }
}
