package com.md_5.cascade;

import java.util.Map;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class CascadeOfflinePlayer implements OfflinePlayer {

    @Override
    public boolean isOnline() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isBanned() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBanned(boolean banned) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isWhitelisted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setWhitelisted(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getFirstPlayed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getLastPlayed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPlayedBefore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getBedSpawnLocation() {
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

    @Override
    public Map<String, Object> serialize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
