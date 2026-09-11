import java.util.Scanner;
class primenumber{
    public static void main(String[]t){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for( int i=1;i<=n;i++){
            if(n%i==0){
            count ++;
        }
    }
    if(count==2){
    System.out.println("It is the prime number");
    }
    else
        {
        System.out.println("Not a Prime number");
        }
        sc.close();
    }
}
