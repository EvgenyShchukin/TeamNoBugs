package practice_8.exceptions.task3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void checkAgeValid(int age) throws InvalidAgExceptions {
        if (age < 150 && age > 0) {
            System.out.println("Пользователь прошел по возрасту");
        } else {
            throw new InvalidAgExceptions("Не подходите по возрасту");
        }

    }
}
