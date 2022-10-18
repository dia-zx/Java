/*
 * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.
 */
package Lesson4.Task3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(1);
        System.out.println("Список элементов: " + list);
        System.out.println("сумма элементов: " + sum(list));
        System.out.println("Список элементов: " + list);
    }

    /**
     * Вычисление суммы всех элементов LinkedList, сохраняя все элементы в списке.
     * Использоватье итератор.
     * 
     * @param <T>
     * @param list
     * @return
     */
    public static <T extends Number> double sum(List<T> list) {
        Iterator<T> it = list.iterator();
        double res = 0;
        while (it.hasNext())
            res += it.next().doubleValue();
        return res;
    }

}
