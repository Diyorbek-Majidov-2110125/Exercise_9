package Exercise_9_06;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Exercise_9_06 {
    public static void main(String[] args) {

        Random random = new Random();
        StopWatch stopWatch = new StopWatch();

        System.out.print("Start Time: ");
        stopWatch.start();
        long[] numbers = new long[100000];

        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextLong(100000000000000L);
        }

        java.util.Arrays.parallelSort(numbers);
        System.out.print("End Time: ");
        stopWatch.end();
        long elapsed_time = stopWatch.getElapsedTime();

        System.out.println("Elapsed time: " + elapsed_time);


    }
}

