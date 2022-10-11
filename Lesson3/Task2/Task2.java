/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())
 */

package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] m = { 1, 4, 2, 8, 9, 6, 11 };
        for (int i : m)
            list.add(i);
        System.out.println("Максимальный элемент: " + Collections.max(list));
        System.out.println("Минимальный элемент: " + Collections.min(list));

        System.out.println("Минимальный элемент: " + sum_list(list));
    }
    
    /**
     * Вычисление суммы элементов списка
     * @param list
     * @return сумма всех элементов
     */
    static int sum_list(List<Integer> list)
    {
        int sum = 0;
        for (int i : list) 
            sum += i;
        return sum;
    }
}
