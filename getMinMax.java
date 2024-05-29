import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summarizingInt;

public class getMinMax {
    public static void main(String Args[]){
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 6, 1, 4);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        max.ifPresent(maxValue -> System.out.println("Maximum value: " + maxValue));
        min.ifPresent(minValue -> System.out.println("Minimum value: " + minValue));

        IntSummaryStatistics summaryStatistics = numbers.stream()
                .collect(summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());


    }
}
