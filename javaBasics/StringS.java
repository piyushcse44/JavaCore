package javaBasics;

public class StringS {
    public static void main(String[] args) {

        // 1) String is non- primitive DataType --> does not have fixed size
        // 2) String is the sequence of character and implements CharSequence inteface to put char array 
        //      into string for eg:-
                // char [] st = {'P','i','y','u','s','h'};
                // String str = new String(st);
        // 3) String is  a class
        //   signature :- public final class String extends Object implements CharSequence,Serializable,Comprable
                        //   {

                        //   }

        // 4) String is immutable    
        
        // 5) To create string there are three class:-
            //   0) String st = "piyush"
            //   i) String class -- String st = new String();
            //   ii) StringBuffer class -- StringBuffer sBuffer = new StringBuffer();
            //   iii) StringBuilder class -- StringBuilder sBuilder = new StringBuilder();


        // String Constant pool or String literal pool is the area in heap memory where java
        // stores string literal values. 
        // String st ="piyush"  -> created only one object in string litral pool
        // String str = new String("oi") --> created two object one in heap outside slp and
             //  other inside slp and jvm internally referes it
        // String s1 = "piyush"  -> now 0 object is created because on object with "piyush" 
             //   already created in slp so it simply refrence that object
        // String str1 = new String*"oi" --> created one object only inside heap but does not create 
             //    inside slp because a object with "oi" already present in slp
        // grabage collector doesnot apply in slp because jvm internally handles it

        // Difference b/w "==" and ".equals()"
            // String s1= new String("piyush");
            // String s2 = new String("piyush");
            // System.out.println((s1==s2)? "true":"False");  --- false
            // System.out.println((s1.equals(s2))? "true":"False"); -- true

            // String str1= "piyush";
            // String str2 = "piyush";
            // System.out.println((str1==str2)? "true":"False");  -- true


        // String name ="Piyush Kumar";
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
        
        // Math.random(); //It will produce random number b/w 0.0 and 1.0


    }
    
}
