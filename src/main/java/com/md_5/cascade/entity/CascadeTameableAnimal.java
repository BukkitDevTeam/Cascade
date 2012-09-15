package com.md_5.cascade.entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Tameable;

public class CascadeTameableAnimal extends CascadeAnimals implements Creature, Tameable {

    @Override
    public boolean isTamed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTamed(boolean tame) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnimalTamer getOwner() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOwner(AnimalTamer tamer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
