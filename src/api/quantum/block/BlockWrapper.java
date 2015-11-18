/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import net.minecraft.block.material.Material;

/**
 *
 * @author link
 */
class BlockWrapper {
    
    private final net.minecraft.block.Block wrappedBlock;
    
    BlockWrapper(){
        wrappedBlock = new BlockImpl();
    }

    private static class BlockImpl extends net.minecraft.block.Block {

        BlockImpl() {
            super(null);
        }
    }
    
}
