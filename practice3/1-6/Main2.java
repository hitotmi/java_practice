public class Main2 {
    public static void main(String[] args) {
        // テストを受けた人とその点数を2つの配列に格納
        String[] names = {"Aさん", "Bさん", "Cさん", "Dさん", "Eさん", 
                          "Fさん", "Gさん", "Hさん", "Iさん", "Jさん"};
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "の点数は" + scores[i] + "点");
            sum += scores[i];
        }

        int average = sum / names.length;
        System.out.println("テストの平均点は" + average + "点");
    }
}
