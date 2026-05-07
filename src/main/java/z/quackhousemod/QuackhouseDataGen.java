package z.quackhousemod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import z.quackhousemod.datagen.QuackhouseModelProvider;

@EventBusSubscriber(modid = TheQuackhouseMod.MOD_ID)
public class QuackhouseDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, new QuackhouseModelProvider(packOutput));
    }
}
