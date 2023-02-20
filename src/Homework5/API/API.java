package Homework5.API;

import Homework5.Model.Room;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}
