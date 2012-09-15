package com.md_5.cascade.block;

import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;

public class CascadeChest extends CascadeBlockState implements Chest {

    @Override
    public Inventory getBlockInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Inventory getInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
