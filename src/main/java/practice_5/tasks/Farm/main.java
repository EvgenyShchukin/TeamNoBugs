package practice_5.tasks.Farm;

public class main {
    public static void main(String[] args) {
        FarmManager farmManager = new FarmManager();

        farmManager.addFarmAnimal(new Cow());
        farmManager.forceGives();
        farmManager.forceRequires();

        System.out.println("---------------------------------");

        farmManager.addFarmAnimal(new Chicken());
        farmManager.forceGives();
        farmManager.forceRequires();
    }
}
