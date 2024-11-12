package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {
    public static List<Integer> duplicates(int[] nums){
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                duplicates.add(nums[i]);
            }else {
                seen.add(nums[i]);
            }
        }
        return duplicates;
    }


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
        System.out.println("Hashset Approch");
        System.out.println(duplicates(numbers));
    }
}
