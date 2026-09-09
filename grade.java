import java.io.*;
class grade{
    public static void main(String[]t)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your marks:");
        int marks = Integer.parseInt(br.readLine());
        if(marks<35){
            System.out.print("Fail");
        }
        else{
            System.out.print("pass");
        }

    }
}