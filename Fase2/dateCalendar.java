import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class dateCalendar {
    public static void main(String[] args) throws ParseException {
        
        //ISO 8601
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2021-03-12T15:42:21Z"));

        System.out.println("DEFAUL DATE");
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("DATE + 4 HOURS");
        System.out.println(sdf.format(d));

        System.out.println("MISCELANEOUS");
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        
    }
    
}
