import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number lower rang");
        int loweRang = sc.nextInt();

        System.out.println("Enter the number uper range");
        int upperRang = sc.nextInt();

        System.out.println("Prime number between " + loweRang + " to "+upperRang);

        for (int i = loweRang; i <=upperRang ; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
