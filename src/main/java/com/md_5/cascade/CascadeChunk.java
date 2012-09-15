package com.md_5.cascade;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;

public class CascadeChunk implements Chunk {

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getZ() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Block getBlock(int x, int y, int z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ChunkSnapshot getChunkSnapshot() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ChunkSnapshot getChunkSnapshot(boolean includeMaxblocky, boolean includeBiome, boolean includeBiomeTempRain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Entity[] getEntities() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BlockState[] getTileEntities() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLoaded() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean load(boolean generate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean load() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean unload(boolean save, boolean safe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean unload(boolean save) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean unload() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
