package practice_8.exceptions.task3;

public class Main {
    public static void main(String[] args) throws InvalidAgExceptions {
        //Пользователь прошел
        Person person1 = new Person("Oleg" , 34);
        person1.checkAgeValid(person1.getAge());
        System.out.println("---------------------------------------");
        //Пользователь не прошел
        Person person2 = new Person("Elena" , 155);
        person2.checkAgeValid(person2.getAge());
    }


}
