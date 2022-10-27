import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {


    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner entrance = new Scanner(System.in);
        int number = entrance.nextInt();
        System.out.println("Faktorijel tog broja je: " + Calculating.factorijel(number));
        System.out.println("Sinus datog broja je: " + Calculating.sinus(number));
    }


}
