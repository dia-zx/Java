/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
package Lesson5.Task1;

public class Task1 {
public static void main(String[] args) {
    PhoneBook book = new PhoneBook();
    book.addContact("Иван Иванов", new String[] { "+79061596523", "+76534592312" });
    book.addContact("Светлана Петрова", new String[] { "+79061652523", "+76599592312" });
    book.addContact("Кристина Белова", new String[] { "+78061652685" });
    System.out.println("Содержимое телефонной книги:");
    System.out.println(book);
    System.out.println("============ удалим контакт \"Иван Иванов\" ============");
    book.delContact("Иван Иванов");
    System.out.println(book);
    System.out.println("======== вывод списка имен ==============");
    System.out.println(book.getNames());
    System.out.println("\n=========== вывод телефонов для контакта \"Светлана Петрова\" ===========");
    System.out.println(book.getPhones("Светлана Петрова")); 
}
    
}