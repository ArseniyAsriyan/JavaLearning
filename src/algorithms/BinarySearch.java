package algorithms;


import java.util.Arrays;
import java.util.Scanner;

/*** Делим отсортированное множество, проверяем, делитель больше или меньше искомого, отсекаем лишнюю часть,
 * повторяем, пока не найдем искомое число, либо до конца массива */

public class BinarySearch {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 1, 2, 5, 25, 66, 87, 79, 122, 214, 11324, 57247, 24357247, 1724582828 };

        System.out.println("Данное приложение использует алгоритм бинарного поиска, применимого в отсортированном массиве.");
        Thread.sleep(1000);
        System.out.print("Введите число для поиска его индекса: ");
        int numberToSearch = scanner.nextInt();
        System.out.println("");
        System.out.print("Результат через..."); Thread.sleep(1000); System.out.print(" 3"); Thread.sleep(1000); System.out.print(" 2"); Thread.sleep(1000); System.out.println(" 1"); Thread.sleep(1000);
        int result = BinarySearch(array, numberToSearch);


        if(result != -1) {
            System.out.println(String.format("Искомое число %d находится в массиве под индексом %d.", numberToSearch, result));
        } else {
            System.out.println("Числа " + numberToSearch + " в массиве не найдено.");
        }
        System.out.println(String.format("Для поиска в массиве цикл прошел %d итераций. \nПрограмма завершается.", counter));
    }

    public static int BinarySearch(int[] array, int numberToSearch) {
        int min = 0;
        int max = array.length - 1;
        int result = -1;
        while( min <= max) {
            counter++;
            int mid = (min + max) / 2;
            int guess = array[mid];
            if (guess == numberToSearch) {
                result = mid;
                break;
            }
            if(guess > numberToSearch) {
                max = mid - 1;
            }
            if (guess < numberToSearch) {
                min = mid + 1;
            }
        }
        return result;
    }
}
