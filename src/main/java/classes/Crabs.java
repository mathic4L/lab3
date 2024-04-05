package classes;

import interfaces.HotelRoomRenter;
import interfaces.Thankable;

public class Crabs extends Person implements Thankable, HotelRoomRenter {

    @Override
    public String getName() {
        return "Крабс";
    }

    @Override
    public String getThankedName() {
        return "Крабс";
    }

    @Override
    public void comeBack() {
        System.out.print(getName() + " ");
        super.comeBack();
        System.out.println(" и сказал:");
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }
}

