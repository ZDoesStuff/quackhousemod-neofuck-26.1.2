package z.quackhousemod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import z.quackhousemod.creativemodetab.QuackhouseCreativeModeTabs;
import z.quackhousemod.item.QuackhouseItems;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TheQuackhouseMod.MOD_ID)
public class TheQuackhouseMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "quackhousemod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public TheQuackhouseMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        QuackhouseCreativeModeTabs.register(modEventBus);

        QuackhouseItems.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(QuackhouseItems.YELLOW_DUCKY);
            event.accept(QuackhouseItems.SUDSY_DUCKY);
            event.accept(QuackhouseItems.BLUE_DUCKY);
            event.accept(QuackhouseItems.BLUEBERRY_DUCKY);
            event.accept(QuackhouseItems.BROWN_DUCKY);
            event.accept(QuackhouseItems.PRIDE_DUCKY);
            event.accept(QuackhouseItems.GRAPEJUICE_DUCKY);
            event.accept(QuackhouseItems.ISOBEL_DUCKY);
            event.accept(QuackhouseItems.MOLTEN_DUCKY);
            event.accept(QuackhouseItems.POLKATDOT_DUCKY);
            event.accept(QuackhouseItems.STONE_DUCKY);
            event.accept(QuackhouseItems.STRAWBERRYSHORTCAKE_DUCKY);
            event.accept(QuackhouseItems.TRANS_DUCKY);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}