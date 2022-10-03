// Вычислить n-ое треугольное число

package Lesson1.Task4;

import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "866");
        System.out.println("Введите n (n > 0)");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Неверное значение n! (n > 0)");
            return;
        }

        System.out.println("n-ое треугольное число: " + n * (n + 1) / 2);
    }
}
