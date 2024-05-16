

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}


interface FuncInterface_2{
    void absstractSum(int x);

    default void normalFun2(){
        System.out.println("Okay");
    }
}



public class one {
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);

        FuncInterface_2 fobj2 = (int x)->System.out.println(2+x);
        fobj2.absstractSum(2);
    }
}
