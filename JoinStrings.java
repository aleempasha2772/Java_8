import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String Args[]){
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        System.out.println("After adding prefix suffix and delimiter : "+ words.stream().collect(Collectors.joining(",", "[", "]")));
    }
}
