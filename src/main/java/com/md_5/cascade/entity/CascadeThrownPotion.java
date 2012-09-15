package com.md_5.cascade.entity;

import java.util.Collection;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.potion.PotionEffect;

public class CascadeThrownPotion extends CascadeProjectile implements ThrownPotion {

    @Override
    public Collection<PotionEffect> getEffects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
