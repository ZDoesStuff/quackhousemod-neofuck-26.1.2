package z.quackhousemod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import z.quackhousemod.block.QuackhouseBlocks;
import z.quackhousemod.item.QuackhouseItems;

import java.util.Set;

public class QuackhouseBlockLootTableProvider extends BlockLootSubProvider {
    public QuackhouseBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK.get());
        dropSelf(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS.get());

        add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE.get(),
                createMultipleOreDrops(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE.get(), QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL.get(), 1, 4));
        add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE.get(),
                createMultipleOreDrops(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE.get(), QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL.get(), 2, 6));
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
            return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                    LootItem.lootTableItem(item)
                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                    .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return QuackhouseBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
