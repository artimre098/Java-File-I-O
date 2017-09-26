import java.util.*;
import java.io.*;
public class SearchFromFile
{
    public static void main(String [] args){
               
        File file = new File("numbers.txt");
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the content you are looking for: ");
        String find = kb.next();
        Scanner scanner;
        String Filename = "numbers.txt";
        try{
        
            scanner = new Scanner(file).useDelimiter(",");
            
            while(scanner.hasNext()){
                
                final String lineFromFile = scanner.nextLine();
                
                if(lineFromFile.contains(find)){
                    
                    System.out.println(find);
                    
                    continue;
                }
            
            }
        
        }catch(Exception e){
            
            System.err.println("Exception Here!");
            
        }
        
    }
}
