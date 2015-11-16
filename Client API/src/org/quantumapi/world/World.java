/**
 * 
 */
package org.quantumapi.world;

import java.util.Locale;

import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.BlockPos;

import org.quantumapi.block.Block;
import org.quantumapi.block.State;
import org.quantumapi.math.Vec3i;
import org.quantumapi.task.Task;
import org.quantumapi.task.TaskQueue;
import org.quantumapi.util.API;
import org.quantumapi.util.Settings;

/**
 * @author Link
 *
 */
public final class World {

	private static World current = null;
	protected String folderName;
	protected String name;
	protected WorldClient worldClient;

	{
		worldClient = Minecraft.getMinecraft().theWorld;
	}

	public World() {
		load(this);
	}

	public World(String folder) {
		this.folderName = folder.toLowerCase(Locale.ENGLISH).replace(" ", "_").replace("*", "_");
		this.name = folder;
		load(this);
	}

	public static World getCurrentWorld() {
		return current;
	}

	public String getName() {
		return name;
	}

	public String getFolderName() {
		return folderName;
	}

	/**
	 * Unloads the world by calling
	 * {@code API.getMinecraft().loadWorld((WorldClient)null)}.<br>
	 * <p>
	 * The loadWorld() method in Minecraft unloads the current world, then loads
	 * the given world. It would be inefficient to use this unload method in
	 * conjunction with another loadWorld() method, whether it is the load
	 * method in this class, in Minecraft, or a user-defined world loader.
	 * 
	 * This should only be called if absolutely necessary. Do not use this with
	 * {@code load(World world)} for the sake of all that is pure.
	 * </p>
	 * 
	 * @obfuscated true
	 */
	public static void unload() {
		API.getMinecraft().loadWorld((WorldClient) null, "Unloading world " + current.name);
	}

	protected static void load(World world) {
		load(world, "Loading world " + world.name);
		current = world;
	}

	protected static void load(World world, String message) {
		API.getMinecraft().loadWorld(world.worldClient, message);
		current = null;
	}

	public void setBlock(Vec3i coordinates, int blockID) {
		TaskQueue.add(new Task() {
			@Override
			public void run() {
				worldClient.setBlockState(new BlockPos(coordinates.getX(), coordinates.getY(), coordinates.getZ()), Block.getForID(blockID).format().getDefaultState());
			}
		});
	}

	/**
	 * Adds a block with an explicit state which it finds in the block's
	 * Properties . The property for the state is "state" and of the type
	 * {@link State}.
	 * 
	 * @param block
	 *            the block to add
	 * @param flag
	 *            a Flag stating the kind of update
	 */
	public void setBlock(Vec3i coordinates, Block block, int flag) {
		BlockState state = ((State) block.getProperties().getProperty("state").getValue()).format();
		assert state instanceof IBlockState : "[Error] World:[Property \"state\" undefined in " + block.getName();
		worldClient.setBlockState(new BlockPos(coordinates.getX(), coordinates.getY(), coordinates.getZ()), (IBlockState) state, flag);
	}

//	/**
//	 * Spawn an entity into this World.
//	 * 
//	 * @param x
//	 *            the x spawn point
//	 * @param y
//	 *            the y spawn point
//	 * @param z
//	 *            the z spawn point
//	 * @param entity
//	 *            the entity to spawn
//	 */
//	public void addEntity(double x, double y, double z, Entity entity) {
//		TaskQueue.add(new Task() {
//			@Override
//			public void run() {
//				worldClient.spawnEntityInWorld(entity.format());
//			}
//		});
//	}

	public void removeBlock(double x, double y, double z, boolean drop) {
		TaskQueue.add(new Task() {
			@Override
			public void run() {
				worldClient.destroyBlock(new BlockPos(x, y, z), drop);

			}
		});
	}

	/**
	 * <p>
	 * Updates the state of the current world. Use of this method should be used
	 * with caution. This method is usually called by the game loop. Should any
	 * mod need to explicitly update the World, they should put it in a
	 * synchronized block with the lock as {@code API.getMinecraft()}:
	 * <pre>
	 * <code>
	 * 	synchronized(API.getMinecraft()) {
	 * 		World.getCurrentWorld().tick();
	 * 	}
	 * </code>  
	 * </pre>   
	 * </p>
	 * 
	 * @obfuscated true
	 */
	public void tick() {
		worldClient.tick();
	}

	/**
	 * Gets the current render distance.
	 * 
	 * @return the current render distance
	 */
	public static float getRenderDistance() {
		return Settings.getRenderDistance();
	}

	/**
	 * Formats this World object to a Minecraft World object.
	 * 
	 * @return the formatted World Object as a net.minecraft.world.World object
	 */
	public net.minecraft.world.World format() {
		return worldClient;
	}
}