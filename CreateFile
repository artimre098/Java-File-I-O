
import javax.swing.*;
import java.io.*;
public class CreateFile
{
    public static void main(String [] args){
        
        String input = JOptionPane.showInputDialog("input name of FILE");
        try{
            File myFile = new File("D:/" + input +".txt"); // directory
            
            if( myFile.createNewFile()){
                System.out.println("Your File Successfully Created");
            }else{
                System.out.println("File Already Exist!");
            }
        }catch(IOException e){
            System.out.println("Exception Occured!");
        }
    }
}
