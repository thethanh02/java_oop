package javaoop;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DateDiff {
    static long getDistanceDate(String dateStart, String dateStop) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");  

        Date d1 = format.parse(dateStart);
        Date d2 = format.parse(dateStop);
        // Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long res = TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS);
        return res;
    }
    static public long getDiffDate(String dateArrive, String dateLeave) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime d1 = LocalTime.parse(dateArrive, dtf);
        LocalTime d2 = LocalTime.parse(dateLeave, dtf);
        return ChronoUnit.MINUTES.between(d1, d2);
    }
    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        String data = df.format(new Date());
//        System.out.println(data);
        System.out.println(getDiffDate("16:35", "17:36"));
//        System.out.println(getDistanceDate("16:35", "17:35"));
    }
}
