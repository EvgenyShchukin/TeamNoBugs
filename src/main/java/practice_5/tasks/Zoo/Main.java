package practice_5.tasks.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird bird = new Bird();

        zoo.addAnimal(bird);
        zoo.forceMakeSound();
        zoo.forceMove();
        zoo.removeAnimal();

        Elephant elephant = new Elephant();

        zoo.addAnimal(elephant);
        zoo.forceMakeSound();
        zoo.forceMove();
        zoo.removeAnimal();
    }
}
