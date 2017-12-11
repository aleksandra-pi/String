package zad2;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int n = scanner.nextInt();

        System.out.println(word.substring(word.length() - n));
    }
}