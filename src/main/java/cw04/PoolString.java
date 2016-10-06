package cw04;

/**
 * Created by evgeniy on 06/10/16.
 */
public class PoolString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        s3 = s3.intern();
        System.out.println(s3 == s1);
    }
}
