package Homework5.API;

import Homework5.Model.Room;

public class TripAdvisorAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
    Room[] rooms;
}
