import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sum = 0;

        do {
            num = scanner.nextInt();
            sum += num;
        } while( num != 0);

        System.out.println(sum);
    }
}