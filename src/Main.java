//LAB 1 Techniki Agentowe - Szymon Koster
import java.util.*;

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
        System.out.println("\n");
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
        System.out.println("\n");
    }

    public static void Zadanie3() {
        System.out.println("Zadanie 3:");
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
        System.out.println("\n");
    }

    public static void Zadanie4() {
        System.out.println("Zadanie 4:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wyraz lub liczbę:");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Odwrócony wyraz/liczba: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Wprowadzony wyraz/liczba jest palindromem.");
        } else {
            System.out.println("Wprowadzony wyraz/liczba nie jest palindromem.");
        }
        System.out.println("\n");
    }

    public static void Zadanie5() {
        System.out.println("Zadanie 5:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź zdanie:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        boolean hasDuplicates = false;

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Wyraz '" + entry.getKey() + "' występuje " + entry.getValue() + " razy.");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("Żaden wyraz się nie powtórzył.");
        }
        System.out.println("\n");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Zadanie6() {
        System.out.println("Zadanie 6:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę, aby sprawdzić czy jest liczbą pierwszą:");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Liczba " + number + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + number + " nie jest liczbą pierwszą.");
        }
        System.out.println("\n");
    }

    public static void Zadanie7() {
        System.out.println("Zadanie 7:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wysokość piramidy:");
        int height = scanner.nextInt();

        System.out.println("Wybierz typ piramidy (1 - liczby, 2 - '*'):");
        int choice = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (choice == 1) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static double kilometersToLandMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double kilometersToNauticalMiles(double kilometers) {
        return kilometers * 0.539957;
    }

    public static void Zadanie8() {
        System.out.println("Zadanie 8:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź odległość w kilometrach:");
        double kilometers = scanner.nextDouble();

        double landMiles = kilometersToLandMiles(kilometers);
        double nauticalMiles = kilometersToNauticalMiles(kilometers);

        System.out.println(kilometers + " km to " + landMiles + " mil lądowych.");
        System.out.println(kilometers + " km to " + nauticalMiles + " mil morskich.");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
        Zadanie5();
        Zadanie6();
        Zadanie7();
        Zadanie8();
    }
}