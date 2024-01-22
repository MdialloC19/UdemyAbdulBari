package datedemo;

import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class dateDemons {

    public static void main(String[] args) {
        Date d =new Date();
        d.setHours(21);
        System.out.println(d);

        LocalDate dt=LocalDate.ofEpochDay(1);
        LocalTime tt=LocalTime.now();
        System.out.println(dt);
        System.out.println(tt);
        LocalDateTime lt= LocalDateTime.now();
        System.out.println(lt);

        
    }
    
}
