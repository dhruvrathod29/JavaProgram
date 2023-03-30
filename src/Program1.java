import java.util.Scanner;

// Sum Of Even Number into 1D Array
public class Program1 {

// ! WAP to find a sum of even number into 1D array.
    public static void main(String[] args) {
        int n, sumO = 0, sumE=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the element in array");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the element of the array ");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (a[i]%2==0) {

                sumE = sumE + a[i];
            }
            else{
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of even number = "+sumE);
        System.out.println("Sum of Odd number = "+sumO);
    }

}
