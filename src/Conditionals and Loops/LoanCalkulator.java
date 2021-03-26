import java.util.Scanner;
public class LoanCalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here

        int months = 6;
        for (int i = 3; i < months; i++)
            amount = amount * 90 / 100;
        System.out.println(amount);
}
