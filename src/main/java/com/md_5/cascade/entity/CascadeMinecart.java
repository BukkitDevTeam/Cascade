package com.md_5.cascade.entity;

import org.bukkit.entity.Minecart;
import org.bukkit.util.Vector;

public class CascadeMinecart extends CascadeVehicle implements Minecart {

    @Override
    public void setDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getDamage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getMaxSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaxSpeed(double speed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSlowWhenEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSlowWhenEmpty(boolean slow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getFlyingVelocityMod() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFlyingVelocityMod(Vector flying) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getDerailedVelocityMod() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDerailedVelocityMod(Vector derailed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
