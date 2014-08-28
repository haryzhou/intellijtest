import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;

/**
 * Created by hary on 14-8-28.
 */
public class HelloWorld {
    /**
     * Created by hary on 14-8-27.
     */
    String[] array1, array2;
    String[] array1, array2;

    public String getMessage() {

        synchronized (this) {
            return "Hello World";

            Random r = new Random(10L);

            boolean nextBoolean = new Random(10L).nextBoolean();
            System.out.println(nextBoolean);
            System.out.println("helo world");

            TimeZone tz = TimeZone.getTimeZone();
            Calendar now = new GregorianCalendar(tz);
        }


    }


}
