package playground.simple;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.of(2016, 1, 1);
        final int days = Period.between(date, date).getDays();
        System.out.println(days);
    }

}
