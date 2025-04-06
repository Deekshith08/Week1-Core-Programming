//1
/*
Time Zones and ZonedDateTime Write a program that displays the current time in different time zones: 
➢ GMT (Greenwich Mean Time) 
➢ IST (Indian Standard Time) 
➢ PST (Pacific Standard Time) 
Hint: Use ZonedDateTime and ZoneId to work with different time zones. 

 */

import java.time.*;
import java.time.format.*;
class ZonesTime{
    public static void main(String[] args) {
        ZoneId gmtid = ZoneId.of("GMT");
        ZoneId istid = ZoneId.of("Asia/Kolkata");
        ZoneId pstid = ZoneId.of("America/Los_Angeles");

        ZonedDateTime gmt = ZonedDateTime.now(gmtid);
        ZonedDateTime ist = ZonedDateTime.now(istid);
        ZonedDateTime pst = ZonedDateTime.now(pstid);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        System.out.println("GMT - " + gmt.format(formatter));
        System.out.println("IST - " + ist.format(formatter));
        System.out.println("PST - " + pst.format(formatter));

    }
}
