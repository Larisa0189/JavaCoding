package datetime;

import java.time.LocalTime;

public class LocaleTimeExample {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalTime finalCourseTime = LocalTime.now().withMinute(30).withSecond(0).withHour(16).withNano(0);
        //puteam scrie dupa egal si currentTime.withMinute(30).withSecond(0).withHour(16).withNano(0);
        System.out.println(finalCourseTime);
        System.out.println("Peste 5 ore va fi: " + currentTime.plusHours(5).withNano(0));
        System.out.println("Acum 30 minute a fost: " + currentTime.minusMinutes(30).withNano(0));

        String timeFormat = finalCourseTime.getHour() + "-" + finalCourseTime.getMinute() + "-" + finalCourseTime.getSecond();
        System.out.println(timeFormat);


    }
}
