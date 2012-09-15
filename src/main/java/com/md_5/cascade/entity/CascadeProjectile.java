package com.md_5.cascade.entity;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;

public class CascadeProjectile extends AbstractProjectile implements Projectile {

    @Override
    public LivingEntity getShooter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setShooter(LivingEntity shooter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
