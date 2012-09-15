package com.md_5.cascade.block;

import java.util.Collection;
import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class CascadeBlock implements Block {

    @Override
    public byte getData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getRelative(int modX, int modY, int modZ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getRelative(BlockFace face) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getRelative(BlockFace face, int distance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Material getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTypeId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public byte getLightLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public byte getLightFromSky() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public byte getLightFromBlocks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getZ() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Chunk getChunk() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setData(byte data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setData(byte data, boolean applyPhysics) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setType(Material type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setTypeId(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setTypeId(int type, boolean applyPhysics) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BlockFace getFace(Block block) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BlockState getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Biome getBiome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBiome(Biome bio) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBlockPowered() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBlockIndirectlyPowered() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBlockFacePowered(BlockFace face) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getBlockPower(BlockFace face) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getBlockPower() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLiquid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getTemperature() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getHumidity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean breakNaturally() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean breakNaturally(ItemStack tool) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ItemStack> getDrops() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ItemStack> getDrops(ItemStack tool) {
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
}
