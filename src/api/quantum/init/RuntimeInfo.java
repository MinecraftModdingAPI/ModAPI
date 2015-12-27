/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.init;

import api.quantum.enums.Side;
import api.quantum.meta.SideOnly;
import api.quantum.meta.Universal;
import api.quantum.meta.WIP;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author link
 */
@WIP(description="A lot of missing runtime information", unfinished={"RuntimeInfo.info"})
@SideOnly(Side.PROXY)
@Universal
public class RuntimeInfo {

    private static final RuntimeInfo info = ModLoader.createRuntimeInfo();

    @WIP
    RuntimeInfo(String apiVersion, String minecraftVersion, Runnable[] mainHooks, HashMap<String, LinkedList<Runnable>> methodHooks) {
        synchronized (info) {
            this.apiVersion = apiVersion;
            this.mcVersion = minecraftVersion;
            this.mainHooks = mainHooks;
            this.methodHooks = methodHooks;
        }
    }

    private final String apiVersion, mcVersion;
    private final Runnable[] mainHooks;
    private final HashMap<String, LinkedList<Runnable>> methodHooks;

    public static String getAPIVersion() {
        return info.apiVersion;
    }

    public static String getMinecraftVersion() {
        return info.mcVersion;
    }

    public static Runnable[] getMainMethodHooks() {
        return info.mainHooks;
    }

    public static HashMap<String, LinkedList<Runnable>> getMethodHooks() {
        return info.methodHooks;
    }

}
