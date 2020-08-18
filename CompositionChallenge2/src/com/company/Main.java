package com.company;

public class Main {

    public static void main(String[] args) {
	    Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("modern", 4, 3, 2 , 1);

        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedRoom = new Bedroom("linds", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        // other way of accessing via getter
        bedRoom.getLamp().turnOn();

    }
}
