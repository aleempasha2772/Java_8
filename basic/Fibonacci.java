package basic;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonnaci(int n){
        int first = 0;
        int second = 1;
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(first);
        nums.add(second);
        for(int i=2;i<n;i++){
            int next = first + second;
            nums.add(next);
            first = second;
            second = next;
        }
        return nums;
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(fibonnaci(n));
    }
}
