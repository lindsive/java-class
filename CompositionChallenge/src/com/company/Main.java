package com.company;

public class Main {

    public static void main(String[] args) {
        Bed theBed = new Bed("King", 10, new Dimensions(10, 5, 2));
        Desk theDesk = new Desk("white", 2, "wood",
                new Dimensions(8, 5, 2));

        Room myRoom = new Room(theBed, theDesk);
        myRoom.cleanRoom();
        myRoom.getBed().getComfortLevel();
    }
}
