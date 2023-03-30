import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = sc.nextInt();
        if ((num/2)*2 == num){
            System.out.println(num + " Is an even number");
        }
        else{
            System.out.println(num + " Is an odd number");
        }
    }
}
