public class NaturalSum {
    public static void main(String[] args) {
        System.out.println("Sum of Natural number to 10 = "+ sumOfNatural(4));
    }

    public static int sumOfNatural(int x){
        if (x == 1){
            return 1;
        } else {
            return x + sumOfNatural(x-1);
        }
    }
}
