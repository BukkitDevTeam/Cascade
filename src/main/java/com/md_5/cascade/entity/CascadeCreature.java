package com.md_5.cascade.entity;

import org.bukkit.entity.Creature;
import org.bukkit.entity.LivingEntity;

public class CascadeCreature extends CascadeLivingEntity implements Creature {

    @Override
    public void setTarget(LivingEntity target) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LivingEntity getTarget() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
