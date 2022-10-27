

/* program: (Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + c = 0 */

package Exercise_9_10;

import java.util.Scanner;

public class Exercise_9_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients(a,b and c,respectively): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        QuadraticEquation equation = new QuadraticEquation( a, b, c);

        if(equation.getDiscriminant() > 0){
            System.out.println("first root of equation: " + equation.getRoot1());
            System.out.println("second root of equation: " + equation.getRoot2());

        } else if(equation.getDiscriminant() == 0)
            System.out.println("root of equation: " + equation.getRoot1());

        else
            System.out.println("The equation has no roots");
    }
}
