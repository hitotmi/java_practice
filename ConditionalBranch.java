public class ConditionalBranch {
    public static void main(String[] args) {
        int num = 17;
        if( num > 20){
            System.out.println("20より大きい数字です");
        }else{
            System.out.println("20以下の数字です");
        }

        boolean drive = true;
        if(drive) {
            System.out.println("運転可能");
        } else {
            System.out.println("運転不可");
        }

        String fruit1 = "Apple";
        String fruit2 = "Orage";

        if(fruit1.equals(fruit2)) {
            System.out.println("fruit1とfruit2は等しい");
        } else {
            System.out.println("fruit1とfruit2は等しくない");
        }

        int hour = new java.util.Random().nextInt(24);
        System.out.println(hour);

        if (hour >= 5 && hour < 10) {
            System.out.println("おはようございます");
        } else if (hour >= 10 && hour < 18) {
            System.out.println("こんにちは");
        } else {
            System.out.println("こんばんは");
        }
        
        // Switch文
        int month = new java.util.Random().nextInt(12) + 1;
        System.out.println(month);
        String season = "";

        season = switch(month) {
            case 12, 1, 2 ->  "冬";
            case 3, 4, 5 -> "春";
            case 6, 7, 8 -> "夏";
            case 9, 10, 11 -> "秋";
            default -> "不明な月";
        };
        System.out.println(season);

        // switch(month) {
        //     case 12, 1, 2:
        //         System.out.println("冬");
        //         break;
        //     case 3, 4, 5:
        //         System.out.println("春");
        //         break;
        //     case 6, 7, 8:
        //         System.out.println("夏");
        //         break;
        //     case 9, 10, 11:
        //         System.out.println("秋");
        //         break;
        //     default:
        //         System.out.println("不明");
        //         break;
        // }
    }
}
