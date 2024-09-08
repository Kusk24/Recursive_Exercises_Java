public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
    public static int sumOfDigits(int x){
        if (x < 10){
            return x;
        } else {
            return x%10 + sumOfDigits(x / 10);
        }
    }
}
