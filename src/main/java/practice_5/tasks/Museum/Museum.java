package practice_5.tasks.Museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Лог: Добавлен экспонат");
    }

    public void forceHumidityControl() {
        if (this.exhibit instanceof Manuscript) {
            Manuscript manuscript = (Manuscript) this.exhibit;
            manuscript.humidityControl();
        } else {
            System.out.println("Ошибка: Скульптура не требует контроля влажности");
        }
    }

    public void forceRestoration() {
        if (this.exhibit instanceof Sculpture) {
            Sculpture sculpture = (Sculpture) this.exhibit;
            sculpture.restoration();
        } else {
            System.out.println("Ошибка: Манускрипт не требует реставрации");
        }
    }
}
