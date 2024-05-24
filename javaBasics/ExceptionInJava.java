package javaBasics;

public class ExceptionInJava {

    public static void main(String[] args) {
        try{
            int x = 10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Found exception msg:"+e.getMessage());
        }
        System.out.println("Outside try and catch block");
    }
    
}
