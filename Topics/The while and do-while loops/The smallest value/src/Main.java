import java.util.Scanner;

class Main {

    public static long factorial(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        long num = scanner.nextLong();

        for(int i = 1;; i++) {
            if(factorial(i) > num) {
                System.out.println(i);
                break;
            }
        }
    }
}