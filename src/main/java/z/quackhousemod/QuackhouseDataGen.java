package z.quackhousemod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import z.quackhousemod.datagen.QuackhouseBlockLootTableProvider;
import z.quackhousemod.datagen.QuackhouseBlocksTagsProvider;
import z.quackhousemod.datagen.QuackhouseModelProvider;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = TheQuackhouseMod.MOD_ID)
public class QuackhouseDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new QuackhouseModelProvider(packOutput));
        generator.addProvider(true, new QuackhouseBlocksTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(QuackhouseBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
    }
}
