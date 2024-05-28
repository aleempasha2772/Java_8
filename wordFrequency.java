import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class wordFrequency {
    public static void main(String Args[]){

        List<String> words = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");

        Map<String,Long> wordFrequency = words.stream()
                .collect(groupingBy(Function.identity(),counting()));

        System.out.println("Word frequency: "+ wordFrequency);
    }
}
