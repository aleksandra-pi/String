package zad8;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        if (firstWord.equals(secondWord)){
            System.out.println("Words are equal");
        } else {
            System.out.println("Words are not equal");
        }
    }
}
