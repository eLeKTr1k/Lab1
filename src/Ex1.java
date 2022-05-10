import java.util.Scanner;

public class Ex1 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("1. Вычислить значение выражения ");

        System.out.println("Введите X: ");
        double x = s.nextDouble();

        System.out.println("Введите Y: ");
        double y = s.nextDouble();

        double res;
        res = (3 + Math.exp(y-1))/(1 + Math.pow(x,2) * Math.abs(y - Math.tan(x)));

        System.out.println("Результат: " + res);
    }
}