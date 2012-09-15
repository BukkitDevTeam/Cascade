package com.md_5.cascade.entity;

import org.bukkit.entity.Villager;

public class CascadeVillager extends CascadeAgeable implements Villager {

    @Override
    public Profession getProfession() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setProfession(Profession profession) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
