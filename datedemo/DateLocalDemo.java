package datedemo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateLocalDemo {
    
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        OffsetDateTime odt=OffsetDateTime.now();

        MonthDay md=MonthDay.now();

        Instant i=Instant.now();


        Period pt=Period.of(2,2,10);
        System.out.println(zdt);
        System.out.println(odt.getMinute());
        System.out.println(pt.addTo(LocalDate.now()));
        System.out.println(i);

    }
}
