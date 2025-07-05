package practice_5.tasks.farm;

public class FarmManager {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Добавлено животное: " + farmAnimal);
    }

    public void forceFeed() {
        this.farmAnimal.feed();
    }

    public void forceCare() {
        this.farmAnimal.care();
    }

    public void forceProduce() {
        this.farmAnimal.produce();
    }

    public void removeFarmAnimal() {
        System.out.println("Удалено " + farmAnimal + " из фермы");
        this.farmAnimal = null;
    }
}
