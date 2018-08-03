package org.lauchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Swoje imie: ");
        String inputName;
        inputName = scanner.next();
        System.out.println("Podaj Swoje nazwisko: ");
        String inputSurname;
        inputSurname = scanner.next();
        System.out.println("Podaj Swój wiek:");
        String inputAge;
        inputAge = scanner.next();
        double procesAge = Double.parseDouble(inputAge);
        String outAge = String.format ("%.1f", procesAge);
        System.out.println("Podaj Swóją wzrost:");
        String inputTall;
        inputTall = scanner.next();
        double procesTall = Double.parseDouble(inputTall); // Test github
        String outTall = String.format ("%.1f", procesTall);
        System.out.println("Podaj Swóją wagę:");
        String inputWeight;
        inputWeight = scanner.next();
       double procesWeight = Double.parseDouble(inputWeight);
        String outWeight = String.format ("%.1f", procesWeight);
        System.out.println("Nazywasz się : "+inputName+" "+inputSurname+",masz "+outAge+" lat, masz "+outTall+ " cm wzrosu oraz ważysz "+ outWeight+ " kg" );

    }
}
