package Exercise_9_09;

public class Exercise_9_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("1.regular polygon" + "\nPerimeter: " + polygon1.getPerimeter() + "\nArea: " + polygon1.getArea());
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        System.out.println("2.regular polygon" + "\nPerimeter: " + polygon2.getPerimeter() + "\nArea: " + polygon2.getArea());
        RegularPolygon polygon3 = new RegularPolygon( 15, 4, 5.6, 7.8);
        System.out.println("3.regular polygon" + "\nPerimeter: " + polygon3.getPerimeter() + "\nArea: " + polygon3.getArea());
    }
}
