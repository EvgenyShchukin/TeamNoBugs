package practice_5.tasks.Aquarium;

public class Aquarium {
    SeeAnimal seeAnimal;

    public void addSeeAnimal (SeeAnimal seeAnimal) {
        this.seeAnimal = seeAnimal;
        System.out.println("Лог: Морское животное добавлено");
    }

    public void showFloats() {
        seeAnimal.floats();
    }
}
