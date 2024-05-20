import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {



    void sayHelo(){
        System.out.println("hi");
    }

    public static void main(String Args[]){


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<Integer> myList1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> myList2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> myList3 = Arrays.asList(15,2,30,4,5,65);
        List<Integer> myList4 = Arrays.asList(15,2,30,4,5,65);

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(i ->System.out.println(i));

        myList1.stream()
                .filter(i->i%2==0)
                //.filter(i-> i%5==0)
                .forEach(System.out::println);
        System.out.println("This is regarding strems"); 
        System.out.println(myList2.stream()
                .map(i-> i*2)
                .reduce(0,(c,e)->c+e));

        System.out.println(myList3.stream()
                .filter(i->i%5 == 0)
                .reduce(0,(c,e)->c+e)
        );
        System.out.println("This is regarding strems");
        System.out.println(myList4.stream()
                .filter(i->i%5 == 0)
                .map(i->i*2)
                .findFirst()
                .orElse(0)
        );

//        ()->{
//            System.out.println("hi");
//        }


    }
}
