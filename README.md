# Java: знакомство и как пользоваться базовым API
### Домашние задания Geekbrains
---
#### Lesson1
__Task1__:
 В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
 - "Доброе утро, <Имя>!", если время от 05:00 до 11:59;
 - "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 - "Добрый вечер, <Имя>!", если время от 18:00 до 22:59; 
 - "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

__Task2:__
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

__Task3:__
Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

__Task4:__
Вычислить n-ое треугольное число

__*Task5:__
Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

---

#### Lesson2

__Task1:__ Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

__Task2:__ Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:

- Расширение файла: txt
- Расширение файла: pdf
- Расширение файла:
- Расширение файла: jpg

__Task3*:__ Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
(используйте методы split и replace)


#### Lesson3

__Task1:__ Пусть дан произвольный список целых чисел, удалить из него четные числа.

__Task2:__ Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. (Collections.max())

__*Task3:__ Реализовать алгоритм сортировки слиянием.

---

#### Lesson4

__Task1:__ Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

__Task2:__  Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

__Task3:__  Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.

