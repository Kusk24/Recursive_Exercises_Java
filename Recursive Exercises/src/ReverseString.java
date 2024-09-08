public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseAString("Hello"));
    }

    public static String reverseAString(String x){
        if (x.length() <= 1){
            return x;
        } else{
            return x.charAt(x.length()-1) + reverseAString(x.substring(0,x.length()-1));
        }
    }
}
