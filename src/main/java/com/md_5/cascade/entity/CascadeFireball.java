package com.md_5.cascade.entity;

import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;

public class CascadeFireball extends AbstractProjectile implements Fireball {

    @Override
    public LivingEntity getShooter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setShooter(LivingEntity shooter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDirection(Vector direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getDirection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setYield(float yield) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getYield() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setIsIncendiary(boolean isIncendiary) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isIncendiary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
