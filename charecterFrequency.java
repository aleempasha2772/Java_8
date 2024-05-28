import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class charecterFrequency {

    public static void main(String Args[]){

        String name = "Aleem Pasha";

        Map<Character,Long> charecterFrequency = name.chars()
                .mapToObj(c->(char) c)
                .sorted()
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println("Charecter frequency of :" + name + " is "+charecterFrequency);

        /*
        Second way
         */

        Map<String,Long> characterFrequency1  = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println("Charecter frequency 1 of :" + name + " is "+charecterFrequency);

    }
}
