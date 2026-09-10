public class anagram {
    public static void main(String[]args){
        String a = "madam";
        String b = "adamm";
        System.out.println("the give string :"+anagrammethod(a,b));
    }
        static boolean anagrammethod(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        int []c=new int[256];
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)]++;
            c[b.charAt(i)]--;
        }
        for(int count:c){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}