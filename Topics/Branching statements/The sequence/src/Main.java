import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        for(int i = 1; ; i++) {
            for(int j = i; j < i + i; j++) {
                System.out.print(i + " ");
                n--;
                if(n == 0) {
                    break;
                }
            }
            if(n == 0) {
                break;
            }
        }

    }
}