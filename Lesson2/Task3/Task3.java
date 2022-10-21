/*
 Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
(используйте методы split и replace)
 */
package Lesson2.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String filter = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        try {
            System.out.println(get_sql(filter));
        } catch (Exception ex) {
            System.out.println("Ошибка!" + ex.getMessage());
            return;
        }
    }

    /**
     * Формирует SQL запрос с параметрами, переданными в filter, за исключением
     * "null"
     * 
     * @param filter
     * @return
     * @throws Exception
     */
    public static String get_sql(String filter) throws Exception {
        StringBuilder sb = new StringBuilder("select * from students where");
        boolean is_first = true;
        String[] mas = filter.split(",", 0);
        for (String st : mas) {
            String pair[] = st.split(":");
            if (pair.length != 2)
                throw new Exception("Неверный фильтр: " + st);
            if (pair[1].indexOf("null") > 0)
                continue;

            if (is_first) {
                sb.append(" ");
                is_first = false;
            } else
                sb.append(" and ");

            sb.append(pair[0].replaceAll("\"", ""). // удаляем ["]
                    replace(" ", ""));// удаляем пробелы
            sb.append(" = ");
            sb.append(pair[1].replaceAll("\"", "'").// " -> '
                    replace(" ", ""));// удаляем пробелы
        }
        return sb.toString();
    }
}
