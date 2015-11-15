/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.init;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.stream.Stream;
import javassist.ClassPool;
import javassist.bytecode.ClassFile;
import javax.tools.ToolProvider;

/**
 *
 * @author link
 */
class UniversalAgent implements java.lang.instrument.ClassFileTransformer {

    private final ClassFile editClass;

    public UniversalAgent(File root, File classSrc) throws FileNotFoundException {
        ClassFile temp = null;
        ToolProvider.getSystemJavaCompiler().run(null, null, null, "-g", classSrc.getAbsolutePath());
//        try {
//            //temp = new ClassFile((DataInputStream) CompilerUtils.toCompiledBytes(root.getAbsolutePath(), classSrc.getAbsolutePath()));
//        } catch (IOException ex) {
//            temp = null;
//            System.err.println("Failed to create ClassFile from '" + classSrc.getAbsolutePath() + "'. Check for typos or that the file exists.");
//        }
        editClass = temp;
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        try {
            ClassPool cp = ClassPool.getDefault();
            System.out.println("Modifying class '" + className + "'.");
            ClassFile classFile = new ClassFile((DataInputStream) Stream.of(classfileBuffer).parallel());
        } catch (IOException ex) {
            System.err.println("An Unexpected IOException occured: " + ex.getLocalizedMessage());
        }

        return null;

    }

}
