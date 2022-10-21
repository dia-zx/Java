/*
 * Реализовать алгоритм сортировки слиянием.
 */

package Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int mas[] = new int[] { 1, 6, 3, 9, 10, 7, 3, 0 };
        for (int i : mas)
            list.add(i);
        System.out.println("Исходный список: " + list.toString());
        System.out.println("Отсортированный список: " + sort(list).toString());
    }

    /**
     * Метод сортировки слиянием (блоками 2, 4, 8...)
     * 
     * @param <T>  тип элементов списка
     * @param list исходный список, здесь будет и результат сортировки
     * @return отсортированный список
     */
    static <T extends Comparable<T>> List<T> sort(List<T> list) {// обобщенные классы должны реализовывать интерфейс
                                                                 // Comparable (для сравнения элементов)
        int size_block = 1;
        do {
            size_block = (size_block << 1);// сортируем блоками по 2, 4, 8... элементов
            for (int i = 0; i < list.size(); i += size_block) {
                List<T> newlist = new ArrayList<T>();
                int pos1 = i;// индекс 0го элемента 1й половины блока
                int pos2 = i + (size_block >> 1); // индекс 0го элемента 2й половины блока
                for (int j = 0; (j < size_block) && (j + i < list.size()); j++) {// цикл по элементам блока (блок может
                                                                                 // быть не полным (конец списка))
                    if ((pos2 == i + size_block) || (pos2 >= list.size())) {// индекс 2й половины блока вышел за
                                                                            // пределы.. просто добавляем элементы из
                                                                            // первой половины
                        newlist.add(list.get(pos1++));// добавляем элемент из 1й половины блока и увеличиваем индекс 1й
                                                      // половины..
                        continue;
                    }
                    if (pos1 == i + (size_block >> 1)) {// индекс 1й половины блока вышел за пределы.. просто добавляем
                                                        // элементы из 2й половины
                        newlist.add(list.get(pos2++));
                        continue;
                    }
                    if (list.get(pos1).compareTo(list.get(pos2)) < 0)// сравниваем элементы из 2х половин блока и берем
                                                                     // наименьший, увеличивая индекс соответствующей
                                                                     // половины блока
                        newlist.add(list.get(pos1++));
                    else
                        newlist.add(list.get(pos2++));
                }
                for (int j = 0; j < newlist.size(); j++)// заменяем элементы блока на отсортированные
                    list.set(i + j, newlist.get(j));
            }
        } while (size_block < list.size());
        return list; // возвращаем отсортированный список (хотя можно и не возвращать) для поддержки
                     // каскадных операций : sort(list).ToString() ...
    }

}
