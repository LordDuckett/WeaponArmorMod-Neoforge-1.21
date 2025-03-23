package net.coolkid.weaponarmormod.item;

import net.coolkid.weaponarmormod.WAM;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WAM.MOD_ID);

    public static final DeferredItem<Item> AQUARIUM_INGOT = ITEMS.register("aquarium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_AQUARIUM = ITEMS.register("raw_aquarium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARDEN_TENDRIL = ITEMS.register("warden_tendril",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) { ITEMS.register(modEventBus);}
}
