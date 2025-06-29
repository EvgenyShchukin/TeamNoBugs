package complex_task.task2;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;

        User user = (User) o;

        return this.age == user.age &&
                Objects.equals(this.name, user.name) &&
                Objects.equals(this.email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
