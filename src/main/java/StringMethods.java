public class StringMethods {
    public static void main(String[] args) {
        System.out.println(endsWith("Hello", "llo"));
        System.out.println(endsWith("Hello", "llow"));

        System.out.println(startsWith("Hello", "Hell"));
        System.out.println(startsWith("Hello", "Helw"));

        System.out.println(startsWith("Hello world!", "l"));
        System.out.println(startsWith("Hello world!", "l", 2));
    }

    static boolean startsWith(String word, String prefix) {
        return checkSub(word, prefix, "start", 0);
    }

    static boolean startsWith(String word, String suffix, int offset) {
        return checkSub(word, suffix, "end", offset);
    }

    static boolean endsWith(String word, String suffix) {
        return checkSub(word, suffix, "end", 0);
    }



    private static boolean checkSub(String word, String sub, String key, int offset) {
        char[] arrayWord = word.toCharArray();
        char[] arrayPrefix = sub.toCharArray();
        int wordIndex = key.endsWith("start") ? 0 : word.length() - sub.length();
        for (int i = offset, sufIndex = 0; i < sub.length(); i++, sufIndex++, wordIndex++) {
            if (arrayWord[wordIndex] != arrayPrefix[sufIndex]) return false;
        }
        return true;
    }
}
