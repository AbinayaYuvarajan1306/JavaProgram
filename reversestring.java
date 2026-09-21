import java.util.Scanner;
import java.util.Stack;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> stack = new Stack<>();
        System.out.print("Enter a String");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
    }
    String reversedString = "";
    while(!stack.isEmpty()){
        reversedString += stack.pop();
    }
    System.out.println("Original String:" +str);
    System.out.println("Reversed string :" +reversedString);
    sc.close();
}  
}
