package z.quackhousemod.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import z.quackhousemod.TheQuackhouseMod;
import z.quackhousemod.block.QuackhouseBlocks;
import z.quackhousemod.item.QuackhouseItems;

public class QuackhouseModelProvider extends ModelProvider {

    public QuackhouseModelProvider(PackOutput output) {
        super(output, TheQuackhouseMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(QuackhouseItems.YELLOW_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.SUDSY_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.BLUE_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.BLUEBERRY_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.BROWN_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.PRIDE_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.GRAPEJUICE_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.ISOBEL_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.MOLTEN_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.POLKADOT_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.STONE_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.STRAWBERRYSHORTCAKE_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.TRANS_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.RED_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.GOOGLY_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.FANCY_DUCKY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(QuackhouseItems.EPSOM_SALT.get(), ModelTemplates.FLAT_ITEM);

        // Blockssssss
        blockModels.createTrivialCube(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE.get());
        blockModels.createTrivialCube(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE.get());
        blockModels.createTrivialCube(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK.get());
        blockModels.createTrivialCube(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS.get());
        blockModels.createTrivialCube(QuackhouseBlocks.SUSPICIOUS_STONE.get());
    }
}
