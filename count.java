import java.util.Scanner;
public class count {
    public static void main(String[]args){
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Enter a String");
        String sc = scanner.nextLine();
        int a = 0;
        int d = 0;
        int s = 0;
         for(int i=0; i < sc.length(); i++){
        char b = sc.charAt(i);
        if(Character.isLetter(b)){
            a++;
        }
        else if (Character.isDigit(b)){
            d++;
        }
        else{
            s++;
        }
    }
    System.out.println("Number of letters: " + a);
    System.out.println("Number of digits: " + d);
    System.out.println("Number of special characters: " + s);
    scanner.close();
}
}
