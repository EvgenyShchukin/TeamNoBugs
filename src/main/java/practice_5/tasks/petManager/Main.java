package practice_5.tasks.petManager;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        Cat cat = new Cat();
        petManager.addAnimal(cat);
        petManager.forceFeed();
        petManager.forceInteract();
        petManager.removeAnimal(cat);

        System.out.println("--------------------");

        Dog dog = new Dog();
        petManager.addAnimal(dog);
        petManager.forceFeed();
        petManager.forceInteract();
        petManager.removeAnimal(dog);
    }
}
