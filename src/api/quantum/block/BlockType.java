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
public final class BlockType {

    /**
     * Custom BlockType (for your own blocks)
     */
    public static final int CUSTOM = -1;
    /**
     * Air BlockType
     */
    public static final int AIR = 0;
    /**
     * Grass BlockType
     */
    public static final int GRASS = 1;
    /**
     * Dirt BlockType
     */
    public static final int DIRT = 2;
    /**
     * Wood BlockType
     */
    public static final int WOOD = 3;
    /**
     * Stone BlockType
     */
    public static final int STONE = 4;
    /**
     * Iron BlockType
     */
    public static final int IRON = 5;
    /**
     * Anvil BlockType
     */
    public static final int ANVIL = 6;
    /**
     * Water BlockType
     */
    public static final int WATER = 7;
    /**
     * Lava BlockType
     */
    public static final int LAVA = 8;
    /**
     * Leaves BlockType
     */
    public static final int LEAVES = 9;
    /**
     * Plant BlockType
     */
    public static final int PLANT = 10;
    /**
     * Vine BlockType
     */
    public static final int VINE = 11;
    /**
     * Sponge BlockType
     */
    public static final int SPONGE = 12;
    /**
     * Cloth BlockType
     */
    public static final int CLOTH = 13;
    /**
     * Fire BlockType
     */
    public static final int FIRE = 14;
    /**
     * Sand BlockType
     */
    public static final int SAND = 15;
    /**
     * Redstone BlockType
     */
    public static final int REDSTONE = 16;
    /**
     * Carpet BlockType
     */
    public static final int CARPET = 17;
    /**
     * Glass BlockType
     */
    public static final int GLASS = 18;
    /**
     * Rendstone light BlockType
     */
    public static final int REDSTONE_LIGHT = 19;
    /**
     * TNT BlockType
     */
    public static final int TNT = 20;
    /**
     * Coral BlockType
     */
    public static final int CORAL = 21;
    /**
     * Ice BlockType
     */
    public static final int ICE = 22;
    /**
     * Packed Ice BlockType
     */
    public static final int PACKED_ICE = 23;
    /**
     * Snow (with different levels) BlockType
     */
    public static final int SNOW = 24;
    /**
     * Snow Block BlockType
     */
    public static final int SNOW_BLOCK = 25;
    /**
     * Cactus BlockType
     */
    public static final int CACTUS = 26;
    /**
     * Clay BlockType
     */
    public static final int CLAY = 27;
    /**
     * Gourd (Pumpkin, Watermelon, etc.) BlockType
     */
    public static final int GOURD = 28;
    /**
     * Dragon Egg BlockType
     */
    public static final int DRAGON_EGG = 29;
    /**
     * Portal BlockType
     */
    public static final int PORTAL = 30;
    /**
     * Cake BlockType
     */
    public static final int CAKE = 31;
    /**
     * Web BlockType
     */
    public static final int WEB = 32;
    /**
     * Piston BlockType
     */
    public static final int PISTON = 33;
    /**
     * Barrier BlockType
     */
    public static final int BARRIER = 34;

    private static final ArrayList<BlockType> blockTypes = new ArrayList<>(34);

    public BlockType(Block block, int worldType) {
    }

    private BlockType(Material material) {

    }

    private static class MaterialWrapper {

        private final Material material;

        MaterialWrapper(Material material) {
            this.material = material;
        }
    }

    public static BlockType get(Block block) {
        return null;
    }

}
