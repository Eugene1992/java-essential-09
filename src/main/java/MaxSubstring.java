public class MaxSubstring {
    public static void main(String[] args) {
        /*int a = 3;
        int b = 2;
        int c = 1;

        if (a > b && a > c) {
            System.out.println("a");
        } else if (b > a && b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }*/
        getMaxSub("lowsen", "");
    }

    static String getMaxSub(String one, String two) {
        for (int i = 0; i < one.length(); i++) {
            for (int j = i; j < one.length(); j++) {
                String cur = one.substring(i, j);
                System.out.println(cur);
            }
        }
        return null;
    }
}
