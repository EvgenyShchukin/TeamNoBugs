package practice_7;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
        int number;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(6);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        priorityQueue.offer(9);

        System.out.println("Элементы очереди:");
        priorityQueue.forEach(System.out::println);

        System.out.println("Удаление элементов:");
        while (!priorityQueue.isEmpty()) {
            number = priorityQueue.poll();
            System.out.println(number);
        }
    }
}
