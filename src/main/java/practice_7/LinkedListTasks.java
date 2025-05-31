package practice_7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Katya");
        linkedList.add("Petr");
        linkedList.add("Egor");
        linkedList.add("Artem");
        linkedList.add("Lena");

        System.out.println("Вывод всех элементов LinkedList" + linkedList);
        System.out.println("----------------------------------------------");

        //Задача 2:
        //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
        LinkedList<String> taskPriority = new LinkedList<>();
        taskPriority.add("task_1");
        taskPriority.add("task_2");
        taskPriority.add("task_3");

        Iterator iterator = taskPriority.iterator();
        while (iterator.hasNext()) {
            System.out.println("Задача: " + iterator.next());
        }

        System.out.println("-------------------------------------------------");

        //Задача 3:
        //Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
        LinkedList<String> taskFirslLast = new LinkedList<>();
        taskFirslLast.add("элемент_1");
        taskFirslLast.add("элемент_2");
        taskFirslLast.add("элемент_3");

        System.out.println("Первый элемент: " + taskFirslLast.getFirst());
        System.out.println("Последний элемент: " + taskFirslLast.getLast());

        System.out.println("-------------------------------------------------");

        //Задача 4:
        //Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        int sum = 0;
        LinkedList<Integer> digital = new LinkedList<>();
        digital.add(5);
        digital.add(15);
        digital.add(20);
        digital.add(3);

        for (Integer i : digital) {
            sum = sum + i;
        }
        System.out.println("Сумма элементов списка: " + sum);
        System.out.println("-------------------------------------------------");


        //Задача 5:
        //Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        LinkedList<String> reverseList = new LinkedList<>();
        reverseList.add("Первый");
        reverseList.add("Второй");
        reverseList.add("Третий");
        reverseList.add("Четвертый");

        ListIterator iteratorReverse = reverseList.listIterator();

        System.out.println("Проход в обычном порядке");
        while (iteratorReverse.hasNext()) {
            System.out.println(iteratorReverse.next());
        }
        System.out.println("Проход в обратном порядке");
        while (iteratorReverse.hasPrevious()) {
            System.out.println(iteratorReverse.previous());
        }
    }
}
