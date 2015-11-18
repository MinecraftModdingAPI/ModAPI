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
public final class BlockDataTag {

    /**
     * Custom BlockDataTag (for your own blocks)
     */
    public static final int CUSTOM = -1;
    /**
     * Air BlockDataTag
     */
    public static final int AIR = 0;
    /**
     * Grass BlockDataTag
     */
    public static final int GRASS = 1;
    /**
     * Dirt BlockDataTag
     */
    public static final int DIRT = 2;
    /**
     * Wood BlockDataTag
     */
    public static final int WOOD = 3;
    /**
     * Stone BlockDataTag
     */
    public static final int STONE = 4;
    /**
     * Iron BlockDataTag
     */
    public static final int IRON = 5;
    /**
     * Anvil BlockDataTag
     */
    public static final int ANVIL = 6;
    /**
     * Water BlockDataTag
     */
    public static final int WATER = 7;
    /**
     * Lava BlockDataTag
     */
    public static final int LAVA = 8;
    /**
     * Leaves BlockDataTag
     */
    public static final int LEAVES = 9;
    /**
     * Plant BlockDataTag
     */
    public static final int PLANT = 10;
    /**
     * Vine BlockDataTag
     */
    public static final int VINE = 11;
    /**
     * Sponge BlockDataTag
     */
    public static final int SPONGE = 12;
    /**
     * Cloth BlockDataTag
     */
    public static final int CLOTH = 13;
    /**
     * Fire BlockDataTag
     */
    public static final int FIRE = 14;
    /**
     * Sand BlockDataTag
     */
    public static final int SAND = 15;
    /**
     * Redstone BlockDataTag
     */
    public static final int REDSTONE = 16;
    /**
     * Carpet BlockDataTag
     */
    public static final int CARPET = 17;
    /**
     * Glass BlockDataTag
     */
    public static final int GLASS = 18;
    /**
     * Rendstone light BlockDataTag
     */
    public static final int REDSTONE_LIGHT = 19;
    /**
     * TNT BlockDataTag
     */
    public static final int TNT = 20;
    /**
     * Coral BlockDataTag
     */
    public static final int CORAL = 21;
    /**
     * Ice BlockDataTag
     */
    public static final int ICE = 22;
    /**
     * Packed Ice BlockDataTag
     */
    public static final int PACKED_ICE = 23;
    /**
     * Snow (with different levels) BlockDataTag
     */
    public static final int SNOW = 24;
    /**
     * Snow Block BlockDataTag
     */
    public static final int SNOW_BLOCK = 25;
    /**
     * Cactus BlockDataTag
     */
    public static final int CACTUS = 26;
    /**
     * Clay BlockDataTag
     */
    public static final int CLAY = 27;
    /**
     * Gourd (Pumpkin, Watermelon, etc.) BlockDataTag
     */
    public static final int GOURD = 28;
    /**
     * Dragon Egg BlockDataTag
     */
    public static final int DRAGON_EGG = 29;
    /**
     * Portal BlockDataTag
     */
    public static final int PORTAL = 30;
    /**
     * Cake BlockDataTag
     */
    public static final int CAKE = 31;
    /**
     * Web BlockDataTag
     */
    public static final int WEB = 32;
    /**
     * Piston BlockDataTag
     */
    public static final int PISTON = 33;
    /**
     * Barrier BlockDataTag
     */
    public static final int BARRIER = 34;

    private static final ArrayList<BlockDataTag> worldTypes = new ArrayList<>(34);

    public BlockDataTag(Block block, int worldType) {
    }

    private BlockDataTag(Material material) {

    }

    private static class MaterialWrapper {

        private final Material material;

        MaterialWrapper(Material material) {
            this.material = material;
        }
    }

    public static BlockDataTag get(Block block) {
        return null;
    }

}
