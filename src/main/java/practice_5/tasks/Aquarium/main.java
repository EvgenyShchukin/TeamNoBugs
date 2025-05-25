package practice_5.tasks.Aquarium;

public class main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.addSeeAnimal(new Shark());
        aquarium.showFloats();

        System.out.println("---------------------------------------------");

        aquarium.addSeeAnimal(new FiveFinger());
        aquarium.showFloats();
    }
}
