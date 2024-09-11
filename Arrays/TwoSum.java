package Arrays;

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
    public static void main(String args[]){
        int[] num = {2, 7, 11, 15};
        int tar = 9;
        int[] result = twoSum(num,tar);
        System.out.print("["+result[0]+","+result[1]+"]");
    }
}
