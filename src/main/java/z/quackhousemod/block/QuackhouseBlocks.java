package z.quackhousemod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import z.quackhousemod.TheQuackhouseMod;
import z.quackhousemod.item.QuackhouseItems;

import java.util.function.Function;

public class QuackhouseBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TheQuackhouseMod.MOD_ID);

    public static final DeferredBlock<Block> MAGNESIUM_SULFATE_ORE = registerBlock("magnesium_sulfate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_MAGNESIUM_SULFATE_ORE = registerBlock("deepslate_magnesium_sulfate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> MAGNESIUM_SULFATE_BLOCK = registerBlock("magnesium_sulfate_block",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final DeferredBlock<Block> MAGNESIUM_SULFATE_BRICKS = registerBlock("magnesium_sulfate_bricks",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));


    // Aaaaaaaaaand here we register the blocks themselves
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // Registering the block items :3
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        QuackhouseItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
