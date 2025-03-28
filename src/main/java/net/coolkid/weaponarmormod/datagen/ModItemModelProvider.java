package net.coolkid.weaponarmormod.datagen;

import net.coolkid.weaponarmormod.WAM;
import net.coolkid.weaponarmormod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WAM.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AQUARIUM_INGOT.get());
        basicItem(ModItems.RAW_AQUARIUM.get());
        basicItem(ModItems.WARDEN_TENDRIL.get());
    }
}
