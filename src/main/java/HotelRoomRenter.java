public interface HotelRoomRenter {
    default void goOut() {
        System.out.println("ушел из номера отеля");
    }

    default void comeBack() {
        System.out.println("вернулся в номер отеля");
    }

    default void goToRoom(Room room) {
        System.out.println("зашел в " + room.name);
    }

    default void goOutOfRoom(Room room) {
        System.out.println("вышел из " + room.name);
    }

}

