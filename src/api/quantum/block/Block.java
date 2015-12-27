/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import api.quantum.enums.Side;
import api.quantum.meta.SideOnly;
import api.quantum.meta.WIP;

/**
 *
 * @author link
 */
@WIP
@SideOnly(Side.UNIVERSAL)
public abstract class Block {

    private final BlockWrapper wrapper;

    protected Block(BlockInfo info) {
        wrapper = new BlockWrapper(info);
    }

    Block(net.minecraft.block.Block block) {
        wrapper = new BlockWrapper(block);
    }

    /**
     * Helper class used to initialize Blocks. The BlockInfo object is discarded
     * after initialization of the Block.
     */
    protected final class BlockInfo {

        private final String name;
        private final BlockType type;
        private final boolean silkTouch;
        private final BlockConstraints blockConstraints;
        private final BlockLighting blockLighting;
        private final ToolInfo toolInfo;

        BlockInfo(String name, BlockType type, boolean silkTouch, BlockConstraints constraints, BlockLighting lighting, ToolInfo toolInfo) {
            this.name = name;
            this.type = type;
            this.silkTouch = silkTouch;
            this.blockConstraints = constraints;
            this.blockLighting = lighting;
            this.toolInfo = toolInfo;
        }

        String getName() {
            return name;
        }

        BlockType getType() {
            return type;
        }

        boolean isSilkTouchEnabled() {
            return silkTouch;
        }

        BlockConstraints getConstraints() {
            return blockConstraints;
        }

        BlockLighting getLighting() {
            return blockLighting;
        }
        
        ToolInfo getToolInfo() {
            return toolInfo;
        }

        final class BlockConstraints {

            private final double minWidth, minHeight, minDepth,
                    maxWidth, maxHeight, maxDepth;

            BlockConstraints(double minWidth, double maxWidth, double minHeight, double maxHeight, double minDepth, double maxDepth) {
                this.minWidth = minWidth;
                this.minHeight = minHeight;
                this.minDepth = minDepth;
                this.maxWidth = maxWidth;
                this.maxHeight = maxHeight;
                this.maxDepth = maxDepth;
            }

            double getMinWidth() {
                return minWidth;
            }

            double getMinHeight() {
                return minHeight;
            }

            double getMinDepth() {
                return minDepth;
            }

            double getMaxWidth() {
                return maxWidth;
            }

            double getMaxHeight() {
                return maxHeight;
            }

            double getMaxDepth() {
                return maxDepth;
            }
        }

        final class BlockLighting {

            private final boolean opaque;
            private final int opacity, lightEmission;

            BlockLighting(boolean opaque, int opacity, int lightEmission) {
                this.opaque = opaque;
                this.opacity = opacity;
                this.lightEmission = lightEmission;
            }

            boolean isOpaque() {
                return opaque;
            }

            int getOpacity() {
                return opacity;
            }

            int getLightEmission() {
                return lightEmission;
            }
        }

        final class ToolInfo {

            private final int hardness, resistance, particleGravity;

            ToolInfo(int hardness, int resistance, int particleGravity) {
                this.hardness = hardness;
                this.resistance = resistance;
                this.particleGravity = particleGravity;
            }
            
            int getHardness() {
                return hardness;
            }
            
            int getResistance() {
                return resistance;
            }
            
            int getParticleGravity() {
                return particleGravity;
            }

        }
    }

    BlockWrapper getBlockWrapper() {
        return wrapper;
    }
}
