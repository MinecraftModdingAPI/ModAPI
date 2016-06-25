/*
 * The MIT License
 *
 * Copyright 2016 link.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * Created file on 3/21/16 at 1:31 PM.
 *
 * This file is part of Quantum API
 */
package ltp.quantum.bootstrap;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * @author link
 */
public enum Bootstrap {
	;

	public static void premain(String args, Instrumentation ins) throws ClassNotFoundException {
		// add mod jar files to ClassLoader search
		try {
			System.out.println("Loading mods...");
			ModLoader.load(ins, Paths.get("~/.minecraft/quantum/mods"));
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Modifying classes...");
		Map<String, ClassModifier> classMods = new HashMap<>();
		classMods.put("net.minecraft.client.main.Main", (className, modify) -> System.out.println("Successfully tested 'modifying' class: " + className));
		ins.addTransformer(new BootstrapAgent(classMods));
		System.out.println("Done");
	}

	public static void agentmain(String args, Instrumentation ins) throws ClassNotFoundException {
		premain(args, ins);
	}

	public static void run(String... args) {

	}


}
