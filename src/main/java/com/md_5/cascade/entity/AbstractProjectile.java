package com.md_5.cascade.entity;

import org.bukkit.entity.Projectile;

public abstract class AbstractProjectile extends CascadeEntity implements Projectile {

    @Override
    public boolean doesBounce() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBounce(boolean doesBounce) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
