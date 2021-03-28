package CodeWarsTasks;
/*** Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * example: SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57" */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {

        double result = 1.0;
        double a = 1.0;
        while (n != 1) {
            n--;
            a += 3.0;
            result += (1.0 / a);
        }

        return String.format("%.2f", result);
    }
}
