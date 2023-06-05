import java.io.*;

class trycatch {

    public trycatch() {
    }

    public static void main(String[] args) {
        System.out.println("start");
        int a, b, c;
        a = 2;
        b = 0;


        try {
            System.out.println("Came in try block");
            c = a / b;
        } catch (Exception e) {
            System.out.println("came in catch");
            System.out.println(e);
        } finally {
            System.out.println("finally block is executing");
        }
    }

}