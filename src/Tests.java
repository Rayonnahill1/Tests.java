import java.text.DecimalFormat;

public class Tests {
    public static void main(String[] args) {
        // variables for the test scores
        double testScore1 = 88.2;
        double testScore2 = 78.9;
        double testScore3 = 97.6;

        //  average of the test scores
        double average = (testScore1 + testScore2 + testScore3) / 3;

        // format the average to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        // Display the test scores and averages
        System.out.println("Test score 1:   " + testScore1);
        System.out.println("Test score 2:   " + testScore2);
        System.out.println("Test score 3:   " + testScore3);
        System.out.println("The average of 3 test scores is:  " + df.format(average));
    }
}
