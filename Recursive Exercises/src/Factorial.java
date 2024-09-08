public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = "+ Factorial(5));
    }

    public static int Factorial(int x){
        if (x == 1){
            return 1;
        } else {
            return x * Factorial(x-1);
        }
    }
}
