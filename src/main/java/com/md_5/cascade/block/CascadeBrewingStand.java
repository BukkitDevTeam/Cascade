package com.md_5.cascade.block;

import org.bukkit.block.BrewingStand;
import org.bukkit.inventory.BrewerInventory;

public class CascadeBrewingStand extends CascadeBlockState implements BrewingStand {

    @Override
    public int getBrewingTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBrewingTime(int brewTime) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BrewerInventory getInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
