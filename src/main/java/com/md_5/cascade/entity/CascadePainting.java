package com.md_5.cascade.entity;

import org.bukkit.Art;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Painting;

public class CascadePainting extends CascadeEntity implements Painting {

    @Override
    public Art getArt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setArt(Art art) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setArt(Art art, boolean force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean setFacingDirection(BlockFace face, boolean force) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BlockFace getAttachedFace() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFacingDirection(BlockFace face) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BlockFace getFacing() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
