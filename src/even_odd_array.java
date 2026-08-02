
import java.util.Scanner;

public class even_odd_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Elements = " + even);
        System.out.println("Odd Elements = " + odd);

        sc.close();
    }
}