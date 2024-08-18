import java.util.Scanner;

public class zad41808 {
    public static void main(String[] args) {
        System.out.println("Введите количество метро");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Выбери действие");
        System.out.println("1-перевод в мили");
        System.out.println("2-перевод в ярды");
        System.out.println("3-перевод в дюймы");


        int action = scanner.nextInt();
        double result;
        if (action == 1) {
         result =(0.000621*m);

            System.out.println(m * 0.000621);

        }
        if (action == 2) {
            result = (m * 39.37);
            System.out.println(m * 39.37);
        }
        if (action == 3) {
            result = (m * 1.09);
            System.out.println(m * 1.09);

        }
    }
}
