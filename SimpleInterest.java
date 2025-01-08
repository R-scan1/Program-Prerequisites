import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int Principal = sc.nextInt();
        System.out.print("Enter Rate: ");
		int rate = sc.nextInt();
        System.out.print("Enter Time: ");
        int Time = sc.nextInt();
       double answer=(double)(Principal*rate*Time)/100;
        System.out.println("Simple Interest: " + answer);
    }
}