import java.io.*;
 
public class ReadLinesFromFile {
 
    public static void main(String a[]){
        BufferedReader br = null;
        String strLine = "";
        int  sum = 0 , num =0,  count = 0 ,ave = 0;
        try {
            
            br = new BufferedReader( new FileReader("numbers.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
                num = Integer.parseInt(strLine); // convert string to int
                sum += num; // add all element in the text file
                count++; // count all element in the text file
            }
            ave = sum / count;
            System.out.println("The sum is = " + sum);
            System.out.println("The number of element is = " + count);
            System.out.println("The average of the numbers is = " + ave);
            
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: fileName");
        } catch (IOException e) {
            System.err.println("Unable to read the file: fileName");
        }  catch( Exception e){
            System.err.println("Any Exception");
        }
    }
}
