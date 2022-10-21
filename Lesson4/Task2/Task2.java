/*
Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его, 
 first() - возвращает первый элемент из очереди, не удаляя.
*/
package Lesson4.Task2;

public class Task2 {
    public static void main(String[] args) {
        MyEnqueue<String> enqueue = new MyEnqueue<>();
        enqueue.enqueue("one");
        enqueue.enqueue("two");
        enqueue.enqueue("three");
        System.out.println(enqueue);
        System.out.println("----------------------");
        System.out.println("возвращаем первый элемент из очереди и удаляем его:");
        System.out.println("первый элемент: " + enqueue.dequeue());
        System.out.println(enqueue);
        System.out.println("----------------------");
        System.out.println("возвращаем первый элемент из очереди не удаляя его:");
        System.out.println("первый элемент: " + enqueue.first());
        System.out.println(enqueue);        
    }
    
}
