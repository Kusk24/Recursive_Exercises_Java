public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("sum of 1234 = " + stringToInteger("1234"));
    }

    public static int stringToInteger(String x){
        if (x.isEmpty()){
            return 0;
        } else {
            return Integer.parseInt(x.substring(0,1)) + stringToInteger(x.substring(1));
        }
    }
}
