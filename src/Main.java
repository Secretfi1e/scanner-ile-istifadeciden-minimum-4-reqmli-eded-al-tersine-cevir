import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum dord reqemli eded daxil edin");
        int number = scanner.nextInt();
        if (number < 1000) {
            System.out.println("Minimum 4 basamaklı bir sayı girmediniz!");
            return;
        }


        int[] arr = new int[4];
        int index = 0;
        while (number > 0) {
            int reqem = number % 10;
            arr[index] = reqem;
            index++;
            number /= 10;


            System.out.print(reqem);
        }
    }
}






















