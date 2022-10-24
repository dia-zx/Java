package Lesson5.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * PhoneBook
 */
public class PhoneBook {
    private HashMap<String, List<String>> _book;

    public PhoneBook() {
        _book = new HashMap<String, List<String>>();
    }
    
    /**
     * Добавляет новый контакт или дополняет номерами существующий
     * @param name имя контакта
     * @param phone_numbers номера (номера) телефонов
     */
    public void addContact(String name, String[] phone_numbers) {
        List<String> list = new ArrayList();
        for (String number : phone_numbers)
            list.add(number);

        if (_book.get(name) == null) {
            _book.put(name, list);
        } else {
            _book.get(name).addAll(list);
        }
    }

    /**
     * Удаление контакта
     * @param name имя контакта
     */
    public void delContact(String name) {
        _book.remove(name);
    }
    
    /**
     * Возвращает множество имен контактов в книге
     * @return
     */
    public Set<String> getNames() {
        return _book.keySet();
    }

    /**
     * Возвращает список телефонов контакта name
     * @param name
     * @return
     */
    public List<String> getPhones(String name) {
        return _book.get(name);
    }


    public int size() {
        return _book.size();
    }

    public String toString() {
        String str = "";
        for (String key : _book.keySet()) {
            str += key + " : " + _book.get(key) + "\n";
        }
        return str;
    }
    
}