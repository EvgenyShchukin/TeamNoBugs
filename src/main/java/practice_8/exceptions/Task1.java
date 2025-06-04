package practice_8.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}
