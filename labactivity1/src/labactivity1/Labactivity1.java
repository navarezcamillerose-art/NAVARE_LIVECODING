/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity1;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Labactivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create student accounts
        printaccount mia = new printaccount("Mia", 10);
        printaccount luis = new printaccount("Luis", -4);

        // Display starting credits
        System.out.println("Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());

        // Test printing pages
        System.out.println(mia.printPages(4) + "; Mia: " + mia.getCredits());
        System.out.println(mia.printPages(7) + "; Mia: " + mia.getCredits());

        // Test adding credits
        System.out.println(mia.addCredits(-3) + "; Mia: " + mia.getCredits());
        System.out.println(mia.addCredits(4) + "; Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
    }
}
