package complex_task.task2;

public class UserValidator {
    private static boolean validationEnabled = true;

    public static void flagValidate(User user) {
        if (!validationEnabled) {
            return;
        }

        checkName(user.getName());
        checkAge(user.getAge());
        checkEmail(user.getEmail());
    }

    public static boolean checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidUserException("Имя пользователя не должно Быть пустым");
        } else if (!(Character.isUpperCase(name.charAt(0)))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        } else {
            return true;
        }
    }

    public static boolean checkAge(int age) {
        if (age < 18 && age > 100) {
            throw new InvalidUserException("Пользователь не проходит по возрасту (диапазон 18-100 лет");
        } else {
            return true;
        }
    }

    public static boolean checkEmail(String email) {
        if (!(email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$"))) {
            throw new InvalidUserException("Email не соответствует стандартному формату почты");
        } else {
            return true;
        }
    }
}
