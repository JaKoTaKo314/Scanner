package org.lauchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName;
        String inputSurname;
        String inputTall;
        int inputAge;
        float inputWeight;

        System.out.println("Podaj Swoje imie: ");
        inputName = scanner.next();

        System.out.println("Podaj Swoje nazwisko: ");
        inputSurname = scanner.next();

        System.out.println("Podaj Swój wiek (liczba całkowita):");
        inputAge = scanner.nextInt();


        System.out.println("Podaj Swóją wzrost(liczby niecałkowite po kropce):"); //Podawać z kropką jako znak dziesiętny
        inputTall = scanner.next();
        float procesTall = Float.parseFloat(inputTall);
        String outTall = String.format ("%.1f", procesTall);

        System.out.println("Podaj Swóją wagę(liczby niecałkowite po przecinku):");   //Podawać z przecinkiem jako znak dziesiętny
        inputWeight = scanner.nextFloat();


        System.out.print("Nazywasz się : "+inputName+" "+inputSurname+",masz "+inputAge+" lat, masz "+outTall+ " cm wzrosu oraz ważysz ");
        System.out.printf("%.1f", inputWeight);
        System.out.print(" kg");


    }
}
