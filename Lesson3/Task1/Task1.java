/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа.
 */

package Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] m = { 1, 4, 2, 8, 9, 6, 11 };
        for (int i : m)
            list.add(i);

        evens_remove(list);

        System.out.println(list);

    }

    /**
     * Удаляет из списка четные числа
     * @param list
     */
    static void evens_remove(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) % 2 == 0)
                list.remove(i--);
    }
}
