package com.md_5.cascade.entity;

import org.bukkit.entity.Enderman;
import org.bukkit.material.MaterialData;

public class CascadeEnderman extends CascadeMonster implements Enderman {

    @Override
    public MaterialData getCarriedMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCarriedMaterial(MaterialData material) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
