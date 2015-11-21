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
