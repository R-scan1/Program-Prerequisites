import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int Length = sc.nextInt();
        System.out.print("Enter Width: ");
		int Width = sc.nextInt();
        System.out.println("Perimeter of Rectangle: " + 2*Length*Width);
    }
}