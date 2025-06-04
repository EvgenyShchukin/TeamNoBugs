package practice_8.exceptions.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Валидный email
        Email emailValid = new Email("test@yandex.ru");
        checkEmail(emailValid.getEmail());
        //Невалидный email
        Email emailInvalid = new Email("yandex");
        checkEmail(emailInvalid.getEmail());
    }

    public static void checkEmail(String email) throws InvalidEmailException {
        String regex = "^[\\w-_\\.]+@[\\w\\.-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean isValid = matcher.matches();

        if (isValid) {
            System.out.println("Email-адрес " + email + " валиден.");
        } else {
            throw new InvalidEmailException("Email-адрес " + email + " невалиден.");
        }
    }
}
