package classes;

import java.util.Objects;

public abstract class Person {
    public abstract String getName();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(this.getName(), person.getName());
    }

    @Override
    public String toString() {
        return "classes.Person{" +
                "name='" + getName() + '\'' +
                '}';
    }
    void comeBack() {
        System.out.print("вернулся в номер отеля ");
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(getName());
    }
}
