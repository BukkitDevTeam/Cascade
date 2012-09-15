package com.md_5.cascade.entity;

import org.bukkit.entity.Creeper;

public class CascadeCreeper extends CascadeMonster implements Creeper {

    @Override
    public boolean isPowered() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPowered(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
