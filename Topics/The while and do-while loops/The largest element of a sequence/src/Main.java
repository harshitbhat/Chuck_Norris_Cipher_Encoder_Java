import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num;
        int ans = Integer.MIN_VALUE;

        do {
            num = scanner.nextInt();
            ans = Math.max(num, ans);
        } while(num != 0);

        System.out.println(ans);
    }
}