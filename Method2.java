public class Method2 {
    public static void main(String[] args) {
        int postage = 500;
        add(1000, postage);

        number(123);
        number(1.23F);

        int[] scores = { 50, 60, 70, 80, 90, 100 };

         for( int score : scores ) {
            System.out.println( score + "点だと成績は" + getGrade(score) );
        }

    }

    public static void add(int price, int postage) {
        int total = price + postage;
        System.out.println("料金は" + total + "円");
    }


    // numberメソッドは、引数のデータ型が異なるためオーバーロードされている。
    public static void number( int i ) {
        System.out.println("int型：" + i );
    }

    public static void number( float f ) {
        System.out.println("float型：" + f );
    }

    public static char getGrade(final int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

}
