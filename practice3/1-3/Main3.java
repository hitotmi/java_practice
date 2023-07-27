import java.util.Calendar;
import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        String name = "Tanaka";
        int age = 30;

        System.out.printf("Name: %s, Age: %d\n", name, age);
        double pi = 3.141592;

        System.out.printf("Pi: %.2f\n", pi);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);


        System.out.println("年は"+calendar.get(calendar.YEAR));
        //CalendarクラスのMONTHは0から始まるので、実行結果は6月を示します。
        System.out.println("月は"+calendar.get(calendar.MONTH));
        System.out.println("月は"+(calendar.get(Calendar.MONTH) + 1));
        System.out.println("日は"+calendar.get(calendar.DATE));
        System.out.println("時間は"+calendar.get(calendar.HOUR));
        System.out.println("分は"+calendar.get(calendar.MINUTE));
        System.out.println("秒は"+calendar.get(calendar.SECOND));
        // System.out.println(date);
    }
}
