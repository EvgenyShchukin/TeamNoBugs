package practice_5.tasks.Pet;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Лог: Добавили питомца");
    }

    public void forceFeed() {
        this.pet.eat();
        System.out.println("Лог: Покормили питомца");
    }

    public void forcePetToPlay() {
        if (this.pet instanceof Playable) {
            Playable playable = (Playable) this.pet;
            playable.play();
        } else {
            System.out.println("Ошибка: Питомец не играет");
        }
    }

    public void forcePetTWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkable = (Walkable) this.pet;
            walkable.walk();
        } else {
            System.out.println("Ошибка: Питомец не гуляет");
        }
    }
}
