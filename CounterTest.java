package javaniitwork;
import java.util.*;
public class CounterTest {

    // Counting odd numbers.
    public void testCountingOddNumbers() {
        System.out.println("testCountingOddNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6);
        long expected = 3l;
        long actual = Counter.countIf(ci, Behaviours::checkOddNumber);
        Assert.assertEquals(expected, actual);
    }

    //Counting prime numbers.
    public void testCountingPrimeNumbers() {
        System.out.println("testCountingPrimeNumbers");
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long expected = 4l;
        long actual = Counter.countIf(ci, Behaviours::checkPrimeNumber);
        Assert.assertEquals(expected, actual);
    }    

     // Counting palindromes
    public void testCountingPalindromes() {
        System.out.println("testCountingPalindromes");
        List<String> cs = Arrays.asList("madam", "test", "tacocat", "hello");
        long expected = 2l;
        long actual = Counter.countIf(cs, Behaviours::checkPalindrome);
        Assert.assertEquals(expected, actual);
    }

}