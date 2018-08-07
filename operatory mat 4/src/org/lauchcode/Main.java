package org.lauchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Podaj pierwszą liczbę: ");
        firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        secondNumber = scanner.nextInt();

        float nextResult = firstNumber / (float) secondNumber;
        System.out.println("Wynik dzielenia: "+nextResult);
    }
}
