public abstract class Person implements HotelRoomRenter, Looker {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void say(String speech) {
        System.out.println(name + " сказал: \"" + speech + "\"");
    }

    void thank(String thanked) {
        System.out.println(name + " поблагодарил " + thanked);
    };

    @Override
    public void lookAround(String thing) {
        System.out.println(name + " окинул взглядом " + thing);
    }

    void expressEmotion(String emotion) {
        System.out.println(name + " " + emotion);
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
}
