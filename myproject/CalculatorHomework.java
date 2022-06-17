import java.util.Scanner;

public class CalculatorHomework {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi yazınız:");
        String sentence = inp.nextLine();
        sentence.toLowerCase();
        String num1 = "";
        String num2 = "";
        //Finding first number
        for (int a = 0; a < sentence.length(); a++) {
            if (sentence.charAt(a) == '1' || sentence.charAt(a) == '2' || sentence.charAt(a) == '3' || sentence.charAt(a) == '4'
                    || sentence.charAt(a) == '5' || sentence.charAt(a) == '6' || sentence.charAt(a) == '7' || sentence.charAt(a) == '8'
                    || sentence.charAt(a) == '9' || sentence.charAt(a) == '0') {
                num1 += sentence.charAt(a);
            } else if (num1 != "")
                break;
        }
        // finding second number
        for (int t = sentence.length() - 1; t > 0; t--) {
            if (sentence.charAt(t) == '1' || sentence.charAt(t) == '2' || sentence.charAt(t) == '3' || sentence.charAt(t) == '4'
                    || sentence.charAt(t) == '5' || sentence.charAt(t) == '6' || sentence.charAt(t) == '7' || sentence.charAt(t) == '8'
                    || sentence.charAt(t) == '9' || sentence.charAt(t) == '0') {
                num2 = sentence.charAt(t) + num2;
            } else if (num2 != "")
                break;
        }
//sayılar ASCII de 48 ile 60 arasındadır.

        int intNum1 = 0;
        for (int i = 0; i < num1.length(); i++) {
            intNum1 = intNum1 * 10 + ((int) num1.charAt(i) - 48);
        }
        int intNum2 = 0;
        for (int i = 0; i < num2.length(); i++) {
            intNum2 = intNum2 * 10 + ((int) num2.charAt(i) - 48);
        }
//işlem tanımlamaları

        if (sentence.contains("topl")) {
            System.out.println("Sonucunuz: " + (intNum1 + intNum2));
        } else if (sentence.contains("çık")) {
            System.out.println("Sonucunuz: " + (intNum1 - intNum2));
        } else if (sentence.contains("böl")) {
            System.out.println("Sonucunuz: " + (double)(intNum1 / intNum2));
        } else if (sentence.contains("çarp")) {
            System.out.println("Sonucunuz: " + (intNum1 * intNum2));
        }
    }
}




