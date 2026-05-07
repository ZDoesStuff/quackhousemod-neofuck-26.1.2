package z.quackhousemod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import z.quackhousemod.TheQuackhouseMod;

public class QuackhouseItems {

    // This is the registry method.
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheQuackhouseMod.MOD_ID);

    public static final DeferredItem<Item> YELLOW_DUCKY = ITEMS.registerSimpleItem("yellow_rubber_ducky");
    public static final DeferredItem<Item> BROWN_DUCKY = ITEMS.registerSimpleItem("brown_rubber_ducky");
    public static final DeferredItem<Item> SUDSY_DUCKY = ITEMS.registerSimpleItem("bathed_rubber_ducky");
    public static final DeferredItem<Item> BLUE_DUCKY = ITEMS.registerSimpleItem("blue_rubber_ducky");
    public static final DeferredItem<Item> BLUEBERRY_DUCKY = ITEMS.registerSimpleItem("blueberry_rubber_ducky");
    public static final DeferredItem<Item> PRIDE_DUCKY = ITEMS.registerSimpleItem("gay_rubber_ducky");
    public static final DeferredItem<Item> GRAPEJUICE_DUCKY = ITEMS.registerSimpleItem("grape_juice_rubber_ducky");
    public static final DeferredItem<Item> ISOBEL_DUCKY = ITEMS.registerSimpleItem("isobel_rubber_ducky");
    public static final DeferredItem<Item> MOLTEN_DUCKY = ITEMS.registerSimpleItem("molten_rubber_ducky");
    public static final DeferredItem<Item> POLKATDOT_DUCKY = ITEMS.registerSimpleItem("polkadot_rubber_ducky");
    public static final DeferredItem<Item> STONE_DUCKY = ITEMS.registerSimpleItem("stone_rubber_ducky");
    public static final DeferredItem<Item> STRAWBERRYSHORTCAKE_DUCKY = ITEMS.registerSimpleItem("strawberry_shortcake_rubber_ducky");
    public static final DeferredItem<Item> TRANS_DUCKY = ITEMS.registerSimpleItem("trans_rubber_ducky");

    // This is the registry method for the registry method. Simple, yet I find it redundant.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
