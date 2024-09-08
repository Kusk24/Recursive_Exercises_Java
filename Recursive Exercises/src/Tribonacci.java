public class Tribonacci {

    public static void main(String[] args) {
        System.out.println("Tribonacci of 10th = "+ Tribonacci(10));
    }

    public static int Tribonacci (int x){
        if (x == 0){
            return 0;
        } else if (x == 1){
            return 1;
        } else if (x == 2){
            return 1;
        } else {
            return Tribonacci(x-1)+Tribonacci(x-2)+Tribonacci(x-3);
        }
    }
}
