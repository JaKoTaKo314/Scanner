package org.lauchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName;
        String inputSurname;



        inputSurname = scanner.next();
        System.out.println("Podaj Swój wiek:");
        String inputAge;
        inputAge = scanner.next();
        float procesAge = Float.parseFloat(inputAge);
        String outAge = String.format ("%.0f", procesAge);
        System.out.println("Podaj Swóją wzrost:");
        String inputTall;
        inputTall = scanner.next();
        float procesTall = Float.parseFloat(inputTall); // Test github
        String outTall = String.format ("%.1f", procesTall);
        System.out.println("Podaj Swóją wagę:");
        String inputWeight;
        inputWeight = scanner.next();
        float procesWeight = Float.parseFloat(inputWeight);
        String outWeight = String.format ("%.1f", procesWeight);
        System.out.println("Nazywasz się : "+inputName+" "+inputSurname+",masz "+outAge+" lat, masz "+outTall+ " cm wzrosu oraz ważysz "+ outWeight+ " kg" );


    }
}
