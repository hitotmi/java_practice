public class Main {
    public static void main(String[] args) {
        Animal dictionary = new Animal();

        String[] wordsToSearch = { "gorilla", "dog", "tiger", "cat" };

        for (String word : wordsToSearch) {
            String meaning = dictionary.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は見つかりませんでした");
            }
        }
    }
}
