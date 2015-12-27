/*
 * The MIT License
 *
 * Copyright 2015 link.
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
 */
package api.quantum.block;

import api.quantum.error.BlockInitException;
import api.quantum.log.Logger;
import api.quantum.meta.Untested;
import api.quantum.meta.WIP;

import java.util.*;

/**
 * <p>
 * A skeletal class for Block through which all Quantum API-based mods and
 * objects are
 * expected to implement if they are a block. The Block interface is meant
 * to be used by the API for interacting with Blocks.
 * </p>
 *
 * @author link
 */
@WIP(description = "This class is \"finished\" but the implementations are not.",
     unfinished = {"Method implementations", "Interfaces for commented methods"})
public abstract class AbstractBlock implements Block {

	protected final BlockType blockType;
	private final BlockWrapper wrapper;

	protected AbstractBlock(BlockInfo info) {
		wrapper = new BlockWrapper(info);
		blockType = info.getType();
	}

	AbstractBlock(net.minecraft.block.Block block) {
		wrapper = new BlockWrapper(block);
		blockType = BlockType.get(this);
	}

	@WIP(description = "implementing hasVariants",
	     unfinished = "Method implementations")
	static AbstractBlock wrap(net.minecraft.block.Block block) {
		return new AbstractBlock(block) {
			@Override
			public boolean hasVariants() {
				List<?> list = new ArrayList<>();
				block.getSubBlocks(block.getItem(null, null), null, list);
				return list.get(0) != null;
			}

			@Override
			public List<AbstractBlock> getVariants() {
				List<AbstractBlock> list = new ArrayList<>(1);
				return null;
			}


		};
	}

