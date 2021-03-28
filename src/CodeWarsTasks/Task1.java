package CodeWarsTasks;
/*** reverse from 123 to 321 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(testSort(123456789));
    }
    public static int testSort(int num) {

        int temp = num;
        String result = "";
        while (temp > 0) {
            result += String.valueOf(temp % 10);
            temp /= 10;
        }
        if (num <= 0) {
            return num;
        } else {
            temp = Integer.parseInt(result);
        }
        return temp;

    }
}
