public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println("2^8 = " + powerOfANumber(2,8));
    }

    public static int powerOfANumber(int x, int exponential){
        if (exponential == 0){
            return 1;
        } else if (exponential == 1){
            return x;
        } else {
            return x*powerOfANumber(x, exponential-1);
        }
    }
}
