package com.md_5.cascade.entity;

import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class CascadeItem extends CascadeEntity implements Item {

    @Override
    public ItemStack getItemStack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setItemStack(ItemStack stack) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPickupDelay() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPickupDelay(int delay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
