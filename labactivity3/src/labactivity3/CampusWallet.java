/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labactivity3;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class CampusWallet {

    private String owner;
    private int balance;

    // Constructor with owner and starting balance
    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // Constructor with owner only
    public CampusWallet(String owner) {
        this(owner, 0);
    }

    // Add credits if the amount is positive
    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }

        return false;
    }

    // Transfer credits to another wallet
    public boolean transferTo(CampusWallet recipient, int amount) {

        if (recipient == null || recipient == this || amount <= 0 || balance < amount) {
            return false;
        }

        balance -= amount;
        recipient.balance += amount;

        return true;
    }

    // Return the current balance
    public int getBalance() {
        return balance;
    }
}
