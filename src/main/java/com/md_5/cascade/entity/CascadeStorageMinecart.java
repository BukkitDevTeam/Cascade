package com.md_5.cascade.entity;

import org.bukkit.entity.StorageMinecart;
import org.bukkit.inventory.Inventory;

public class CascadeStorageMinecart extends CascadeMinecart implements StorageMinecart {

    @Override
    public Inventory getInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
