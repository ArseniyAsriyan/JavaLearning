package CodeWarsTasks;
/*** Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

 For example:

 summation(2) -> 3
 1 + 2

 summation(8) -> 36
 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }
    public static int summation(int n) {
        int summ = 0;
        for (int i = 1; i < n + 1; i++) {
            summ += i;
        }

        return summ;
    }
}