	private static List<AbstractBlock> getVariants(net.minecraft.block.Block block) {
		List<AbstractBlock> list = Collections.emptyList();

		if (block instanceof net.minecraft.block.BlockDirt) {
			list = new ArrayList<>(3);
			list.add(getBlock("minecraft:dirt"));
			list.add(getBlock("minecraft:dirt:1"));
			list.add(getBlock("minecraft:dirt:2"));
		} else if (block instanceof net.minecraft.block.BlockPlanks) {
			list = new ArrayList<>(6);
			list.add(getBlock("minecraft:planks"));
			list.add(getBlock("minecraft:planks:1"));
			list.add(getBlock("minecraft:planks:2"));
			list.add(getBlock("minecraft:planks:3"));
			list.add(getBlock("minecraft:planks:4"));
			list.add(getBlock("minecraft:planks:5"));
		} else if (block instanceof net.minecraft.block.BlockSapling) {
			list = new ArrayList<>(6);
			list.add(getBlock("minecraft:sapling"));
			list.add(getBlock("minecraft:sapling:1"));
			list.add(getBlock("minecraft:sapling:2"));
			list.add(getBlock("minecraft:sapling:3"));
			list.add(getBlock("minecraft:sapling:4"));
			list.add(getBlock("minecraft:sapling:5"));
		} else if (block instanceof net.minecraft.block.BlockSand) {
			list = new ArrayList<>(2);
			list.add(getBlock("minecraft:sand"));
			list.add(getBlock("minecraft:sand:1"));
		} else if (block instanceof net.minecraft.block.BlockLog) {
			list = new ArrayList<>(6);
			list.add(getBlock("minecraft:log"));
			list.add(getBlock("minecraft:log:1"));
			list.add(getBlock("minecraft:log:2"));
			list.add(getBlock("minecraft:log:3"));
			list.add(getBlock("minecraft:log:4"));
			list.add(getBlock("minecraft:log:5"));
		} else if (block instanceof net.minecraft.block.BlockLeaves) {
			list = new ArrayList<>(4);
			list.add(getBlock("minecraft:leaves"));
			list.add(getBlock("minecraft:leaves:1"));
			list.add(getBlock("minecraft:leaves:2"));
			list.add(getBlock("minecraft:leaves:3"));
		} else if (block instanceof net.minecraft.block.BlockSponge) {
			list = new ArrayList<>(2);
			list.add(getBlock("minecraft:sponge"));
			list.add(getBlock("minecraft:sponge:1"));
		} else if (block instanceof net.minecraft.block.BlockSandStone) {
			list = new ArrayList<>(3);
			list.add(getBlock("minecraft:sandstone"));
			list.add(getBlock("minecraft:sandstone:1"));
			list.add(getBlock("minecraft:sandstone:2"));
		} else if (block instanceof net.minecraft.block.BlockTallGrass) {
			list = new ArrayList<>(3);
			list.add(getBlock("minecraft:tallgrass"));
			list.add(getBlock("minecraft:tallgrass:1"));
			list.add(getBlock("minecraft:tallgrass:2"));
		} else if (block instanceof net.minecraft.block.BlockColored) {
			list = new ArrayList<>(16);
			list.add(getBlock("minecraft:wool"));
			list.add(getBlock("minecraft:wool:1"));
			list.add(getBlock("minecraft:wool:2"));
			list.add(getBlock("minecraft:wool:3"));
			list.add(getBlock("minecraft:wool:4"));
			list.add(getBlock("minecraft:wool:5"));
			list.add(getBlock("minecraft:wool:6"));
			list.add(getBlock("minecraft:wool:7"));
			list.add(getBlock("minecraft:wool:8"));
			list.add(getBlock("minecraft:wool:9"));
			list.add(getBlock("minecraft:wool:10"));
			list.add(getBlock("minecraft:wool:11"));
			list.add(getBlock("minecraft:wool:12"));
			list.add(getBlock("minecraft:wool:13"));
			list.add(getBlock("minecraft:wool:14"));
			list.add(getBlock("minecraft:wool:15"));
		} else if (block instanceof net.minecraft.block.BlockFlower) {
			list = new ArrayList<>(9);
			list.add(getBlock("minecraft:red_flower"));
			list.add(getBlock("minecraft:red_flower:1"));
			list.add(getBlock("minecraft:red_flower:2"));
			list.add(getBlock("minecraft:red_flower:3"));
			list.add(getBlock("minecraft:red_flower:4"));
			list.add(getBlock("minecraft:red_flower:5"));
			list.add(getBlock("minecraft:red_flower:6"));
			list.add(getBlock("minecraft:red_flower:7"));
			list.add(getBlock("minecraft:red_flower:8"));
		} else if (block instanceof net.minecraft.block.BlockStoneSlab) {
			list = new ArrayList<>(8);
			list.add(getBlock("minecraft:stone_slab"));
			list.add(getBlock("minecraft:stone_slab:1"));
			list.add(getBlock("minecraft:stone_slab:2"));
			list.add(getBlock("minecraft:stone_slab:3"));
			list.add(getBlock("minecraft:stone_slab:4"));
			list.add(getBlock("minecraft:stone_slab:5"));
			list.add(getBlock("minecraft:stone_slab:6"));
			list.add(getBlock("minecraft:stone_slab:7"));
		} else if (block instanceof net.minecraft.block.BlockDoubleStoneSlab) {
			list = new ArrayList<>(10);
			list.add(getBlock("minecraft:double_stone_slab"));
			list.add(getBlock("minecraft:double_stone_slab:1"));
			list.add(getBlock("minecraft:double_stone_slab:2"));
			list.add(getBlock("minecraft:double_stone_slab:3"));
			list.add(getBlock("minecraft:double_stone_slab:4"));
			list.add(getBlock("minecraft:double_stone_slab:5"));
			list.add(getBlock("minecraft:double_stone_slab:6"));
			list.add(getBlock("minecraft:double_stone_slab:7"));
			list.add(getBlock("minecraft:double_stone_slab:8"));
			list.add(getBlock("minecraft:double_stone_slab:9"));
		} else if (block instanceof net.minecraft.block.BlockStainedGlass) {
			list = new ArrayList<>(16);
			list.add(getBlock("minecraft:stained_glass"));
			list.add(getBlock("minecraft:stained_glass:1"));
			list.add(getBlock("minecraft:stained_glass:2"));
			list.add(getBlock("minecraft:stained_glass:3"));
			list.add(getBlock("minecraft:stained_glass:4"));
			list.add(getBlock("minecraft:stained_glass:5"));
			list.add(getBlock("minecraft:stained_glass:6"));
			list.add(getBlock("minecraft:stained_glass:7"));
			list.add(getBlock("minecraft:stained_glass:8"));
			list.add(getBlock("minecraft:stained_glass:9"));
			list.add(getBlock("minecraft:stained_glass:10"));
			list.add(getBlock("minecraft:stained_glass:11"));
			list.add(getBlock("minecraft:stained_glass:12"));
			list.add(getBlock("minecraft:stained_glass:13"));
			list.add(getBlock("minecraft:stained_glass:14"));
			list.add(getBlock("minecraft:stained_glass:15"));
		}
		//TODO
		return list != null ? list : null;
	}

