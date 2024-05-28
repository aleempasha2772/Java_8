import java.util.Arrays;
import java.util.List;

public class NumberSum {

    /*
    Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
     */
    public static void main(String args[]){
        List< Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int even = numbers.stream()
                .filter(i->i%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("even sum:"+even);

        int odd = numbers.stream()
                .filter(i -> i%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Odd sum "+odd);
    }
}
