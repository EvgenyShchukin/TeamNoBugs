package practice_5.tasks.Zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal + " было добавлено в зоопарк");
    }

    public void forceMove() {
        this.animal.move();
    }

    public void forceMakeSound() {
        this.animal.makeSound();
    }

    public void removeAnimal() {
        System.out.println("Животное " + animal + " было удалено");
        this.animal = null;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animal=" + this.animal.toString() +
                '}';
    }
}
