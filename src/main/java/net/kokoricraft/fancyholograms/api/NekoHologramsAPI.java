package net.kokoricraft.fancyholograms.api;

import com.hypixel.hytale.math.vector.Vector3d;
import com.hypixel.hytale.server.core.universe.world.World;
import net.kokoricraft.fancyholograms.enums.BillboardType;
import net.kokoricraft.fancyholograms.objects.Hologram;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

/**
 * Main access point for the FancyHolograms API.
 * <p>
 * Requires the FancyHolograms core plugin to be installed at runtime.
 */
public class NekoHologramsAPI {

    private static NekoHologramsAPI instance;

    /**
     * Returns the API singleton instance.
     */
    public static NekoHologramsAPI getInstance() {
        if (instance == null) {
            instance = new NekoHologramsAPI();
        }
        return instance;
    }

    /**
     * Creates a standard text hologram.
     *
     * @param key       Unique hologram identifier
     * @param world     Target world
     * @param position  Spawn position
     * @param rotation  Y-axis rotation
     * @param lines     Text lines
     * @param billboard Billboard behavior
     * @param scale     Hologram scale
     * @return The created hologram, or null if creation failed
     */
    @Nullable
    public Hologram createTextHologram(String key, World world, Vector3d position, float rotation, List<String> lines, BillboardType billboard, float scale) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Creates a text hologram using text entities.
     *
     * @param key      Unique hologram identifier
     * @param world    Target world
     * @param position Spawn position
     * @param rotation Y-axis rotation
     * @param lines    Text lines
     * @param scale    Hologram scale
     * @return The created hologram, or null if creation failed
     */
    @Nullable
    public Hologram createTextEntityHologram(String key, World world, Vector3d position, float rotation, List<String> lines, float scale) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Creates an image-based hologram.
     *
     * @param key       Unique hologram identifier
     * @param world     Target world
     * @param position  Spawn position
     * @param rotation  Y-axis rotation
     * @param lines     Optional text lines
     * @param billboard Billboard behavior
     * @param scale     Hologram scale
     * @return The created hologram, or null if creation failed
     */
    @Nullable
    public Hologram createImageHologram(String key, World world, Vector3d position, float rotation, List<String> lines, BillboardType billboard, float scale) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Checks whether a hologram with the given key exists.
     *
     * @param key Hologram identifier
     * @return true if it exists
     */
    public boolean existsHologram(String key) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Returns a hologram by its key.
     *
     * @param key Hologram identifier
     * @return The hologram, or null if not found
     */
    @Nullable
    public Hologram getHologram(String key) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Returns all registered holograms.
     *
     * @return Map of hologram key to hologram instance
     */
    @Nonnull
    public Map<String, Hologram> getHolograms() {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    /**
     * Removes the given hologram.
     *
     * @param hologram Hologram to remove
     */
    public void removeHologram(Hologram hologram) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }
}