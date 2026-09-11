import java.util.Scanner;
class operation{
    public static void main(String[]t){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add :"+ (a+b));
        System.out.println("Sub:"+ (a-b));
        System.out.println("Multiply :"+ (a*b));
        System.out.println("Division :"+ (a/b));
        System.out.println("Modulus : "+ (a%b));
        sc.close();
    }
}