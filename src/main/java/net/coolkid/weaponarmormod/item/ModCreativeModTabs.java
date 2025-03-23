package net.coolkid.weaponarmormod.item;

import net.coolkid.weaponarmormod.WAM;
import net.coolkid.weaponarmormod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WAM.MOD_ID);

    public static final Supplier<CreativeModeTab> AQUARIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("wam_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AQUARIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.weaponarmormod.wam"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AQUARIUM_INGOT);
                        output.accept(ModItems.RAW_AQUARIUM);
                        output.accept(ModBlocks.AQUARIUM_BLOCK);
                        output.accept(ModBlocks.AQUARIUM_ORE);
                        output.accept(ModBlocks.AQUARIUM_DEEPSLATE_ORE);
                        output.accept(ModItems.WARDEN_TENDRIL);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
