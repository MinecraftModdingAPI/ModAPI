/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import api.quantum.block.Block.BlockInfo;
import api.quantum.block.Block.BlockInfo.BlockConstraints;
import api.quantum.block.Block.BlockInfo.BlockLighting;
import api.quantum.block.Block.BlockInfo.ToolInfo;
import api.quantum.meta.WIP;

/**
 *
 * @author link
 */
@WIP
class BlockWrapper {

    private final BlockImpl wrappedBlock;

    BlockWrapper(net.minecraft.block.Block block) {
        wrappedBlock = new BlockImpl(block);
    }

    BlockWrapper(BlockInfo info) {
        wrappedBlock = new BlockImpl(info);
    }

    net.minecraft.block.Block getWrappedBlock() {
        return wrappedBlock.getWrappedBlock();
    }

    private static class BlockImpl {

        final net.minecraft.block.Block wrappedBlock;

        BlockImpl(net.minecraft.block.Block block) {
            wrappedBlock = block;
        }

        BlockImpl(BlockInfo info) {
            wrappedBlock = createBlock(info);
        }

        net.minecraft.block.Block getWrappedBlock() {
            return wrappedBlock;
        }

        private net.minecraft.block.Block createBlock(BlockInfo info) {

            class MinecraftBlockExposer extends net.minecraft.block.Block {

                MinecraftBlockExposer(BlockInfo info) {
                    super(info.getType().getMaterialWrapper().getWrappedMaterial());
                    
                    BlockConstraints constraints = info.getConstraints();
                    BlockLighting lighting = info.getLighting();
                    ToolInfo toolInfo = info.getToolInfo();
                    
                    this.translucent = !lighting.isOpaque();
                    this.lightOpacity = lighting.getOpacity();
                    this.lightValue = lighting.getLightEmission();
                    this.blockHardness = toolInfo.getHardness();
                    this.blockResistance = toolInfo.getResistance();
                    this.blockParticleGravity = toolInfo.getParticleGravity();
                    this.minX = constraints.getMinWidth();
                    this.minY = constraints.getMinHeight();
                    this.minZ = constraints.getMinDepth();
                    this.maxX = constraints.getMaxWidth();
                    this.maxY = constraints.getMaxHeight();
                    this.maxZ = constraints.getMaxDepth();

                }
            }
            return new MinecraftBlockExposer(info);
        }

    }

}
