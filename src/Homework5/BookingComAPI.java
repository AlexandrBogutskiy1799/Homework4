package Homework5;

public class BookingComAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    Room[] rooms; //В каждой реализации есть глобальная переменная Room[]
    // rooms, которая должна быть инициализована констуктором по умолчанию пятью разными
    //объектами Room.
}
