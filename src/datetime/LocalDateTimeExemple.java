package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeExemple {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        String format = current.getDayOfMonth() + "/" + current.getMonthValue() + "/" + current.getYear() + " " + current.getHour() + ":" + current.getMinute() + ":" + current.getSecond();
        System.out.println(format);
    }
}
