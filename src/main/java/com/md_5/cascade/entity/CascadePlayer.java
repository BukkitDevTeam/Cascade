package com.md_5.cascade.entity;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Set;
import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Player;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;

public class CascadePlayer extends CascadeHumanEntity implements Player {

    @Override
    public String getDisplayName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDisplayName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getPlayerListName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPlayerListName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCompassTarget(Location loc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getCompassTarget() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InetSocketAddress getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendRawMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void kickPlayer(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void chat(String msg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean performCommand(String command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSneaking() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSneaking(boolean sneak) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSprinting() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSprinting(boolean sprinting) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void loadData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSleepingIgnored(boolean isSleeping) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSleepingIgnored() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playNote(Location loc, byte instrument, byte note) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playNote(Location loc, Instrument instrument, Note note) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playSound(Location location, Sound sound, float volume, float pitch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void playEffect(Location loc, Effect effect, int data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> void playEffect(Location loc, Effect effect, T data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendBlockChange(Location loc, Material material, byte data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendBlockChange(Location loc, int material, byte data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendMap(MapView map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateInventory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void awardAchievement(Achievement achievement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void incrementStatistic(Statistic statistic) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void incrementStatistic(Statistic statistic, int amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void incrementStatistic(Statistic statistic, Material material, int amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPlayerTime(long time, boolean relative) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getPlayerTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getPlayerTimeOffset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPlayerTimeRelative() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resetPlayerTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void giveExp(int amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getExp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setExp(float exp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLevel(int level) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTotalExperience() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setTotalExperience(int exp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getExhaustion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setExhaustion(float value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getSaturation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSaturation(float value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getFoodLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFoodLevel(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getBedSpawnLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setBedSpawnLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getAllowFlight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAllowFlight(boolean flight) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hidePlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void showPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean canSee(Player player) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFlying() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFlying(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFlySpeed(float value) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setWalkSpeed(float value) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getFlySpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public float getWalkSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isConversing() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void acceptConversationInput(String input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean beginConversation(Conversation conversation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abandonConversation(Conversation conversation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendMessage(String[] messages) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isOnline() {
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
    public Map<String, Object> serialize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
