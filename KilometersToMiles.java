import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in Kilometers: ");
        int KM = sc.nextInt();
        double answer=(double)KM*0.621371;
        System.out.println("In Miles : " + answer);
    }
}