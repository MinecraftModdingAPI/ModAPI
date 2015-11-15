/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.init;

import java.lang.instrument.Instrumentation;

/**
 *
 * @author link
 */
class ModLoader {

    public static void premain(String args, Instrumentation inst) {
        System.out.println("Testing javaagent 'modloader'");
        //inst.addTransformer(new UniversalAgent(root, clazz));
    }

    static RuntimeInfo createRuntimeInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
