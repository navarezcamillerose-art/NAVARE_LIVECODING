/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity3;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Labactivity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        System.out.println("Initial Balances:");
        System.out.println("Aly: " + aly.getBalance());
        System.out.println("Ben: " + ben.getBalance());

        System.out.println("\nAly transfers 35 credits to Ben: " + aly.transferTo(ben, 35));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        System.out.println("\nAly tries to transfer 70 credits: " + aly.transferTo(ben, 70));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        System.out.println("\nAly transfers 10 credits to herself: " + aly.transferTo(aly, 10));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        System.out.println("\nBen deposits 15 credits: " + ben.deposit(15));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        System.out.println("\nAly transfers all remaining credits to Ben: " + aly.transferTo(ben, 65));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test 1: Zero-credit transfer
        System.out.println("\nZero-credit transfer: " + aly.transferTo(ben, 0));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test 2: Transfer to null
        System.out.println("\nTransfer to null: " + ben.transferTo(null, 10));
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());
    }
}
