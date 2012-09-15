package com.md_5.cascade.entity;

import org.bukkit.entity.Pig;

public class CascadePig extends CascadeAnimals implements Pig {

    @Override
    public boolean hasSaddle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSaddle(boolean saddled) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
