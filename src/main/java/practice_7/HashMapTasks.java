package practice_7;

import org.w3c.dom.Entity;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTasks {
    public static void main(String[] args) {
        //Задача 1:
        //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Lena", 23);
        hashMap.put("Oleg", 16);
        hashMap.put("Masha", 18);
        hashMap.put("Petr", 25);
        hashMap.put("Liza", 17);

        System.out.println("Вывод всех записей HashMap");
        System.out.println(hashMap);

        System.out.println("---------------------------------------");

        //Задача 2:
        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println("Валидный кейс");
        if (hashMap.containsKey("Lena")) {
            System.out.println("Запись найдена: Ключ Lena, значение " + hashMap.get("Lena"));
        } else {
            System.out.println("Запись не найдена");
        }

        System.out.println("Невалидный кейс");
        if (hashMap.containsKey("Semen")) {
            System.out.println("Запись найдена: Ключ Lena, значение " + hashMap.get("Lena"));
        } else {
            System.out.println("Запись не найдена");
        }

        System.out.println("---------------------------------------");

        //Задача 3:
        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        print(hashMap);

    }

    public static void print(Map<String, Integer> map) {
        System.out.println("Вывод несовершеннолетних людей:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry);
            }
        }
    }
}
