import java.util.Arrays;

public class Scooperfield extends Person implements HeaddressOwner, StorageOwner {
    public Scooperfield() {
        super("Скуперфильд");
    }

    @Override
    public void comeBack() {
        System.out.print(name + " ");
        super.comeBack();
    }

    @Override
    public void goOut() {
        System.out.print(name + " ");
        super.goOut();
    }

    @Override
    public void putOn() {
        System.out.println(name + " одел цилиндр ");
    }

    @Override
    public void takeOff() {
        System.out.println(name + " стащил с головы цилиндр ");
    }

    @Override
    public void putIn(StorageItem[] storageItems) {
        Arrays.asList(storageItems).forEach((x)->{
            System.out.println(name + " положил " + x.name + " в цилиндр" );
        });

    }

    @Override
    public void takeOut(StorageItem[] storageItems) {
        Arrays.asList(storageItems).forEach((x)->{
            System.out.println(name + " вынул " + x.name + " из цилиндра" );
        });
    }
}
