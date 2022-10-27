
//program: Use the Date class


import java.util.Date;

public class Exercise_9_03 {
    public static void main(String[] args) {

        System.out.println("Elapsed time to 10000, 100000, 1000000, 10000000,\n 100000000, 1000000000, 100000000000 and 100000000000, respectively: ");

        Date date = new Date();
        for(long i = 10000; i < 1E11; i *= 10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
