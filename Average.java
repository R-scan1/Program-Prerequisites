import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three Numbers: ");
        int First = sc.nextInt();
		int Second = sc.nextInt();
		int Third = sc.nextInt();
		double answer=(double)(First+Second+Third)/3
        System.out.println("Average : " + answer);
    }
}