import java.util.Arrays;
import java.util.Objects;

public class Scooperfield extends Person implements HeaddressOwner, StorageOwner {
    public Scooperfield() {
        super("Скуперфильд");
    }

    @Override
    public void putOn() {
        System.out.println(getName() + " одел цилиндр ");
    }
    @Override
    public void takeOff() {
        System.out.println(getName() + " стащил с головы цилиндр ");
    }

    @Override
    public void putIn(StorageItem[] storageItems) {
        Arrays.asList(storageItems).forEach((x)->{
            System.out.println(getName() + " положил " + x.getName() + " в цилиндр" );
        });

    }
    @Override
    public void takeOut(StorageItem[] storageItems) {
        Arrays.asList(storageItems).forEach((x)->{
            System.out.println(getName() + " вынул " + x.getName() + " из цилиндра" );
        });
    }

    @Override
    public boolean equals(Object object) {
        return true;
    }
}
