/**
 * 
 */
package org.quantumapi.task;

import org.quantumapi.util.API;

import net.minecraft.client.Minecraft;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * @author Link
 *
 */
public final class TaskQueue {

	private TaskQueue() {
	}
	
	public static void add(Task task) {
		synchronized(Minecraft.getMinecraft()) {
			Minecraft.getMinecraft().addScheduledTask(task);
		}
	}
	
	public static ListenableFuture<?> add(ObjectTask<?> task) {
		synchronized (API.getMinecraft()) {
			return API.getMinecraft().addScheduledTask(task);
		}
	}

}