	public static int getID(AbstractBlock block) {
		return net.minecraft.block.Block.getIdFromBlock(block.getBlockWrapper().getWrappedBlock());
	}

	/**
	 * @param id
	 * 		the id of the block
	 * @return the block with the corresponding id
	 * @deprecated getting a block by ID is deprecated as of minecraft 1.6 .
	 * Exists for backwards compatibility of old mods.
	 */
	@WIP(description = "I need to make an array of Blocks for the API.")
	@Deprecated
	public static AbstractBlock getBlock(int id) {
		return wrap(net.minecraft.block.Block.getBlockById(id));
	}

	public static AbstractBlock getBlock(String qualifiedName) {
		return wrap(net.minecraft.block.Block.getBlockFromName(qualifiedName));
	}

	//public static AbstractBlock getBlock(Item item)
	BlockWrapper getBlockWrapper() {
		return wrapper;
	}

	@Override
	public final boolean isFullBlock() {
		return wrapper.isFullBlock();
	}

	@Override
	public final int getOpacity() {
		return wrapper.getOpacity();
	}

	@Override
	public final int getLightEmission() {
		return wrapper.getLightEmission();
	}

	@Override
	public final boolean isTranslucent() {
		return wrapper.isTranslucent();
	}

	@Override
	public final boolean useNeighborBrightness() {
		return wrapper.useNeighborBrightness();
	}

	@Override
	public final BlockType getBlockType() {
		return blockType;
	}

	@Override
	public final BlockType.BlockColor getBlockColor() {
		return BlockType.BlockColor.identify(blockType.getMaterialWrapper().getWrappedMaterial().getMaterialMapColor());
	}

	//public final BlockState convertToState(int metadata)
	//public final int contertToMetadata(BlockState blockState)
	//public final BlockState getCurrentState(int x, int y, int z)
	@Override
	public final boolean isFullSolid() {
		return wrapper.isFullSolid();
	}

	@Override
	public final boolean isDefault() {
		return wrapper.isDefault();
	}

	@Override
	public final boolean isOpaque() {
		return wrapper.isOpaque();
	}

	@WIP
	@Override
	public final boolean isClippable() {
		return wrapper.isClippable();
	}

	@Override
	public final int getRenderMethod() {
		return wrapper.getRenderMethod();
	}

	@WIP
	@Override
	public final boolean isOverwritable() {
		return wrapper.isOverwritable();
	}

	//public final boolean isOverwritable(WorldLocation location, (AbstractBlock).Side side, ItemHeap item)
	//public final boolean isOverwritable(WorldLocation location, (AbstractBlock).Side side)
	//@Override
	//public void RedstoneListener#sendPower(WorldLocation location, BlockState blockState, Player player, Side side, Vector3D hitLocation)
	//@Override
	//public int BlockListener#getPowerLevel(WorldLocation location, BlockState blockState, Side side)
	//@Override
	//public int BlockListener#getWeakPowerLevel(WorldLocation location, BlockState blockState, Side side)
	//@Override
	//public boolean BlockListener#isPowerSource()
	//@Override
	//public void BlockListener#harvest(Player player, WorldLocation location, BlockState blockState, BlockEntity blockEntity)

	@WIP
	@Override
	public final double getHardness() {
		return wrapper.getHardness();
	}

	@Override
	public final boolean usesRandomTick() {
		return wrapper.usesRandomTick();
	}

	/**
	 * Defines whether this AbstractBlock uses a BlockEntity (used for extra
	 * info for a
	 * AbstractBlock in the World).
	 * <p>
	 * Blocks use BlockEntities to store extra information when they are
	 * rendered in the world. One example is signs; they use a BlockEntity to
	 * store the text on the sign.
	 *
	 * @return true if this AbstractBlock uses a BlockEntity
	 */
	@Override
	public final boolean usesBlockEntity() {
		return wrapper.usesBlockEntity();
	}

	@WIP
	@Override
	public final int getBrightness(int x, int y, int z) {
		return wrapper.getBrightness(x, y, z);
	}

