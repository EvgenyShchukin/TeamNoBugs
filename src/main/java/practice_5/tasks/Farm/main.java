package practice_5.tasks.farm;

public class Main {
    public static void main(String[] args) {
        FarmManager farmManager = new FarmManager();

        Chicken chicken = new Chicken();
        farmManager.addFarmAnimal(chicken);
        farmManager.forceFeed();
        farmManager.forceCare();
        farmManager.forceProduce();
        farmManager.removeFarmAnimal();

        System.out.println("-------------------");

        Cow cow = new Cow();
        farmManager.addFarmAnimal(cow);
        farmManager.forceFeed();
        farmManager.forceCare();
        farmManager.forceProduce();
        farmManager.removeFarmAnimal();
    }
}
