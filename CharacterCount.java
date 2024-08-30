import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CharacterCount {
//    public static void main(String[] args) {
//        String input = "Java Articles are Awesome";
//
//        // Convert the string to a stream of characters, and collect the count of each character
//        Map<Character, Long> characterCount = input.chars()
//                .mapToObj(c -> (char) c) // Convert int to char
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//
//        // Print the result
//        characterCount.forEach((character, count) -> System.out.println(character + ": " + count));
//    }
//

    public static void main(String args[]){
        String string = "Aleem Pasha";
        Map<Character,Long> characterCount = string.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        characterCount.forEach((character, count) ->System.out.println(character+" "+" "+count) );

    }
}
