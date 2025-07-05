package practice_5.tasks.zooPark;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.forceMove();
        zoo.forceMakeSound();
        zoo.removeAnimal(elephant);

        System.out.println("---------------------------------");
        
        Bird bird = new Bird();
        zoo.addAnimal(bird);
        zoo.forceMove();
        zoo.forceMakeSound();
        zoo.removeAnimal(bird);
    }
}
