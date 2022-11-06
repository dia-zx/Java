/*
 * *Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */

package Lesson5.Task3;


public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] { 10, 6, 3, 8, 2, 9, 0 };

        System.out.println("исходный массив:");
        for (int i : array)
            System.out.print(i + "; ");

        piramidSort(array);
        System.out.println("\n отсортированный массив:");
        for (int i : array)
            System.out.print(i + "; ");
    }

    /**
     * Сортировка пирамидальным методом массива из целых чисел
     * @param array исходный массив (он же результат)
     * @return 
     */
    public static int[] piramidSort(int[] array) {
        int top = array.length - 1;
        do {
            for (int i = top; i > 0; i--) {

                // #region вычисляем индекс родителя
                int parent;
                if ((i & 1) > 0)
                    parent = (i + 1) / 2 - 1;
                else
                    parent = i / 2 - 1;
                // #endregion

                // #region потомок меньше родителя.. пропускаем. использую <continue>, чтобы
                // снизить уровень скобок т.к. иначе придется обрамлять код после <if> скобками
                // {}
                if (array[i] < array[parent])
                    continue;
                // #endregion

                // #region меняем потомков и родителя (поднимаем потомка на следущий слой
                // пирамиды)
                int temp = array[parent];
                array[parent] = array[i];
                array[i] = temp;
                // #endregion
            }
            // #region забираем вершину, где находится максимальный элемент из оставшихся..
            int temp = array[0];
            array[0] = array[top];
            array[top] = temp;
            top--;
            // #endregion

        } while (top > 0);
        return array;
    }
}
