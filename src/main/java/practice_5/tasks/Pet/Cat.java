package practice_5.tasks.Pet;

public class Cat extends Pet implements Playable{

    @Override
    public void eat() {
        System.out.println("Кошка питается влажным кормом");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет");
    }
}
