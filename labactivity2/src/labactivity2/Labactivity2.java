/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labactivity2;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Labactivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);

        System.out.println("Ana's Grade: " + ana.getFinalGrade());
        System.out.println(ana.isPassing() ? "Passing" : "Not Passing");

        System.out.println("\nBen's Grade: " + ben.getFinalGrade());
        System.out.println(ben.isPassing() ? "Passing" : "Not Passing");

        System.out.println("\nUpdate Ana's scores to 95 and 101:");
        System.out.println(ana.updateScores(95, 101));
        System.out.println("Grade: " + ana.getFinalGrade());

        System.out.println("\nUpdate Ana's scores to 74 and 75:");
        System.out.println(ana.updateScores(74, 75));
        System.out.println("Grade: " + ana.getFinalGrade());
        System.out.println(ana.isPassing() ? "Passing" : "Not Passing");

        System.out.println("\nUpdate Ana's scores to 75 and 75:");
        System.out.println(ana.updateScores(75, 75));
        System.out.println("Grade: " + ana.getFinalGrade());
        System.out.println(ana.isPassing() ? "Passing" : "Not Passing");

        System.out.println("\nCheck Ben's record again:");
        System.out.println("Grade: " + ben.getFinalGrade());
        System.out.println(ben.isPassing() ? "Passing" : "Not Passing");
    }
}


//You must validate both new scores before assigning either one to ensure that 
//both are valid. This prevents an invalid score from being saved and keeps the student's 
//record accurate.