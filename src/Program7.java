
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");

        int n = sc.nextInt();

        int FistTerm = 0, SecondTerm =1;
        System.out.print(FistTerm + " " + SecondTerm + " ");
        for (int i = 3; i <= n; i++) {
            int CurrentTerm = FistTerm + SecondTerm;
            System.out.print( CurrentTerm + " ");
            FistTerm = SecondTerm;
            SecondTerm = CurrentTerm;

        }
    }
}
