package classes;

import interfaces.*;

import java.util.Arrays;

public class Scooperfield extends Person implements HotelRoomRenter, StorageOwner, HeaddressOwner {
    @Override
    public String getName() {
        return "Скуперфильд";
    }

    public void lookAround(String thing) {
        System.out.println(getName() + " окинул взглядом " + thing);
    }

    public void thank(Thankable thankable) {
        System.out.println(getName() + " поблагодарил " + thankable.getThankedName());
    }

    public void expressEmotion(Emotion emotion) {
        System.out.println(getName() + emotion.express());
    }

    public void goToRoom(Room room) {
        System.out.println(getName() + " зашел в " + room.getName());
    }


    @Override
    public void comeBack() {
        System.out.print(getName() + " ");
        super.comeBack();
        System.out.println();
    }

    @Override
    public void takeOff(Headdress headdress) {
        System.out.println(getName() + " стащил с головы " + headdress.getType());
    }

    @Override
    public void takeOut(StorageItem[] storageItems) {
        Arrays.asList(storageItems).forEach((x) -> {
            System.out.println(getName() + " вынул " + x.getName() + " из цилиндра");
        });
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }
}
