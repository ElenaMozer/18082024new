import java.util.Scanner;

public class zad11808 {
    public static void main(String[] args) {
        System.out.println ("Введите 1 число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
System.out.println ("Введите 2 число");
        int b = scanner.nextInt();
        System.out.println ("Введите 3 число");
        int c = scanner.nextInt();

        System.out.println ("Выбери действие");
        System.out.println ("1-найти большее из чисел");
        System.out.println ("2-найти меньшее из чисел");
        System.out.println ("4-найти среднеарифмитическое из чисел");


        int action = scanner.nextInt();
        int result;
        if (action == 4) {
            result = (a + b + c) / 3;
        }
            System.out.println((a + b + c)/ 3);

if (action == 1) {
    if (a > b && a > c)
        System.out.println(a);
        if (b > a && b > c)
            System.out.println(b);
            if (c > a && c > b)
                System.out.println(c);
            }

            if (action == 2) {
                if (a < b && a < c)
                    System.out.println(a);
                    if (b < a && b < c)
                        System.out.println(b);
                        if (c < a && c < b)
                            System.out.println(c);
                        }
                    }
                }
















