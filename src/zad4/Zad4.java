package zad4;

import java.util.Scanner;

public class Zad4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();
            char first = word.charAt(0);
            if (Character.isDigit(first))
                System.out.println("First character is a digit");
            else
                System.out.println("First character is not a digit");
        }
    }
