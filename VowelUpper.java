import java.io.*;
class VowelUpper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String s = br.readLine();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                c[i] = Character.toUpperCase(c[i]);
            }
        }
        System.out.println("Result: " + new String(c));
    }
}