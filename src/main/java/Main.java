import classes.*;

public class Main {
    public static void main(String[] args) {

        // preparation
        Crabs crabs = new Crabs();
        Scooperfield scooperfield = new Scooperfield();
        StorageItem[] storageItems = {
                StorageItem.TOOTHPASTE, StorageItem.TOOTHBRUSH,
                StorageItem.SOCKS, StorageItem.TOWEL,
                StorageItem.HANDKERCHIEF, StorageItem.NAILS, StorageItem.COPPERWIRE
        };

        // main
        crabs.comeBack();
        scooperfield.comeBack();

        scooperfield.lookAround("помещение");
        scooperfield.expressEmotion(new SmileDisgust());
        scooperfield.thank(crabs);
        scooperfield.goToRoom(new Room("ванная"));
        scooperfield.takeOff(new Cylinder());
        scooperfield.takeOut(storageItems);
        
    }
}


