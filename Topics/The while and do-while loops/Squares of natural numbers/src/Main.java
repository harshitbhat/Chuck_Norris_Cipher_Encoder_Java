import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int num = scanner.nextInt();

        for(int i = 1; ; i++) {
            if( i * i <= num) {
                System.out.println(i * i);
            } else {
                break;
            }
        }
        scanner.close();
    }
}