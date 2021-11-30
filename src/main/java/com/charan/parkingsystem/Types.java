package com.charan.parkingsystem;

public class Types {
    public enum VehicleType {
        CAR, BIKE, TRUCK
    }

    public enum ParkingSlotType {}

    public enum DisplayType {
        FREE_COUNT, FREE_SLOTS, OCCUPIED_SLOTS
    }

    public enum Command {
        create_parking_lot, park_vehicle, unpark_vehicle, display
    }
}
