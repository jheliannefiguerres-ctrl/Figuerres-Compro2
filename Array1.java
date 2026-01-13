import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = { 2, 5, 7, 9, 12, 15, 8, 3, 6, 11 };
        for (int i = 0; i <= numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int index = -1;
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + number + " is " + index);
    }
}
