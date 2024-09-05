package Module4;

public class String12 {
    public static void main(String[] args) {
        String s1 = "Ivan";
        String s2 = "Ivan";
        String s3 = new String("Ivan");
        String s4 = new String(s1);
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); // true
    }
}
