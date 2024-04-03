import java.util.Objects;

public abstract class Person implements HotelRoomRenter, Looker {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void say(String speech) {
        System.out.println(name + " сказал: \"" + speech + "\"");
    }
    public void thank(String thanked) {
        System.out.println(name + " поблагодарил " + thanked);
    }
    public void expressEmotion(String emotion) {
        System.out.println(name + " " + emotion);
    }

    @Override
    public void lookAround(String thing) {
        System.out.println(name + " окинул взглядом " + thing);
    }
    @Override
    public void goOut() {
        System.out.print(getName() + " ");
        HotelRoomRenter.super.goOut();
    }
    @Override
    public void comeBack() {
        System.out.print(getName() + " ");
        HotelRoomRenter.super.comeBack();
    }
    @Override
    public void goToRoom(Room room) {
        System.out.print(name + " ");
        HotelRoomRenter.super.goToRoom(room);
    }
    @Override
    public void goOutOfRoom(Room room) {
        System.out.println(name + " ");
        HotelRoomRenter.super.goOutOfRoom(room);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(this.name, person.name);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
