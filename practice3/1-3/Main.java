public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "";
        int len = str1.length();
        boolean isEqual = str1.equalsIgnoreCase(str2);
        boolean str1IsEmpty = str1.isEmpty();
        boolean str3IsEmpty = str3.isEmpty();

        System.out.println("大文字と小文字を区別せずに文字列が等しいですか?:" + isEqual);
        System.out.println("文字列の長さは: " + len);
        System.out.println("str1 は空ですか? :" + str1IsEmpty);
        System.out.println("str2 は空ですか?:" + str3IsEmpty);

        String str4 = "The dog jumps.";
        String keyword = "The";
        boolean containsKeyword = str4.contains(keyword);
        int firstIndex = str4.indexOf(keyword);
        int lastIndex = str4.lastIndexOf("dog");

        System.out.println("文字列にキーワードが含まれていますか?: " + containsKeyword);
        System.out.println("キーワードの最初の位置: " + firstIndex);
        System.out.println("キーワードの最後の位置: " + lastIndex);

        // compareToメソッド
        String str5 = "Apple";
        String str6 = "Banana";
        int comparisonResult = str5.compareTo(str6);
        System.out.println("文字列の比較結果: " + comparisonResult);


        String str7 = "あいうえおかきくけこ";
        System.out.println(str7.substring(3));
        System.out.println(str7.substring(3,5));

        String str8 = " Java String Methods ";
        String lowerCase = str8.toLowerCase();
        String upperCase = str8.toUpperCase();
        String trimmed = str8.trim();
        String replaced = str8.replace(" ", "_");

        System.out.println("小文字に変換: " + lowerCase);
        System.out.println("大文字に変換: " + upperCase);
        System.out.println("先頭と末尾の空白を取り除く: " + trimmed);
        System.out.println("空白をアンダースコアに置換した結果: " + replaced);
    }
}