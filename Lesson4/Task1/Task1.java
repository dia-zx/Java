
/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

package Lesson4.Task1;

import java.util.LinkedList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        int a[] = { 5, 6, 10, 11, 35, 1, 99 };
        for (int i : a)
            list.add(i);
        System.out.println("Исходная коллекция: " + list);
        reverse(list);
        System.out.println("Перевернутая коллекция: " + list);

    }

    /**
     * Меняет порядок элементов в коллекции на противоположный
     * @param <T>
     * @param list коллекция
     * @return перевернутая коллекция
     */
    public static <T> List<T> reverse(List<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T temp;
            temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }       
        return list;
    }

}