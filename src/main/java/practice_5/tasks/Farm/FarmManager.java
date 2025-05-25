package practice_5.tasks.Farm;

public class FarmManager {
    private FarmAnimal farmAnimal;



   public void addFarmAnimal(FarmAnimal farmAnimal) {
       this.farmAnimal = farmAnimal;
       System.out.println("Лог: Добавили животного");
   }

    public void forceGives() {
        farmAnimal.give();
    }

    public void forceRequires() {
        farmAnimal.requires();
    }
}
