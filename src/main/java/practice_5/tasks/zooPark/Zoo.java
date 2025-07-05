package practice_5.tasks.zooPark;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        System.out.println("Добавлено животное " + animal + " в зоопарк");
        this.animal = animal;
    }

    public void forceMove() {
        this.animal.move();
    }

    public void forceMakeSound() {
        this.animal.makeSound();
    }

    public void removeAnimal(Animal animal) {
        System.out.println("Животное " + animal + " удалено из зоопарка");
        this.animal = null;
    }
}
