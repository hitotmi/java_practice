import java.util.HashMap;

public class Animal {
    private HashMap<String, String> dictionary;

    public Animal() {
        dictionary = new HashMap<>();
        dictionary.put("dog", "犬");
        dictionary.put("cat", "猫");
        dictionary.put("rabbit", "うさぎ");
        dictionary.put("cow", "牛");
        dictionary.put("giraffe", "きりん");
        dictionary.put("monkey", "猿");
        dictionary.put("elephant", "ゾウ");
        dictionary.put("pig", "ブタ");
        dictionary.put("polar bear", "しろくま");
        dictionary.put("gorilla", "ゴリラ");
    }

    public String getMeaning(String word) {
        return dictionary.get(word);
    }
}