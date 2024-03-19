import java.util.Scanner;

public class Main {
    public static void main(String[] argv)
    {
        System.out.println("Please Enter Your radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println("circumference = " + circle.circumference());
        System.out.println("area = " + circle.area());

    }
}
