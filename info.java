
import java.io.*;
 public class info{
    public static void main(String[]t)throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your name :");
        String a = b.readLine();
        System.out.println("Enter your college :");
        String B = b.readLine();
        System.out.println("Enter your dept :");
        String c = b.readLine();
        System.out.println("My name is "+a );
        System.out.println("My clg name is :"+B);
        System.out.println("My dept name is :"+c);
    }
}