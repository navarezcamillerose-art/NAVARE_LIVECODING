/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labactivity2;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class LabGrade {

    String studentName;
    int quizScore;
    int labScore;

    // Constructor
    LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;
        this.quizScore = (quizScore >= 0 && quizScore <= 100) ? quizScore : 0;
        this.labScore = (labScore >= 0 && labScore <= 100) ? labScore : 0;

    }

    // Update both scores only if both are valid
    boolean updateScores(int quizScore, int labScore) {
        if (quizScore < 0 || quizScore > 100
                || labScore < 0 || labScore > 100) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;
        return true;
    }

    // Calculate weighted final grade
    double getFinalGrade() {
        return (quizScore * 0.40) + (labScore * 0.60);
    }

    // Check if the student passes
    boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }
}
