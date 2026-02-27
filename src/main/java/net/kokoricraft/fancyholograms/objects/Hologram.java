package net.kokoricraft.fancyholograms.objects;

import com.google.gson.JsonObject;
import com.hypixel.hytale.math.vector.Vector3d;
import com.hypixel.hytale.math.vector.Vector3f;
import com.hypixel.hytale.server.core.universe.Universe;
import com.hypixel.hytale.server.core.universe.world.World;
import lombok.Getter;
import lombok.Setter;
import net.kokoricraft.fancyholograms.enums.BillboardType;
import net.kokoricraft.fancyholograms.enums.HologramType;

import java.awt.image.BufferedImage;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Setter
public class Hologram {

    private final List<String> lines = new ArrayList<>();
    private final String key;

    private Vector3d position;
    private float yaw;
    private float scale = 1;
    private String worldName;
    private Vector3f rotation;
    private double renderDistance = 80;

    private boolean remove = false;
    private BillboardType billboardType = BillboardType.FIXED;

    private BufferedImage image;
    private int width;
    private int height;
    private String url;

    private HologramType hologramType = HologramType.PARTICLE;
    private final Set<UUID> entities = ConcurrentHashMap.newKeySet();
    private final Map<UUID, Map<Integer, Map<Integer, UUID>>> viewersEntities = new ConcurrentHashMap<>();
    private final Map<UUID, UUID> viewersUUIDs = new ConcurrentHashMap<>();
    private int frames = 1;
    private int duration = -1;

    private final Set<UUID> viewers = new HashSet<>();

    public Hologram(String key) {
        this.key = key;
    }

    public void addLine(String line) {
        if (line == null) return;
        lines.add(line);
    }

    public boolean removeLine(int index) {
        if (index < 0 || index >= lines.size()) return false;
        lines.remove(index);
        return true;
    }

    public boolean removeLine(String line) {
        if (line == null) return false;
        return lines.remove(line);
    }

    public void clearLines() {
        lines.clear();
    }

    public boolean setLine(int index, String line) {
        if (line == null || index < 0) return false;
        if (index < lines.size()) {
            lines.set(index, line);
            return true;
        }
        if (index == lines.size()) {
            lines.add(line);
            return true;
        }
        return false;
    }

    public World getWorld() {
        if (worldName == null) return null;
        return Universe.get().getWorld(worldName);
    }

    public int getDuration() {
        if (duration == -1 && frames <= 1) return 20;
        if (duration == -1) return frames * 5;
        return duration;
    }

    public void save() {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    public void generateHologramAssets() {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    public void saveAndGenerateHologramAssets() {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    public JsonObject toJson() {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }

    public static Hologram fromJson(JsonObject json) {
        throw new UnsupportedOperationException("FancyHolograms API method");
    }
}