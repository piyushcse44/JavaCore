package javaBasics;

import java.io.*;

public class FileManupulation {

   public static void main(String[] args) {
        String path = "E:\\java-core\\javaBasics\\test.txt";
        File f = new File(path);

        // Create file if not present
        try{
        System.out.println((f.createNewFile())?"\"File created\"":"File already exists");
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("inside fileNotFoundException" + fnfe.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("inside IOException" + e.getMessage());
        }

        
   }
    
    
    
}
