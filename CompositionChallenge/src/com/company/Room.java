package com.company;

public class Room {

    private Bed bed;
    private Desk desk;

    public Room(Bed bed, Desk desk) {
        this.bed = bed;
        this.desk = desk;
    }

    public void cleanRoom() {
        bed.makeBed();
        desk.clean();
        System.out.println("the room has been cleaned");
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        System.out.println("desk: " + desk);
        return desk;
    }
}
