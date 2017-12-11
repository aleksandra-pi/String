package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int length = word.length();
        if ( word.charAt(0) == word.charAt(length - 1)){
        System.out.println("First and last digit are the same");
        } else {
            System.out.println("First and last digit are different");
        }
    }
}
