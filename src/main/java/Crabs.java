public class Crabs extends Person {

    public Crabs() {
        super("Крабс");
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

}

