
/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

package Lesson4.Task1;


import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int a[] = { 5, 6, 10, 11, 35, 1, 99 };
        for (int i : a)
            list.add(i);
        System.out.println("Исходная коллекция: " + list);
        System.out.println("Перевернутая коллекция: " + reverse(list));
    }

    /**
     * Меняет порядок элементов в коллекции на противоположный
     * 
     * @param <T>
     * @param list коллекция
     * @return перевернутая коллекция
     */
    public static <T> LinkedList<T> reverse(LinkedList<T> list) {
        LinkedList<T> newlist = new LinkedList<>();
        for (T t : list)
            newlist.addFirst(t);
        return newlist;
    }
}