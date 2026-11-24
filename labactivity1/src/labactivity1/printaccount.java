/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labactivity1;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class printaccount {
   private String  studentname;
   private int credits;
   
   
   //constructor
   public printaccount(String studenname,  int credits){
        this.studentname= studentname;
        this.credits= credits;
        
   }
   
     // Add credits if positive
    public boolean addCredits(int amount) {
        if (amount > 0) {
            credits += amount;
            return true;
            
            
             }
        return false;
    }

    // Print pages if credits are enough
    public boolean printPages(int pages) {
        if (pages > 0 && credits >= pages) {
            credits -= pages;
            return true;
        }
        return false;
    }

    // Get current credits
    public int getCredits() {
        return credits;
    }
}
