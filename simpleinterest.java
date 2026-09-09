
class simpleinterest {
    public static void main(String[] args) {

        int p = 2500;
        int t = 2;
        int r = 5;

        int si = (p * t * r) / 100;

        System.out.println("Principal Amount: Rs." + p);
        System.out.println("Time: " + t + " years");
        System.out.println("Rate of Interest: " + r + "%");
        System.out.println("Simple Interest: Rs." + si);
    }
}