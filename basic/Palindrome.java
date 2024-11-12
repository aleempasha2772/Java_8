package basic;

public class Palindrome {
    public static boolean palindrome(String s){
        int left = 0;
        int right =  s.length() - 1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        String a = "nitiin";
        if (palindrome(a)){
            System.out.println("Given String is Palindrome");
        }else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
