import java.util.Scanner;

public class zad51808 {
    public static void main(String[] args) {
        System.out.println("Введите количество часов");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        if (h > 0 && h < 7) {
            System.out.println("Gud night");
        }
        if (h < 6 && h < 14) {
            System.out.println("Gud morning");
        }
        if (h > 13 && h < 18) {
            System.out.println("Gud day");
        }

        if (h > 18) {
            System.out.println("Gud evening");

        }
    }
}



