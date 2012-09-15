package com.md_5.cascade.entity;

import java.util.List;
import java.util.UUID;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class CascadeEntity implements Entity {

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setVelocity(Vector velocity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getVelocity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Location location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Location location, TeleportCause cause) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Entity destination) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean teleport(Entity destination, TeleportCause cause) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Entity> getNearbyEntities(double x, double y, double z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getEntityId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFireTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getMaxFireTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFireTicks(int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDead() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Server getServer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Entity getPassenger() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setPassenger(Entity passenger) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getFallDistance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFallDistance(float distance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UUID getUniqueId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTicksLived() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTicksLived(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playEffect(EntityEffect type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityType getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInsideVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean leaveVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Entity getVehicle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasMetadata(String metadataKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName();
    }
}
