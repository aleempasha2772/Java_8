package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /* Two-pointer approch */
    public static int[] twoSum(int[] numbers,int target){
        int left = 0;
        int right = numbers.length -1;

        while (left<right){
            int current_sum = numbers[left] + numbers[right];
            if (current_sum == target){
                return new int[]{left+1,right+1};
            }else if(current_sum<target){
                left++;
            }else {
                right--;
            }
        }
        return null;
    }


    /*
    HashMap Approch
     */
    public static int[] twoSum2(int[] numbers, int target){
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<numbers.length -1;i++) {
            int complement = target - numbers[i];
            if (mpp.containsKey(complement)) {
                return new int[]{mpp.get(complement), i};
            }
            mpp.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String args[]){
        int[] num = {2, 7, 11, 15};
        int tar = 9;
        int[] result = twoSum(num,tar);
        int[] result1 = twoSum2(num,tar);
        System.out.println("["+result[0]+","+result[1]+"]");
        System.out.println("["+result1[0]+","+result1[1]+"]");
    }
}
