package z.quackhousemod.creativemodetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import z.quackhousemod.TheQuackhouseMod;
import z.quackhousemod.item.QuackhouseItems;

import java.util.function.Supplier;

public class QuackhouseCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheQuackhouseMod.MOD_ID);

    public static final Supplier<CreativeModeTab> COLLECTIBLE_DUCKY_TAB = CREATIVE_MODE_TABS.register("collectathon_ducky_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(QuackhouseItems.YELLOW_DUCKY.get()))
                    .title(Component.translatable("creativemodetab.quackhousemod.collectable_ducky"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(QuackhouseItems.YELLOW_DUCKY);
                        output.accept(QuackhouseItems.BROWN_DUCKY);
                        output.accept(QuackhouseItems.BLUE_DUCKY);
                        output.accept(QuackhouseItems.STONE_DUCKY);
                        output.accept(QuackhouseItems.POLKADOT_DUCKY);
                        output.accept(QuackhouseItems.PRIDE_DUCKY);
                        output.accept(QuackhouseItems.TRANS_DUCKY);
                        output.accept(QuackhouseItems.BLUEBERRY_DUCKY);
                        output.accept(QuackhouseItems.GRAPEJUICE_DUCKY);
                        output.accept(QuackhouseItems.STRAWBERRYSHORTCAKE_DUCKY);
                        output.accept(QuackhouseItems.MOLTEN_DUCKY);
                        output.accept(QuackhouseItems.SUDSY_DUCKY);
                        output.accept(QuackhouseItems.ISOBEL_DUCKY);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
