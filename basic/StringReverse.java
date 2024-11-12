package basic;

import java.util.Arrays;

public class StringReverse {
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
    public static void main(String args[]){
        String original = "Hello World";

        /*
        Using String builder class
         */
        System.out.println("String Reverse " +reverse(original));



        char[] str =  original.toCharArray();
        int first = 0;
        int last = str.length -1;
        char temp;
        while(first<last){
            temp = str[first];
            str[first] = str[last];
            str[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reverse of a String"+ Arrays.toString(str));

        char[] str1 =  original.toCharArray();
        char temp1;
        int len = str1.length;
        for(int i=0;i<str1.length/2;i++){
            temp1 = str1[i];
            str1[i] = str1[len-i-1];
            str1[len-i-1] = temp1;
        }
        System.out.print("Reverse of a String 2 "+ Arrays.toString(str1));

    }



}