	//public final boolean canRenderSide(Direction direction)
	//public AABB getAABB(WorldLocation location)
	//public AABB getCollisionAABB(WorldLocation location)
	//public void updateRandom(BlockState blockState, Random random, WorldLocation location)
	//public abstract void update(BlockState blockState, Random random, WorldLocation location)
	@WIP
	@Override
	public final int getRemainingTicks() {
		return wrapper.getRemainingTicks();
	}

	//@Override
	//public void blockAdded(BlockState blockState, WorldLocation location)
	//@Override
	//public void onBlockBreak(BlockState blockState, WorldLocation location)
	@Untested
	@Override
	public final int getDropCount(Random random) {
		return wrapper.getDropCount(random);
	}

	//@Untested
	//public Item getDrop(BlockState blockState, Random random, int fortune)
	//public final float getRelativeHardness(Player player, WorldLocation location)
	//public final void dropAsItem(BlockState blockState, int fortune, WorldLocation location)
	//public final void dropAsItem(BlockState blockState, int fortune, float chance, WorldLocation locatsion)
	//public final Metadata getDropItemMetadata(BlockState blockState) //damageDropped()
	//public final float getExplosiveResistance(Entity entity)
	//public final boolean isWithinConstraints(Vector3D vector)
	//public final RenderGroup getRenderGroup()
	//public final int getRenderMode()
	@Override
	public final double getMinWidth() {
		return wrapper.getMinWidth();
	}

	@Override
	public final double getMinHeight() {
		return wrapper.getMinHeight();
	}

	@Override
	public final double getMinDepth() {
		return wrapper.getMinDepth();
	}

	@Override
	public final double getMaxWidth() {
		return wrapper.getWrappedBlock().getBlockBoundsMaxX();
	}

	@Override
	public final double getMaxHeight() {
		return wrapper.getMaxHeight();
	}

	@Override
	public final double getMaxDepth() {
		return wrapper.getMaxDepth();
	}

	//public final ItemHeap createItemHeap(BlockState blockState)
	//public int getDropQuantity(int fortune, Random random)
	@Override
	public final String getName() {
		return wrapper.getName();
	}

	@Override
	public final String getFullName() {
		return wrapper.getFullName();
	}

	@Override
	public final boolean areStatsEnabled() {
		return wrapper.areStatsEnabled();
	}

	@Override
	public final int getPistonMobility() {
		return wrapper.getPistonMobility();
	}

	@Override
	public final float getAmbientOcclusion() {
		return wrapper.getAmbientOcclusion();
	}

	/**
	 * Returns whether this block is a flower pot or not.
	 *
	 * @return true if this block is a flower pot
	 * @deprecated use {@code myBlock instanceof FlowerPot}
	 */
	@Override
	@Deprecated
	public final boolean isFlowerPot() {
		return wrapper.isFlowerPot();
	}

	@Override
	public final boolean canUpdate() {
		return wrapper.canUpdate();
	}

	//public final Item getDropItem()
	//public final int getDamage(Location location)
	//public final ArrayList<AbstractBlock> getVariants()
	//public final ItemTab getItemTab()

	@Override
	public abstract boolean hasVariants();

	//isAssociatedBlock(AbstractBlock other)
	@Override
	public final boolean isVariant(Block block) {
		//final List<AbstractBlock> list = getVariants();
		boolean result = this.getClass() == block.getClass();
		//if (hasVariants())
		//  list.forEach((variant) -> {
		//      if(variant.getClass() == block.getClass()) {
		//          result = true;
		//      } else if (variant == list.get(list.getSize() - 1) && variant.getClass() != block.getClass()) {
		//          result = false;
		//      }
		//  });
		return result;
	}

	/**
	 * Helper class used to initialize Blocks. The BlockInfo object is
	 * discarded
	 * after initialization of the AbstractBlock
	 */
	protected static final class BlockInfo {

		private final String name;
		private final BlockType type;
		private final BlockConstraints blockConstraints;
		private final BlockLighting blockLighting;
		private final ToolInfo toolInfo;

