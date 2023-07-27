import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main3 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(1999, 1, 2);
        System.out.println(date2);
        System.out.println("1年後は" + date2.plusYears(1));
        System.out.println("5日後は" + date2.plusDays(5));
        System.out.println("1月前は" + date2.minusMonths(1));

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalTime time2 = LocalTime.of(5, 10, 20);
        System.out.println(time2);

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);

        LocalDateTime dateTime2 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
        System.out.println(dateTime2);

        LocalDateTime dateTime3 = LocalDateTime.of(2000, 02, 20, 03, 40, 50);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String afterFormat = dateTime3.format(formatter);
        System.out.println(afterFormat);

        LocalDateTime dateTime4 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);

        if (dateTime2.isAfter(dateTime3)) {
            System.out.println("日付が比較対象の日付より後");
        }

        if (dateTime2.isBefore(dateTime3)) {
            System.out.println("日付が比較対象の日付より前");
        }

        if (dateTime2.isEqual(dateTime4)) {
            System.out.println("日付が比較対象の日付と同じ");
        }
    }
}

// import java.time.*;

// public class Main3 {
//     public static void main(String[] args) {
//         // LocalDateTime
//         LocalDateTime localDateTime = LocalDateTime.now();
//         System.out.println("現地の日付と時刻: " + localDateTime);

//         // ZonedDateTime
//         ZonedDateTime zonedDateTime = ZonedDateTime.now();
//         System.out.println("現地の日付と時刻とタイムゾーン: " + zonedDateTime);

//         // ニューヨークの現在時刻を取得
//         ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
//         System.out.println("ニューヨークの現在の日付と時刻とタイムゾーン: " + newYorkDateTime);

//         // ニューヨークの現在時刻をローカル日時に変換
//         LocalDateTime newYorkLocalDateTime = newYorkDateTime.toLocalDateTime();
//         System.out.println("ニューヨークの現在の日付と時刻: " + newYorkLocalDateTime);


//         LocalTime start = LocalTime.of(9, 0); // 9:00
//         LocalTime end = LocalTime.of(17, 0); // 17:00
//         Duration duration = Duration.between(start, end);

//         System.out.println("時間（分）: " + duration.toMinutes());

//         LocalDate startDate = LocalDate.of(2020, 1, 1);
//         LocalDate endDate = LocalDate.of(2023, 7, 11);
//         Period period = Period.between(startDate, endDate);

//         System.out.println("全期間: " + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "日");
//     }
// }


// import java.util.Calendar;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class Main3 {
//     public static void main(String[] args) {
//         String name = "Tanaka";
//         int age = 30;

//         System.out.printf("Name: %s, Age: %d\n", name, age);
//         double pi = 3.141592;

//         System.out.printf("Pi: %.2f\n", pi);

//         Date date = new Date();
//         Calendar calendar = Calendar.getInstance();

//         calendar.setTime(date);

//         System.out.println("年は"+calendar.get(Calendar.YEAR));
//         // CalendarクラスのMONTHは0から始まる
//         System.out.println("月は"+(calendar.get(Calendar.MONTH) + 1));
//         System.out.println("日は"+calendar.get(Calendar.DATE));
//         System.out.println("時間は"+calendar.get(Calendar.HOUR));
//         System.out.println("分は"+calendar.get(Calendar.MINUTE));
//         System.out.println("秒は"+calendar.get(Calendar.SECOND));

//         SimpleDateFormat format1 = new SimpleDateFormat();
//         System.out.println(format1.format(date));

//         SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
//         System.out.println(format2.format(date));
//         // System.out.println(date);
//     }
// }
