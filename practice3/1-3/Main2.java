public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append("トマト ");
        }

        System.out.println(sb.toString());

        String str1 = "Hello, World!";
        boolean matches_1 = str1.matches("Hello, World!");
        boolean matches_2 = str1.matches("H.+");

        System.out.println("正確にマッチするか: " + matches_1);
        System.out.println("'H' の後に任意の一文字が続くか: " + matches_2);
        System.out.println("Hello".matches("H.*o"));
        System.out.println(str1.matches("H.*"));
        System.out.println("aaa".matches("a+"));
        System.out.println("aa".matches("a?"));
        System.out.println("aaa".matches("a{2,3}"));
        System.out.println("aaaa".matches("a{2,3}"));

        String str2 = "あいう,かきく,さしす,たちつ";
        String[] array = str2.split(",");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String str = "I love cats.";
        String replacedStr = str.replace("cats", "dogs");
        System.out.println(replacedStr);
    }
}
