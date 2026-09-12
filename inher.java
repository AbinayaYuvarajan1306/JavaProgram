class Student {
    String name = "Arun";
    int rollno = 2;
}
class Marks extends Student {
    int mark1 = 60;
    int mark2 = 90;
    int mark3 = 78;
}
class Result extends Marks {
    int total = mark1 + mark2 + mark3;
    double average = total / 3.0;
    void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
public class inher {
    public static void main(String[] a) {
        Result r = new Result();
        r.displayResult();
    }
}