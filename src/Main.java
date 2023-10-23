import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Zadanie1() {
        System.out.println("Zadanie 1:");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("xyxy");
            } else if (i % 3 == 0) {
                System.out.println("xxx");
            } else if (i % 5 == 0) {
                System.out.println("yyy");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void Zadanie2() {
        System.out.println("Zadanie 2:");
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 0 do 100:");

        while (!hasGuessedCorrectly) {
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Za mało!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Za dużo!");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Gratulacje! Zgadłeś liczbę po " + numberOfTries + " próbach.");
            }
        }
    }

    public static void Zadanie3() {
        int[] numbers = {10, 23, 45, 67, 89, 12, 34, 56, 78, 90, 11};
        System.out.println("Tablica liczb: " + Arrays.toString(numbers));

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
        }

        System.out.println("Największa liczba w tablicy: " + highest);
        System.out.println("Druga co do wielkości liczba w tablicy: " + secondHighest);
    }



    public static void main(String[] args) {
//        Zadanie1();
//        Zadanie2();
//        Zadanie3();
//        Zadanie4();
//        Zadanie5();
//        Zadanie6();
//        Zadanie7();
//        Zadanie8();
    }
}