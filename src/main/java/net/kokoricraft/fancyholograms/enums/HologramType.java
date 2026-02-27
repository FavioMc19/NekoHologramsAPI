package net.kokoricraft.fancyholograms.enums;

public enum HologramType {
    PARTICLE,
    ENTITY;

    public boolean isEntity() {
        return this == ENTITY;
    }
}