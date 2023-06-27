package de.igweb.igelevators.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface RegionProvider {

    /**
     * Checks if a player is trusted in a region
     *
     * @param player   the player to check
     * @param location the location of the region
     * @return whether the player is trusted in the region
     */
    boolean isTrusted(Player player, Location location);

}