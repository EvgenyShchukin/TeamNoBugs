package practice_7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Gena", 47);
        treeMap.put("Lena", 85);
        treeMap.put("Evgeny", 95);
        treeMap.put("Masha", 23);
        treeMap.put("Semen", 74);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-------------------------------------------");

        //Задача 2:
        //Найдите минимальный и максимальный ключ в TreeMap.
        System.out.println("Минимальный ключ: " + treeMap.firstKey());
        System.out.println("Максимальный ключ:" + treeMap.lastKey());

        System.out.println("-------------------------------------------");

        //Задача 3:
        //Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
        TreeMap<Integer, String> employee = new TreeMap<>();
        employee.put(47, "Gena");
        employee.put(85, "Lena");
        employee.put(95, "Evgeny");
        employee.put(23, "Masha");
        employee.put(74, "Semen");

        System.out.println("Ближайший больший ID: " + employee.higherKey(90));

    }
}
