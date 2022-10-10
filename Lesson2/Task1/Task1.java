/*
Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
 */

package Lesson2.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
    public static Logger logger;

    public static void main(String[] args) {
        set_logging();
        String[] files;
        files = get_files();
        System.out.println(String.join("\n", Arrays.asList(files)));
        save_strings("result.txt", files);
    }

    /**
     * Возвращает массив String[] из имен файлов в текущей дирректории.
     * 
     * @return массив String[] из имен файлов
     */
    public static String[] get_files() {

        File dir = new File("."); // path указывает на директорию

        File[] files;
        try {
            files = dir.listFiles();
        } catch (Exception ex) {
            logger.info(ex.getMessage());
            ex.printStackTrace();
            return null;
        }
        if (files == null)
            return null;

        List<String> list = new ArrayList<String>();
        for (File file : files)
            list.add(file.getName());

        return list.toArray(new String[0]);
    }

    /**
     * Записывает массив строк в файл.
     * 
     * @param file_name имя файла
     * @param data      строковый массив для записи
     */
    public static void save_strings(String file_name, String[] data) {
        File f = new File(file_name);
        FileWriter fileWriter = null;
        try {
            if (!f.exists())
                f.createNewFile();
            fileWriter = new FileWriter(f, false);
            for (String string : data) {
                fileWriter.write(string + '\n');
            }
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.info(e.getMessage());
            }
        }
    }

    /**
     * Инициализация логирования
     */
    public static void set_logging() {
        logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setLevel(Level.INFO);
        fh.setFormatter(simpleFormatter);
        logger.addHandler(fh);

        logger.info("Logging started!");
    }
}
