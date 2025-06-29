package complex_task.task2;

import com.sun.xml.bind.v2.TODO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private static Stream<Arguments> providerInputUserStringNameInValid() {
        return Stream.of(
                Arguments.of(new User("", 33, "test@google.ru"), "Имя пользователя не должно Быть пустым"),
                Arguments.of(new User(null, 33, "test@google.ru"), "Имя пользователя не должно Быть пустым"),
                Arguments.of(new User("саша", 33, "test@google.ru"), "Имя должно начинаться с заглавной буквы")
        );
    }

    private static Stream<Arguments> providerInputUserIntAgeInValid() {
        return Stream.of(
                Arguments.of(new User("Иван", 17, "test@google.ru"), "Пользователь не проходит по возрасту (диапазон 18-100 лет"),
                Arguments.of(new User("Анна", 101, "test@google.ru"), "Пользователь не проходит по возрасту (диапазон 18-100 лет")
        );
    }

    private static Stream<Arguments> providerInputUserIntEmailInValid() {
        return Stream.of(
                Arguments.of(new User("Иван", 32, "@example.com"), "Email не соответствует стандартному формату почты"),
                Arguments.of(new User("Анна", 23, "bad@.com"), "Email не соответствует стандартному формату почты"),
                Arguments.of(new User("Петр", 23, "test@example,ya.com"), "Email не соответствует стандартному формату почты"),
                Arguments.of(new User("Семен", 23, "no-at-symbol"), "Email не соответствует стандартному формату почты"),
                Arguments.of(new User("Елена", 23, "test@example.r"), "Email не соответствует стандартному формату почты"),
                Arguments.of(new User("Таня", 23, "test@example."), "Email не соответствует стандартному формату почты")
        );
    }

    @Test
    @DisplayName("Проверка имени пользователя прошла успешно")
    public void testUserValidatorCheckNameInputValid() {
        User user = new User("Иван", 33, "test@google.ru");
        boolean actualResult = UserValidator.checkName(user.getName());

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @MethodSource("providerInputUserStringNameInValid")
    @DisplayName("Проверка имени пользователя не прошла - проверка исключения и сообщения в нем")
    public void testUserValidatorCheckNameInputInValidCases(User user, String expectedMessage) {
        String actualMessage = "";

        assertThrows(InvalidUserException.class, () -> UserValidator.checkName(user.getName()));

        try {
            UserValidator.checkName(user.getName());
        } catch (InvalidUserException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @Test
    @DisplayName("Проверка возраста пользователя прошла успешно")
    public void testUserValidatorCheckAgeInputValid() {
        User user = new User("Иван", 33, "test@google.ru");
        boolean actualResult = UserValidator.checkAge(user.getAge());

        assertTrue(actualResult);
    }

    // TODO["Разобраться с кейсом - не работает"]
    @Disabled
    @ParameterizedTest
    @MethodSource("providerInputUserIntAgeInValid")
    @DisplayName("Проверка возраста пользователя не прошла - проверка исключения и сообщения в нем")
    public void testUserValidatorCheckAgeInputInValidCases(User user, String expectedMessage) {
        String actualMessage = "";

        assertThrows(InvalidUserException.class, () -> UserValidator.checkAge(user.getAge()));

        try {
            UserValidator.checkAge(user.getAge());
        } catch (InvalidUserException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com",
            "test1234567890.test@example.com",
            "test-test@example.com",
            "t123@123example.com",
            "test@e.com",
            "test@example-ya.com",
            "test@example.ya.com",
            "t@example.ru",
            "test@example.comstartfinish"})
    @DisplayName("Проверка email пользователя прошло успешно")
    public void testUserValidatorCheckEmailInputValid(String email) {
        User user = new User("Иван", 33, email);
        boolean actualResult = UserValidator.checkEmail(user.getEmail());

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @MethodSource("providerInputUserIntEmailInValid")
    @DisplayName("Проверка email пользователя не прошло - проверка исключения и сообщения в нем")
    public void testUserValidatorCheckEmailInputInValidCases(User user, String expectedMessage) {
        String actualMessage = "";

        assertThrows(InvalidUserException.class, () -> UserValidator.checkEmail(user.getEmail()));

        try {
            UserValidator.checkEmail(user.getEmail());
        } catch (InvalidUserException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

}