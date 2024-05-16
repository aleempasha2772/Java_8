import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InternalIteration {
    public static void main(String Args[]){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("First Method");
        for(int i=0;i< values.toArray().length;i++){
            System.out.println(values.get(i));
        }
        System.out.println("Using Iterator");
        Iterator<Integer> i = values.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Using normal looping");
        for(int j:values){
            System.out.println(j);
        }
    }
}
