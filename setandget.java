class Student {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class setandget {

    public static void main(String[] a) {
        Student s = new Student();
        s.setName("Abi");
        s.setAge(20);
        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());
        s.setName("hema");
        s.setAge(20);
        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());
    }
}