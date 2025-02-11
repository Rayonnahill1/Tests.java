import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    private double ave;  //  the calculated average
    private int count;   // the number of test scores entered
    private int score;   //  the latest test score

    // Constructor
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }

    // This  is the method to get test scores from the user and to calculate the average
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tempScore;

        System.out.println("Enter test scores (press -1 to quit): ");
        tempScore = scanner.nextInt(); // Priming the loop

        while (tempScore != -1) {
            sum += tempScore;
            score = tempScore; // Store latest entered score
            count++;

            System.out.println("Enter test scores (press -1 to quit): ");
            tempScore = scanner.nextInt(); // Get next score
        }

        // Calculate the average if at least one score is entered
        if (count > 0) {
            ave = (double) sum / count;
        } else {
            ave = Double.NaN; // Prevent division by zero
        }

        scanner.close();
    }

    // Returns the computed average
    public double getAve() {
        return ave;
    }

    // Returns the number of test scores entered
    public int getCount() {
        return count;
    }

    // Returns the last entered test score
    public int getScore() {
        return score;
    }

    // Allows setting a new test score
    public void setScore(int newScore) {
        score = newScore;
    }

    // Formats and displays the results
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(ave) + ".";
    }
}

