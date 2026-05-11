package z.quackhousemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import z.quackhousemod.TheQuackhouseMod;
import z.quackhousemod.block.QuackhouseBlocks;

import java.util.concurrent.CompletableFuture;

public class QuackhouseBlocksTagsProvider extends BlockTagsProvider {

    public QuackhouseBlocksTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, TheQuackhouseMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE.get())
                .add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE.get())
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK.get())
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE.get())
                .add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE.get());
    }
}
