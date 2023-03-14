import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the base length of the square pyramid >> ");
        double a = scan.nextDouble();

        System.out.println("Enter the value of the height of the pyramid >> ");
        double h = scan.nextDouble();

        System.out.println("Enter the value of the radius of the sphere >> ");
        double r = scan.nextDouble();

        Solid pyramid = new Pyramid(a, h);
        Solid sphere = new Sphere(r);

        System.out.println("Square pyramid volume: " + pyramid.getVolume() + " m3");
        System.out.println("Square pyramid basis area: " + pyramid.getBasisArea() + " m2");
        System.out.println("Square pyramid full area: " + pyramid.getFullArea() + " m2\n");

        System.out.println("Sphere volume: " + sphere.getVolume() + " m3");
        System.out.println("Sphere basis area: " + pyramid.getBasisArea() + " m2");
        System.out.println("Sphere full area: " + pyramid.getFullArea() + " m2");
        
    }

}
