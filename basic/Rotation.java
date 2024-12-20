package basic;

import java.util.Arrays;
import java.util.List;

public class Rotation {
    public static void leftRotation(int[] arr, int k){
        k = k%arr.length;
        int temp;
        for(int i=0;i<k;i++){
            temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length- 1] = temp;
        }
    }

    public static void rightRotation(int[] arr,int k){
        k = k%arr.length;
        int temp;
        for(int i=0;i<k;i++){
            temp = arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] arr1 = {10,20,30,40,50};
        int k1 = 2;
        leftRotation(arr,k);
        rightRotation(arr1,k1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
