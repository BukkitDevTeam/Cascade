package com.md_5.cascade.entity;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;

public class CascadeSheep extends CascadeAnimals implements Sheep {

    @Override
    public boolean isSheared() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSheared(boolean flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DyeColor getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setColor(DyeColor color) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
