import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;

        for(int i = 1; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i - 1);
            char c = str.charAt(i + 1);

            if(
                    isVowel(a) && isVowel(b) && isVowel(c) ||
                            (!isVowel(a) && !isVowel(b) && !isVowel(c))
            ) {
                count++;
                i++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}