public class ArrayExamples {
    public static void main(String[] args) {
        int[] scoreArray;

        scoreArray = new int[5];
        scoreArray[2] = 80;
        System.out.println(scoreArray[2]);


        String[] nameArray = { "田中", "山田", "石田", "佐藤", "伊藤" };
        int[] scores = { 50, 60, 70, 80, 90 };

        // scores[0]～[4]の値を順番に表示
        for( int i = 0; i < scores.length ; i++ ) {
            System.out.println( (i + 1) + "番目は" + scores[i] );
        }

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i] + "さんのスコアは" + scores[i] + "点です。");
        }

        int totalScore = 0;
        // 拡張for文
        for (int score : scores) {
            totalScore += score;
        }

        int averageScore = totalScore / scores.length;
        System.out.println("平均スコアは" + averageScore + "点です。");


        int[] arrayA =  {10, 20 ,30};
        int[] arrayB;
        arrayB = arrayA;
        arrayB[1] = 100;
        System.out.println(arrayA[1]);


        // 2次元配列
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}