class parent{
    public static void  print(){
        System.out.println("Print from parent class");
    }
}
class child extends parent{
     public static void print(){
        System.out.println("Print from child class");
    }
}
public class methodoverriding{
            public static void main(String[]a){
                child obj = new child();
                obj.print();
            }
        }

