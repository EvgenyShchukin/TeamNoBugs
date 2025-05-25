package practice_5.tasks.Pet;

public class main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();

        petManager.addPet(new Dog());
        petManager.forceFeed();
        petManager.forcePetTWalk();

        System.out.println("------------------------------------------");

        petManager.addPet(new Cat());
        petManager.forceFeed();
        petManager.forcePetToPlay();
    }
}
