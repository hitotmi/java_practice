public class LoopBasics {
    public static void main(String[] args) {
        for( int i = 0; i < 10; i++ ){
            if( i == 3 ) {
                System.out.println("値が3はスキップ");
                continue;
            }
            if( i == 8 ) {
                System.out.println("値が8になったら終了");
                break;
            }
            System.out.println(i);
        }


        System.out.println("while文");
        int i = 0;
        while (i < 10) {
            if (i == 3) {
                System.out.println("値が3はスキップ");
                i++;
                continue;
            }
            if (i == 7) {
                System.out.println("値が7になったら終了");
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("while文");
        System.out.println("サイコロの目");
        int dice = 0;

        while (dice != 6) {
            dice = new java.util.Random().nextInt(6) + 1;
            System.out.println(dice);
        }

        System.out.println("while文とdo-while文");
        // while文は、条件式がいきなりfalseと判定されると一度も繰り返し処理が行われない
        i = 0;
        System.out.println("while loop:");
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // do-while文の繰り返し処理は、最初の1回は無条件で行われる
        i = 0;
        System.out.println("do-while loop:");
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
