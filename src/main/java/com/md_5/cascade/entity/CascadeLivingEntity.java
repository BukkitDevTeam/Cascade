package com.md_5.cascade.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CascadeLivingEntity extends CascadeEntity implements LivingEntity {

    @Override
    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setHealth(int health) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getEyeHeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getEyeHeight(boolean ignoreSneaking) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getEyeLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Egg throwEgg() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Snowball throwSnowball() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Arrow shootArrow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRemainingAir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRemainingAir(int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaximumAir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaximumAir(int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void damage(int amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void damage(int amount, Entity source) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaximumNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMaximumNoDamageTicks(int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLastDamage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLastDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNoDamageTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNoDamageTicks(int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Player getKiller() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect effect) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect effect, boolean force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> effects) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removePotionEffect(PotionEffectType type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasLineOfSight(Entity other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
