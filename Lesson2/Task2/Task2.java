/*
Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
- Расширение файла: txt
- Расширение файла: pdf
- Расширение файла:
- Расширение файла: jpg
*/
package Lesson2.Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> files = get_files();
        for (String file : files)
            System.out.println(file + " - Расширение: " + get_extention(file));
    }

    /**
     * получает расширение из имени файла
     * 
     * @param file название файла
     * @return строка содержащая расширение файла file
     */
    public static String get_extention(String file) {
        int index = file.lastIndexOf(".");
        if (index == -1)
            return "";
        return file.substring(index + 1);
    }

    /**
     * Возвращает список из имен файлов в текущей дирректории.
     * 
     * @return список из имен файлов
     */
    public static List<String> get_files() {

        File dir = new File(".");

        File[] files;
        try {
            files = dir.listFiles();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        if (files == null)
            return null;

        List<String> list = new ArrayList<String>();
        for (File file : files)
            if (file.isFile())
                list.add(file.getName());

        return list;
    }
}
