/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import java.util.HashMap;
import net.minecraft.block.material.Material;

/**
 * Defines how a Block should work in the World. (Minecraft:
 * net.minecraft.block.material.Material).
 *
 * @author link
 */
public final class BlockType {

    private static final HashMap<Block, BlockType> blockTypes = new HashMap<>(64);

    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType GRASS = new BlockType(new MaterialWrapper(Material.grass));
    public static final BlockType DIRT = new BlockType(new MaterialWrapper(Material.ground));
    public static final BlockType WOOD = new BlockType(new MaterialWrapper(Material.wood));
    public static final BlockType STONE = new BlockType(new MaterialWrapper(Material.rock));
    public static final BlockType IRON = new BlockType(new MaterialWrapper(Material.iron));
    public static final BlockType ANVIL = new BlockType(new MaterialWrapper(Material.anvil));
    public static final BlockType WATER = new BlockType(new MaterialWrapper(Material.water));
    public static final BlockType LAVA = new BlockType(new MaterialWrapper(Material.lava));
    public static final BlockType LEAVES = new BlockType(new MaterialWrapper(Material.leaves));
    public static final BlockType PLANT = new BlockType(new MaterialWrapper(Material.plants));
    public static final BlockType VINE = new BlockType(new MaterialWrapper(Material.vine));
    public static final BlockType SPONGE = new BlockType(new MaterialWrapper(Material.sponge));
    public static final BlockType WOOL = new BlockType(new MaterialWrapper(Material.cloth));
    public static final BlockType FIRE = new BlockType(new MaterialWrapper(Material.fire));
    public static final BlockType SAND = new BlockType(new MaterialWrapper(Material.sand));
    public static final BlockType REDSTONE = new BlockType(new MaterialWrapper(Material.circuits));
    public static final BlockType CARPET = new BlockType(new MaterialWrapper(Material.carpet));
    public static final BlockType GLASS = new BlockType(new MaterialWrapper(Material.glass));
    public static final BlockType REDSTONE_LIGHT = new BlockType(new MaterialWrapper(Material.redstoneLight));
    public static final BlockType EXPLOSIVES = new BlockType(new MaterialWrapper(Material.tnt));
    public static final BlockType PRISMARINE = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType ICE = new BlockType(new MaterialWrapper(Material.ice));
    public static final BlockType PACKED_ICE = new BlockType(new MaterialWrapper(Material.packedIce));
    public static final BlockType SNOW = new BlockType(new MaterialWrapper(Material.snow));
    public static final BlockType SNOW_BLOCK = new BlockType(new MaterialWrapper(Material.craftedSnow));
    public static final BlockType CACTUS = new BlockType(new MaterialWrapper(Material.cactus));
    public static final BlockType CLAY = new BlockType(new MaterialWrapper(Material.clay));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));
    public static final BlockType AIR = new BlockType(new MaterialWrapper(Material.air));

    private final MaterialWrapper material;

    BlockType(Block block) {
        material = new MaterialWrapper(block.getBlockWrapper().getWrappedBlock().getMaterial());
    }

    private BlockType(MaterialWrapper material) {
        this.material = material;
    }

    private static class MaterialWrapper {

        private final Material material;

        MaterialWrapper(Material material) {
            this.material = material;
        }

        public boolean isOpaque() {
            return material.blocksLight();
        }

        public boolean isClippable() {
            return !material.blocksMovement();
        }

        public boolean isSolid() {
            return material.isSolid();
        }

        public boolean isLiquid() {
            return material.isLiquid();
        }

        public boolean isPhasable() {
            return isSolid() && isLiquid();
        }

        public boolean isToolOptional() {
            return material.isToolNotRequired();
        }

        public boolean isWritable() {
            return material.isReplaceable();
        }

        public boolean isFlammable() {
            return material.getCanBurn();
        }

    }

    public boolean isOpaque() {
        return material.isOpaque();
    }

    public boolean isClippable() {
        return !material.isClippable();
    }

    public boolean isSolid() {
        return material.isSolid();
    }

    public boolean isLiquid() {
        return material.isLiquid();
    }

    public boolean isPhasable() {
        return material.isPhasable();
    }

    public boolean isToolOptional() {
        return material.isToolOptional();
    }

    public boolean isWritable() {
        return material.isWritable();
    }

    public boolean isFlammable() {
        return material.isFlammable();
    }

    public static BlockType get(Block block) {
        return blockTypes.getOrDefault(block, AIR);
    }

}
