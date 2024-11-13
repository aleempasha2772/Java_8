package basic;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        int left =0;
        int right = arr.length -1;

        while (left<right){

            if(arr[left]+ arr[right] == target){
                return new int[]{left+1,right+1};
            } else if (arr[left]+ arr[right]<target) {
                left++;
            }else {
                right--;
            }
        }
        return null;
    }
    public static void main(String args[]){
        int[] num = {2, 7, 11, 15};
        int tar = 18;
        int[]  res = twoSum(num,tar);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}
