package Homework5.API;

import Homework5.Model.Room;

public class GoogleAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
    Room[] rooms;
}
