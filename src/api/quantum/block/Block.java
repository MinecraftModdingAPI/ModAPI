/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.block;

import api.quantum.meta.WIP;

/**
 *
 * @author link
 */
@WIP
public abstract class Block {

    private final BlockWrapper wrapper;

    protected Block() {
        wrapper = null;
    }
}
