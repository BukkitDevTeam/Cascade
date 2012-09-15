package com.md_5.cascade.entity;

import org.bukkit.entity.Boat;

public class CascadeBoat extends CascadeVehicle implements Boat {

    @Override
    public double getMaxSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaxSpeed(double speed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getOccupiedDeceleration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOccupiedDeceleration(double rate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getUnoccupiedDeceleration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setUnoccupiedDeceleration(double rate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getWorkOnLand() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setWorkOnLand(boolean workOnLand) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
