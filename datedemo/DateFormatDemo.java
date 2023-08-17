package datedemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.ZonedDateTime;

public class DateFormatDemo {

    public static void main(String[] args) {
        ZonedDateTime dt=ZonedDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss z Z");

        System.out.println(df.format(dt));
        System.out.println(dt.get(ChronoField.YEAR));

    }
    
}
