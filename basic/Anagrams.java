package basic;

import java.util.Arrays;

public class Anagrams {

    public static void isAnagrams(String str1, String str2){
        boolean status = true;
        if (str1.length() != str2.length()){
            status = false;
        }else {
            char[] char1 = str1.toLowerCase().toCharArray();
            char[] char2 = str2.toLowerCase().toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            status = Arrays.equals(char1,char2);
        }

        if (status){
            System.out.println(" strings Are Anagrams ");
        }else {
            System.out.println("Not Anagrams");
        }

    }

    public static void main(String args[]){
        String str1 = "Aleem";
        String str2 = "meeLAa";
        isAnagrams(str1,str2);
    }
}
