import java.io.*;
class arrayex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[]c=word.toCharArray();
        System.out.println("The given String");
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
            System.out.println(c[i]);
        }
        }
    }
}
