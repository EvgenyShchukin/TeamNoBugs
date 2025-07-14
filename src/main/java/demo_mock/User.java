package demo_mock;

import java.util.HashSet;
import java.util.Set;

public class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Petya", 19));
        users.add(new User("Petya", 19));
        users.add(new User("Petya", 19));

        System.out.println(users.size());
        //Будет 3 юзера, т.к. эти объекты разные и имеют разное числовое представление
    }
}
