import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = input.nextInt();
        System.out.print("Enter end number: ");
        int end = input.nextInt();
        if (start > end) {
            System.out.println("Start number is greater than end number");
        }
        else {
            int a = 0;
            while (start <= end) {
                a = start + a;
                start++;
            }
            System.out.println("a = " + a);
        }
    }
}
