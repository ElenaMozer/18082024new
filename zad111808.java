import java.util.Scanner;

public class zad111808 {
    public static void main(String[] args) {
        System.out.println ("Введите  число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println(a+" "+"Число четное");
        }else { System.out.println(a+" "+"Число нечетное");
        }
    }
}
