/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.quantum.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 
 * Defines an element as Work In Progress.
 * 
 * @author link
 */
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PACKAGE})
public @interface WIP {
    String description() default "Work In Progress";
    String[] unfinished() default {"Such work, much progress..."};
}
