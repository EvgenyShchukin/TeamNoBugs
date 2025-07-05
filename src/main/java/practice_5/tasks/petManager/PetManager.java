package practice_5.tasks.petManager;

public class PetManager {
    private Animal animal;

    public void addAnimal(Animal animal) {
        System.out.println("Добавлен питомец: " + animal);
        this.animal = animal;
    }

    public void forceFeed() {
        this.animal.feed();
    }

    public void forceInteract() {
        this.animal.interact();
    }

    public void removeAnimal(Animal animal) {
        System.out.println("Удален питомец: " + animal);
        this.animal = null;
    }
}
