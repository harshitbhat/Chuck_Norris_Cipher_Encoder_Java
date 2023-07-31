import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int ans = 0;

        while(T-- > 0) {
            int n = scanner.nextInt();
            if( n % 4 == 0) {
                ans = Math.max(n, ans);
            }
        }

        System.out.println(ans);

        scanner.close();
    }
}