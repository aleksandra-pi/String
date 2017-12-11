package zad3;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if ( word.endsWith("M")|| word.endsWith("m")) {
            System.out.println("Word ends with 'm' or 'M' ");
        } else {
            System.out.println("Word doesn't end with 'm' or 'M'");
        }
    }
}
