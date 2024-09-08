public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci of 10th = " + Fibonacci(10));
    }

    public static int Fibonacci(int x){
        if (x == 0){
            return 0;
        }else if (x == 1){
            return 1;
        } else {
            return Fibonacci(x-1)+Fibonacci(x-2);
        }
    }
}
