import java.io.*;
public class ReadFromFile
{
   public static void main(String [] args){
       try{
       BufferedReader br = new BufferedReader(new FileReader( "D:/Sample.txt"));
       
       String getOut= "";
       
       String search = "rey"; // the text that you want to search
       
       while( (getOut = br.readLine()) != null ){
           if( getOut.equalsIgnoreCase(search)){
               System.out.println("FOUND");
               System.out.println(getOut);
               break;
            }
       }        
      
    }catch(Exception e){
        System.out.println("Exception Occured!");
    }
    }
}
