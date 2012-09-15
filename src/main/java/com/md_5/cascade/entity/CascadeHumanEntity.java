package com.md_5.cascade.entity;

import java.util.Set;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

public class CascadeHumanEntity extends CascadeLivingEntity implements HumanEntity {

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PlayerInventory getInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Inventory getEnderChest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setWindowProperty(Property prop, int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InventoryView getOpenInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InventoryView openInventory(Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InventoryView openWorkbench(Location location, boolean force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InventoryView openEnchanting(Location location, boolean force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void openInventory(InventoryView inventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void closeInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ItemStack getItemInHand() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setItemInHand(ItemStack item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ItemStack getItemOnCursor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setItemOnCursor(ItemStack item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSleeping() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getSleepTicks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GameMode getGameMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setGameMode(GameMode mode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBlocking() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getExpToLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPermissionSet(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPermissionSet(Permission perm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPermission(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPermission(Permission perm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void recalculatePermissions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isOp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOp(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
