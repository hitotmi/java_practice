import java.util.Calendar;
import java.text.SimpleDateFormat;
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

        System.out.println("年は"+calendar.get(Calendar.YEAR));
        // CalendarクラスのMONTHは0から始まる
        System.out.println("月は"+(calendar.get(Calendar.MONTH) + 1));
        System.out.println("日は"+calendar.get(Calendar.DATE));
        System.out.println("時間は"+calendar.get(Calendar.HOUR));
        System.out.println("分は"+calendar.get(Calendar.MINUTE));
        System.out.println("秒は"+calendar.get(Calendar.SECOND));

        SimpleDateFormat format1 = new SimpleDateFormat();
        System.out.println(format1.format(date));

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(format2.format(date));
        // System.out.println(date);
    }
}
