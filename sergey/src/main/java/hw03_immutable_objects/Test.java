package hw03_immutable_objects;

/**
 * Created by Serezha on 05.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        //Example on String
        immutableOperation();
        System.out.println();
        mutableOperation();
    }

    public static void immutableOperation() {
        String str=new String("String is immutable class in Java object value cann't alter once created...");
        System.out.println(str);
        str.replaceAll("String", "StringBuffer");
        System.out.println(str);
        str.concat("Concating value ");
        System.out.println(str + "HashCode Value  " + str.hashCode());
        str=str.concat("Concating value ");
        System.out.println(str + "HashCode Val  " + str.hashCode());

    }

    public static void mutableOperation(){
        StringBuffer str=new StringBuffer("StringBuffer is mutable class in Java object value can  alter once created...");
        System.out.println(str + "HashCode Val - " + str.hashCode());
        str.replace(0, 12, "String");
        System.out.println(str + "HashCode Val - " + str.hashCode());

    }
}
