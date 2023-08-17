package datedemo;

import java.util.*;
public class DateDemo {
    
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);
        // System.out.println(9223372036854775807L/1000/60/60/24/365);
        Date d=new Date("7/26/2020");
        System.out.println(d.getYear());

        GregorianCalendar gc=new GregorianCalendar();

        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
    }
}
