/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import java.util.ArrayList;
import net.minecraft.block.material.Material;

/**
 * Defines how a Block should work in the World. (Minecraft:
 * net.minecraft.block.material.Material).
 *
 * @author link
 */
public final class WorldType {

    /**
     * Custom WorldType (for your own blocks)
     */
    public static final int CUSTOM = -1;
    /**
     * Air WorldType
     */
    public static final int AIR = 0;
    /**
     * Grass WorldType
     */
    public static final int GRASS = 1;
    /**
     * Dirt WorldType
     */
    public static final int DIRT = 2;
    /**
     * Wood WorldType
     */
    public static final int WOOD = 3;
    /**
     * Stone WorldType
     */
    public static final int STONE = 4;
    /**
     * Iron WorldType
     */
    public static final int IRON = 5;
    /**
     * Anvil WorldType
     */
    public static final int ANVIL = 6;
    /**
     * Water WorldType
     */
    public static final int WATER = 7;
    /**
     * Lava WorldType
     */
    public static final int LAVA = 8;
    /**
     * Leaves WorldType
     */
    public static final int LEAVES = 9;
    /**
     * Plant WorldType
     */
    public static final int PLANT = 10;
    /**
     * Vine WorldType
     */
    public static final int VINE = 11;
    /**
     * Sponge WorldType
     */
    public static final int SPONGE = 12;
    /**
     * Cloth WorldType
     */
    public static final int CLOTH = 13;
    /**
     * Fire WorldType
     */
    public static final int FIRE = 14;
    /**
     * Sand WorldType
     */
    public static final int SAND = 15;
    /**
     * Redstone WorldType
     */
    public static final int REDSTONE = 16;
    /**
     * Carpet WorldType
     */
    public static final int CARPET = 17;
    /**
     * Glass WorldType
     */
    public static final int GLASS = 18;
    /**
     * Rendstone light WorldType
     */
    public static final int REDSTONE_LIGHT = 19;
    /**
     * TNT WorldType
     */
    public static final int TNT = 20;
    /**
     * Coral WorldType
     */
    public static final int CORAL = 21;
    /**
     * Ice WorldType
     */
    public static final int ICE = 22;
    /**
     * Packed Ice WorldType
     */
    public static final int PACKED_ICE = 23;
    /**
     * Snow (with different levels) WorldType
     */
    public static final int SNOW = 24;
    /**
     * Snow Block WorldType
     */
    public static final int SNOW_BLOCK = 25;
    /**
     * Cactus WorldType
     */
    public static final int CACTUS = 26;
    /**
     * Clay WorldType
     */
    public static final int CLAY = 27;
    /**
     * Gourd (Pumpkin, Watermelon, etc.) WorldType
     */
    public static final int GOURD = 28;
    /**
     * Dragon Egg WorldType
     */
    public static final int DRAGON_EGG = 29;
    /**
     * Portal WorldType
     */
    public static final int PORTAL = 30;
    /**
     * Cake WorldType
     */
    public static final int CAKE = 31;
    /**
     * Web WorldType
     */
    public static final int WEB = 32;
    /**
     * Piston WorldType
     */
    public static final int PISTON = 33;
    /**
     * Barrier WorldType
     */
    public static final int BARRIER = 34;

    private static final ArrayList<WorldType> worldTypes = new ArrayList<>(34);

    public WorldType(Block block, int worldType) {
    }

    private WorldType(Material material) {

    }

    private static class MaterialWrapper {

        private final Material material;

        MaterialWrapper(Material material) {
            this.material = material;
        }
    }

    public static WorldType get(Block block) {
        return null;
    }

}
