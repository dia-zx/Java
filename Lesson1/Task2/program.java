// Дан массив двоичных чисел, например [1,1,0,1,1,1],
//  вывести максимальное количество подряд идущих 1

package Lesson1.Task2;


/**
 * program
 */
public class program {
    public static void main(String[] args) {
        int[] mas = { 1, 1, 0, 1, 1, 1 }; //исходный массив
        
        int maxcount = 0;
        int count = 0;
        for (int it : mas) {
            if (it == 1)
                count++;
            else
                count = 0;
            if (count > maxcount)
                maxcount = count;
        }
        
        System.out.printf("максимальное количество подряд идущих 1: %d", maxcount);

    }

}