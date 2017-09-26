

import javax.swing.*;
import java.io.*;
public class WriteToFile
{
    public static void main(String [] args){
           
        String input = JOptionPane.showInputDialog("input here to write to text file");
         
        try{
        
            File myFile = new File("D:/Galario/myFile.txt"); // creation of file
            
            if(!myFile.exists()){
                myFile.createNewFile();
            }
            
            FileWriter fw = new FileWriter(myFile,true); // check if the file is ready for writing
            BufferedWriter hbw = new BufferedWriter(fw); // our writer
            
            hbw.write("INPUT: " + input); // write into the file
            hbw.newLine();  // nextLine
            hbw.close();
            
            System.out.println("Success!");
        }catch( IOException e){
            System.out.println("Exception Occured!");
        }
    }
}
