package chucknorris;

import java.util.Scanner;

public class Main {

    public static void printEncodedString(String input) {
        try {
            String finalString = "";

            for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                String binary = Integer.toBinaryString(ch);
                String padded = "0000000".substring(binary.length()) + binary;

                finalString += padded;
            }

            System.out.println("Encoded string:");

            String answerString = "";

            for(int i = 0; i < finalString.length();) {
                if(finalString.charAt(i) == '0') {
                    answerString += "00 ";
                } else {
                    answerString += "0 ";
                }
                int j = i;
                while(j < finalString.length() && finalString.charAt(j) == finalString.charAt(i)) {
                    answerString += "0";
                    j++;
                }
                i = j;
                answerString += " ";
            }

            System.out.println(answerString + "\n");
        } catch (Exception e) {
            System.out.println("Encoded string is not valid.\n");
        }
    }

    public static void printDecodedString(String input) {
        String[] zeros = input.split(" ");

        try {
            String finalString = "";

            for(int i = 0; i < zeros.length; i += 2) {
                if(zeros[i].equals("0")) {
                    for(int j = 0; j < zeros[i+1].length(); j++) {
                        finalString += "1";
                    }
                } else if (zeros[i].equals("00")) {
                    for(int j = 0; j < zeros[i+1].length(); j++) {
                        finalString += "0";
                    }
                } else {
                    throw new Exception();
                }
            }

            if(finalString.length() % 7 != 0) {
                throw new Exception();
            }

            String[] bins = new String[ finalString.length() / 7 ];
            int index = 0;

            for(int i = 0; i < finalString.length(); i += 7) {
                String part = finalString.substring(i, i + 7);
                bins[index++] = part;
            }

            String answerString = "";


            for(String st : bins ) {
                int decimal = Integer.parseInt(st, 2);
                char ch = (char) decimal;

                answerString += ch;
            }

            System.out.println("Decoded string:");

            System.out.println(answerString + "\n");
        } catch (Exception e) {
            System.out.println("Encoded string is not valid.\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean game = true;

        while(game) {
            System.out.println("Please input operation (encode/decode/exit):");
            String inputOp = sc.nextLine();

            if(inputOp.equals("encode")) {
                System.out.println("Input string:");
                String toEncode = sc.nextLine();
                printEncodedString(toEncode);
            } else if (inputOp.equals("decode")) {
                System.out.println("Input encoded string:");
                String toDecode = sc.nextLine();
                printDecodedString(toDecode);
            } else if (inputOp.equals("exit")) {
                game = false;
                System.out.println("Bye!");
            } else {
                System.out.println("There is no '" + inputOp + "' operation\n");
            }
        }

        sc.close();
    }
}