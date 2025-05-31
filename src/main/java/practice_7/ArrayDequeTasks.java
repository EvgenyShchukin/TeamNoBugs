package practice_7;

import java.util.ArrayDeque;

public class ArrayDequeTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте ArrayDeque, добавьте 5 элементов и выведите их.
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(3);
        arrayDeque.add(2);
        arrayDeque.add(5);
        arrayDeque.add(1);
        arrayDeque.add(4);

        System.out.println("Элементы ArrayDeque:");
        for (Integer i : arrayDeque) {
            System.out.println(arrayDeque);
        }

        System.out.println("------------------------------------------------");

        //Задача 2:
        //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
        ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();
        reverseDeque.push(3);
        reverseDeque.push(2);
        reverseDeque.push(5);
        reverseDeque.push(1);
        reverseDeque.push(4);

        System.out.println("Элементы ArrayDeque:");
        for (Integer i : reverseDeque) {
            System.out.println(reverseDeque);
        }

        System.out.println("Извлечение элементов:");
        while (!reverseDeque.isEmpty()) {
            System.out.println(reverseDeque.pop());
        }

        System.out.println("------------------------------------------------");

        //Задача 3:
        //Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        ArrayDeque<Integer> mixDeque = new ArrayDeque<>();
        mixDeque.addLast(3);
        mixDeque.addFirst(2);
        mixDeque.addFirst(5);
        mixDeque.addLast(1);
        mixDeque.addLast(4);

        System.out.println("Элементы ArrayDeque:");
        for (Integer i : mixDeque) {
            System.out.println(mixDeque);
        }

        System.out.println("Извлечение элементов:");
        System.out.println("Извлечение с конца: " + mixDeque.removeLast());
        System.out.println("Извлечение с начала: " + mixDeque.removeFirst());
    }
}
