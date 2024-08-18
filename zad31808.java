import java.util.Scanner;

public class zad31808 {
    public static void main(String[] args) {

        System.out.println("Введите 1 число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите 2 число");
        int b = scanner.nextInt();
        System.out.println("Введите 3 число");
        int c = scanner.nextInt();

        System.out.println("Выбери действие");
        System.out.println("1-найти cумму чисел");
        System.out.println("2-найти произведение чисел");


        int action = scanner.nextInt();
        int result;
        if (action == 1) {
            result = a + b + c;
        System.out.println(a + b + c);

    } else {
        result = (a * b * c);
        System.out.println(a * b * c);
    }
}
}