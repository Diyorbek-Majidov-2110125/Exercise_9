
//program: Use the Random class

import java.util.Random;

public class Exercise_9_04 {
    public static void main(String[] args) {

        Random random = new Random(1000);
        for(int i = 0; i < 50; i++){
            if(i % 10 == 0)
                System.out.print("\n" + random.nextInt(100) + " ");
            else
                System.out.printf("%4d",random.nextInt(100));
        }
    }
}
