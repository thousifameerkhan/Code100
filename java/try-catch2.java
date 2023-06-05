import java.io.*;
//import java.util.*;
class trycatch2{

    public static void  main(String[] args){
        try {
            int a,b,c;
            a = 2;
            b = 0;
            throw new ArithmeticException("I have thrown my Exception");

        }
        catch(ArithmeticException e)
        {
           System.out.println("Division by zero");
            e.printStackTrace();
        }
        finally {
            System.out.println("I am in finally block");
            System.out.println("I am in finally block 2");

        }
    }
}