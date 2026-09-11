class ref{
    int value = 10;
}
public class reftrap{
    public static void main(String[]a){
        ref a1 = new ref();
        ref a2 = a1;
        System.out.println("value of a :"+a1.value);
        System.out.println("value of b :"+a2.value);
    }
}