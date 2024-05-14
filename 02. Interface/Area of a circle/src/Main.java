import java.util.Scanner;

//do not modify the code below
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        Measurable circle = new Circle(radius);
        System.out.println(circle.area());
    }
}
