package basic;

import java.util.ArrayList;

public class DuplicateNumbers {
    public static void main(String args[]){
        int[] numbers = {1, 2,3, 3, 4, 5,5,8,9,9};
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    nums.add(numbers[i]);
                }
            }
        }
        System.out.println(nums);
    }
}
