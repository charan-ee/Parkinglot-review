package com.charan.parkingsystem.strategy;

import com.charan.parkingsystem.parking.ParkingFloor;
import com.charan.parkingsystem.parking.ParkingSlot;
import com.charan.parkingsystem.parking.Ticket;
import com.charan.parkingsystem.vehicle.Vehicle;

import java.util.List;

public class CarStrategy implements ParkStrategy {
    Ticket ticket;

    public Ticket park(Vehicle vehicle, List<ParkingFloor> floorList){
        Ticket ticket3 = null;
        floorList.forEach(floor -> {
            List<ParkingSlot> slots = floor.getFloorSlots();
            slots.stream().filter(slot -> (slot.getIsFree() && slot.getSlotID() > 3)).forEach(slot -> {
                slot.setOccupied(false);
//                ticket3 = new Ticket(floor, slot);
            });
        });
        return null;
    }
}
