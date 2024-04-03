import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // preparation
        Crabs crabs = new Crabs();
        Scooperfield scooperfield = new Scooperfield();
//        Cylinder cylinder = new Cylinder();
        StorageItem[] storageItemsOriginal = {
                StorageItem.TOOTHPASTE, StorageItem.TOOTHBRUSH,
                StorageItem.SOCKS, StorageItem.TOWEL, StorageItem.HANDKERCHIEF
        };
        StorageItem[] storageItemsPicked = {
                StorageItem.NAILS, StorageItem.COPPERWIRE
        };
        StorageItem[] storageItemsFinal = {
                StorageItem.TOOTHPASTE, StorageItem.TOOTHBRUSH,
                StorageItem.SOCKS, StorageItem.TOWEL,
                StorageItem.HANDKERCHIEF, StorageItem.NAILS, StorageItem.COPPERWIRE
        };

        // background
        scooperfield.putIn(storageItemsOriginal);
        scooperfield.putIn(storageItemsPicked);

        // main
        crabs.comeBack();
        scooperfield.comeBack();

        crabs.say("");
        scooperfield.lookAround("помещение");
        scooperfield.expressEmotion(
                "изобразил на лице подобие улыбки, которую с таким же успехом можно было принять за гримасу отвращения");
        scooperfield.thank(crabs.name);
        scooperfield.goToRoom(new Room("ванная"));
        scooperfield.takeOff();
        scooperfield.takeOut(storageItemsFinal);


    }
}


