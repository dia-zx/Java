package Lesson4.Task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Реализует очередь с помощью LinkedList
 */
public class MyEnqueue<T> {
    public MyEnqueue() {
        list = new LinkedList<T>();
    }

    private List<T> list;

    /**
     * помещает элемент в конец очереди
     * 
     * @param item
     */
    public void enqueue(T item) {
        list.add(item);
    }

    /**
     * возвращает первый элемент из очереди и удаляет его
     * 
     * @return
     */
    public T dequeue() {
        T temp = list.get(0);
        list.remove(0);
        return temp;
    }

    /**
     * возвращает первый элемент из очереди, не удаляя
     * 
     * @return
     */
    public T first() {
        return list.get(0);
    }

    @Override
    public String toString() {
        return list.toString();
    }

}