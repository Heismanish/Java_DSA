public class Performance{
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //System.out.println(ch);
            series += ch; // not efficient has a coomplexity of O(N2)
        }
        System.out.println(series);
    }
}