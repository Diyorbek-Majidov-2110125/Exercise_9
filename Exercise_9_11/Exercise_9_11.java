
/* program: (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations: */

package Exercise_9_11;

import java.util.Scanner;

public class Exercise_9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values(a, b, c, d, e and f,respectively): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if(linearEquation.isSolvable()){
            System.out.println("x of equation: " + linearEquation.getX());
            System.out.println("y of equation: " + linearEquation.getY());
        }else
            System.out.println("The equation has no solution");

    }
}
