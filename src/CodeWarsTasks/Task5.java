package CodeWarsTasks;

import java.math.BigInteger;
import java.util.Random;

/*** Define a function that takes one integer argument and returns logical value true or false depending on if the integer is a prime.

 Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.

 Requirements
 You can assume you will be given an integer input.
 You can not assume that the integer will be only positive. You may be given negative numbers as well (or 0).
 NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out. Numbers go up to 2^31 (or similar, depends on language version). Looping all the way up to n, or n/2, will be too slow.
  */

public class Task5 {

    public static void main(String[] args) {
        System.out.println(isPrime(1)); /* false */
        System.out.println(isPrime(2));  /* true  */
        System.out.println(isPrime(-1)); /* false */
        System.out.println(isPrime(9)); /* false */
        System.out.println(isPrime(73)); /* true */
        System.out.println(isPrime(1354594429)); /* true */

    }


    public static boolean isPrime(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20); // это просто пздц....
    }
}