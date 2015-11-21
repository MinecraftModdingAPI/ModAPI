/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

/**
 *
 * @author link
 */
class BlockWrapper {

    private final BlockImpl wrappedBlock;

    BlockWrapper(net.minecraft.block.Block block) {
        wrappedBlock = new BlockImpl(block);
    }

    net.minecraft.block.Block getWrappedBlock() {
        return wrappedBlock.wrappedBlock;
    }

    private static class BlockImpl {

        final net.minecraft.block.Block wrappedBlock;

        BlockImpl(net.minecraft.block.Block block) {
            wrappedBlock = block;
        }
    }

}
