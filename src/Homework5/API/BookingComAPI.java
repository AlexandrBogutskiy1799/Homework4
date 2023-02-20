package Homework5.API;

import Homework5.Model.Room;

import java.util.ArrayList;
import java.util.List;

public class BookingComAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }




    //В каждой реализации есть глобальная переменная Room[]
    // rooms, которая должна быть инициализована констуктором по умолчанию пятью разными
    //объектами Room.
}
