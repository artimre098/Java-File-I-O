import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;    // we cannot move this inside the try block
      FileOutputStream out = null;   // because we will use this in finally block

      try {
         in =  new FileInputStream("D:/input.txt");    // where you would like to copy
         out = new FileOutputStream("D:/output.txt"); // the destination of your copied text
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
