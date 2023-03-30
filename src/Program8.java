import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num != 0){
            int digit = num % 10;
            if (digit % 2 == 0){
                evenCount++;

            }
            else {
                oddCount++;
            }
            num = num / 10;

        }
        System.out.println("Total Even Number : " + evenCount);
        System.out.println("Total Odd Number : " + oddCount);

    }
}
