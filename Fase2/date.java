import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

public class date{
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);

        Date y1 = sdf1.parse("28/08/2004");
        Date y2 = sdf2.parse("28/08/2004 20:12:32");
        
        System.out.println("[UTC]");
        System.out.println("Date x1: " + x1);
        System.out.println("Date x2: " + sdf2.format(x2));
        System.out.println("Date x3: " + sdf2.format(x3));
        System.out.println("Date y1: " + sdf1.format(y1));
        System.out.println("Date y2: " + sdf2.format(y2));
        System.out.println("[GMT]");
        System.out.println("Date x2: " + sdf3.format(x2));
        System.out.println("Date x3: " + sdf3.format(x3));
        System.out.println("Date y1: " + sdf3.format(y1));
        System.out.println("Date y2: " + sdf3.format(y2));
    }
}