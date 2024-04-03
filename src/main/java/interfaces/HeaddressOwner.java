//public interface HeaddressOwner {
//    default void takeOff(Person owner, Headdress headdress) {
//        headdress.takeOff(owner);
//    };
//    default void putOn(Person owner, Headdress headdress) {
//        headdress.takeOff(owner);
//    };
//}

public interface HeaddressOwner {
    void takeOff();
    void putOn();
}