		private BlockInfo(String name, BlockType type,
		                  BlockConstraints constraints,
		                  BlockLighting lighting, ToolInfo toolInfo) throws BlockInitException {
			try {
				this.name = Objects.requireNonNull(name,
						"BlockInfo.<init>[param=\"name\", message=\"" +
								"An AbstractBlock's name cannot be null!\"]");
				this.type = Objects.requireNonNull(type,
						"BlockInfo.<init>[param=\"type\", message=\"BlockType" +
								" cannot be null!\"]");
				this.blockConstraints = Objects.requireNonNull(constraints,
						"BlockInfo.<init>[param=\"constraints\", " +
								"message=\"BlockConstraints cannot be null!\"]");
				this.blockLighting = Objects.requireNonNull(lighting,
						"BlockInfo.<init>[param=\"lighting\", " +
								"message=\"BlockLighting cannot be null!\"]");
				this.toolInfo = Objects.requireNonNull(toolInfo,
						"BlockInfo.<init>[param=\"toolInfo\", " +
								"message=\"ToolInfo cannot be null!\"]");
			} catch (NullPointerException npe) {
				// print npe
				BlockInitException bie = new BlockInitException(this,
						                                               "Failed to create block: Could not create BlockInfo due to one or more null parameters.");
				bie.addSuppressed(npe);
				Logger.getLogger().log(this, bie, Logger.Severity.Level.SEVERE, "An AbstractBlock failed to initialize");
				throw bie;
			}
		}

		static BlockInfo create(String name, BlockType type, BlockConstraints constraints, BlockLighting lighting, ToolInfo toolInfo) throws BlockInitException {
			return new BlockInfo(name, type, constraints, lighting, toolInfo);
		}

		String getName() {
			return name;
		}

		BlockType getType() {
			return type;
		}

		BlockConstraints getConstraints() {
			return blockConstraints;
		}

		BlockLighting getLighting() {
			return blockLighting;
		}

		ToolInfo getToolInfo() {
			return toolInfo;
		}

		final class BlockConstraints {

			private final float minWidth, minHeight, minDepth,
					maxWidth, maxHeight, maxDepth;

			BlockConstraints(float minWidth, float maxWidth, float minHeight, float maxHeight, float minDepth,
			                 float maxDepth) {
				this.minWidth = minWidth;
				this.minHeight = minHeight;
				this.minDepth = minDepth;
				this.maxWidth = maxWidth;
				this.maxHeight = maxHeight;
				this.maxDepth = maxDepth;
			}

			float getMinWidth() {
				return minWidth;
			}

			float getMinHeight() {
				return minHeight;
			}

			float getMinDepth() {
				return minDepth;
			}

			float getMaxWidth() {
				return maxWidth;
			}

			float getMaxHeight() {
				return maxHeight;
			}

			float getMaxDepth() {
				return maxDepth;
			}
		}

		final class BlockLighting {

			private final boolean opaque;
			private final int opacity, lightEmission;

			BlockLighting(boolean opaque, int opacity, int lightEmission) {
				this.opaque = opaque;
				this.opacity = opacity;
				this.lightEmission = lightEmission;
			}

			boolean isOpaque() {
				return opaque;
			}

			int getOpacity() {
				return opacity;
			}

			int getLightEmission() {
				return lightEmission;
			}
		}

		final class ToolInfo {

			private final int hardness, resistance, particleGravity;
			private final boolean silkTouch;

			ToolInfo(int hardness, int resistance, int particleGravity, boolean silkTouch) {
				this.hardness = hardness;
				this.resistance = resistance;
				this.particleGravity = particleGravity;
				this.silkTouch = silkTouch;
			}

			int getHardness() {
				return hardness;
			}

			int getResistance() {
				return resistance;
			}

			int getParticleGravity() {
				return particleGravity;
			}

			boolean isSilkTouchEnabled() {
				return silkTouch;
			}

		}
	}

	protected final class SoundType {

		private final net.minecraft.block.Block.SoundType soundType;

		SoundType(net.minecraft.block.Block.SoundType soundType) {
			this.soundType = soundType;
		}

		public String getName() {
			return soundType.soundName;
		}

		public float getVolume() {
			return soundType.getVolume();
		}

		public float getFrequency() {
			return soundType.getFrequency();
		}

		public String getBreakSound() {
			return soundType.getBreakSound();
		}

		public String getStepSound() {
			return soundType.getStepSound();
		}

		public String getPlaceSound() {
			return soundType.getPlaceSound();
		}

	}

	//public final BlockState getCurrentState()
	//public final BlockState getDefaultState()
}
