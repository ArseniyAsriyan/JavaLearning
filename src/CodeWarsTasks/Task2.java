package CodeWarsTasks;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {
        // Happy Coding ^_^

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
