package practice_7;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(4, "Oleg");
        linkedHashMap.put(1, "Vasya");
        linkedHashMap.put(2, "Gena");
        linkedHashMap.put(5, "Kesha");
        linkedHashMap.put(3, "Petr");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("--------------------------------------------");
        //Задача 2:
        //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        LinkedHashMap<String, String> bookPhone = new LinkedHashMap<>();
        bookPhone.put("Oleg", "2343");
        bookPhone.put("Vasya", "2342");
        bookPhone.put("Gena", "4321");
        bookPhone.put("Kesha", "5729");
        bookPhone.put("Petr", "3456");

        System.out.println("Номер телефона:" + bookPhone.get("Kesha"));

        System.out.println("----------------------------------------------------");

        //Задача 3:
        //Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
        LinkedHashMap<String, String> historyAddress = new LinkedHashMap<>();
        historyAddress.put("7", "google");
        historyAddress.put("8", "yandex");
        historyAddress.put("2", "mail");
        historyAddress.put("1", "rambler");
        historyAddress.put("4", "hh");
        historyAddress.put("3", "news");
        historyAddress.put("5", "rbk");
        historyAddress.put("6", "tg");
        historyAddress.put("9", "habr");
        historyAddress.put("10", "ntv");

        if (historyAddress.size() > 10) {
            historyAddress.remove(7);
        }
        for (Map.Entry<String, String> entry : historyAddress.entrySet()) {
            System.out.println(entry);
        }
    }
}
