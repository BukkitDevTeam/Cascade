package com.md_5.cascade.entity;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.LivingEntity;

public class CascadeArrow extends AbstractProjectile implements Arrow {

    @Override
    public LivingEntity getShooter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setShooter(LivingEntity shooter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
