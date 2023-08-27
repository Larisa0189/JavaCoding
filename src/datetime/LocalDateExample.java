package datetime;


import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate futureDate = LocalDate.of(2023, Month.NOVEMBER, 20);
        LocalDate pastDate = LocalDate.of(2023, 6, 20);

        System.out.println(futureDate);
        System.out.println(pastDate);

        String formatDate = currentDate.getDayOfMonth() + "/" + currentDate.getMonth() + "/" + currentDate.getYear();
        System.out.println(formatDate);
    }
}
