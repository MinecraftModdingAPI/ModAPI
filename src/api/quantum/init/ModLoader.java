/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.init;

import api.quantum.enums.Side;
import api.quantum.meta.SideOnly;
import api.quantum.meta.WIP;
import java.lang.instrument.Instrumentation;

/**
 *
 * @author link
 */
@WIP(description="Not working yet.", unfinished={"mod loading"})
@SideOnly(Side.CLIENT)
class ModLoader {
    
    public static void premain(String args, Instrumentation inst) {
        System.out.println("Quantum API loaded as Java Agent successfully initialized");
        //inst.addTransformer(new UniversalAgent(root, clazz));
    }

    static RuntimeInfo createRuntimeInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
