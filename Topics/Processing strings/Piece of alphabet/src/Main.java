import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean answer = true;

        for(int i = 2; i < str.length(); i++) {
            if(str.charAt(i) - str.charAt(i - 1) != 1) {
                answer = false;
                break;
            }
        }

        System.out.println(answer);

    }
}