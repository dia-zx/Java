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
        System.out.println("Среднее арифметическое: " + ave_list(list));
    }
    
    /**
     * Вычисление среднего арифметического элементов списка
     * @param list список
     * @return среднее арифметическое элементов
     */
    static <T extends  Number> double ave_list(List<T> list)
    {
        double sum = 0.;
        for (T i : list) 
            sum += + i.doubleValue();
        return sum / list.size();
    }
}
