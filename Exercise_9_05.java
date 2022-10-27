
//program: Use the GregorianCalendar class
import java.util.GregorianCalendar;

public class Exercise_9_05 {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println( "Current Date: " + gc.get(GregorianCalendar.DATE) + "/" + gc.get(GregorianCalendar.MONTH) + "/" + gc.get(GregorianCalendar.YEAR));

        gc.setTimeInMillis(1234567898765L);
        System.out.println( "Date(After elapsed time): " + gc.get(GregorianCalendar.DATE) + "/" + gc.get(GregorianCalendar.MONTH) + "/" + gc.get(GregorianCalendar.YEAR));

    }
}
