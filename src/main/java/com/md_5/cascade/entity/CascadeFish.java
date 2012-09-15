package com.md_5.cascade.entity;

import org.bukkit.entity.Fish;
import org.bukkit.entity.LivingEntity;

public class CascadeFish extends AbstractProjectile implements Fish {

    @Override
    public LivingEntity getShooter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setShooter(LivingEntity shooter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
