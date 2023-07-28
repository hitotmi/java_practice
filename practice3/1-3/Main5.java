import java.util.LinkedHashSet;

public class Main5 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Strawberry");
        set.add("Peach");

        // 重複した要素を追加
        set.add("Apple");
        set.add("Peach");

        System.out.println("LinkedHashSet の内容:");
        for(String element : set) {
            System.out.println(element);
        }

        set.remove("Banana");

        System.out.println("削除後の LinkedHashSet の内容:");
        for(String element : set) {
            System.out.println(element);
        }
    }
}
