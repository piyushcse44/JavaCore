package javaBasics;

import java.util.Scanner;

public class First {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    // byte inputByte = sc.nextByte();
    // byte range --> [-128,127]; -- 1Byte -- 8 bits -- 2^8 

    // short range --> [-32768,32767] -- 2Byte -- 16 bits -- 2^16

    // int, byte, short, long, float, double, boolean, and char --> primitive data not object

    // IMPORTANT
       // Java Uses Unicode encoding scheme
       // java converts characters to unicode then in binary
       // java converts binary to unicode then charcters
       // RAnge of Char -> ['\u0000','\uffff'] or [0,65,535] -- 2 Byte -- 16 bits
       
    //    System.out.println('0' + " or " + '\u0030' + " or " + (char)48 ); 


    // constants --> use final 
    // final int x =10;

    // System.out.println("piyush\tKumar"); --> '\t' --> space delimeter

    // int age = sc.nextInt();
    // System.out.println((age >=18 ? "Allowed To Vote" : "Does not Allowed To vote"));






    
    
    sc.close();

}

}
