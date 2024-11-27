package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCount {
    public static void CharacterCount(String str){
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();

        for(int i=0;i<arr.length;i++){
            if(charCount.containsKey(arr[i])){
                charCount.put(arr[i],charCount.get(arr[i])+1);
            }else {
                charCount.put(arr[i],1);
            }
        }
        System.out.println(charCount);

        Set<Character> charInString = charCount.keySet();
        System.out.println(charInString);
        for (Character ch: charInString){
            if(charCount.get(ch)>1){
                System.out.println(ch +" : "+ charCount.get(ch));
            }
        }
    }

    public static void main(String args[]){
        String str = "JavaJ2EE";
        CharacterCount(str);
    }
}
