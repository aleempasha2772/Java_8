public class Swap {
    public static void main(String Args[]){
        int a = 10;
        int b = 20;
        System.out.println("Before : " +a+" "+b);
//        int c=a;
//        a=b;
//        b=c;

//        a = a+b;
//        b= a-b;
//        a = a-b;

//        a= a*b;
//        b= a/b;
//        a= a/b;

        a = a^b;
        b= a^b;
        a = a^b;

        System.out.println("After  : " +a+" "+b);


    }
}
