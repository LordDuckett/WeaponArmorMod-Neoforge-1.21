package net.coolkid.weaponarmormod.util;


import net.coolkid.weaponarmormod.WAM;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> TIER_1_WOODS = createTag("tier_1_woods");
        public static final TagKey<Item> TIER_3_WOODS = createTag("tier_3_woods");
        public static final TagKey<Item> TIER_1_STONES = createTag("tier_1_stones");
        public static final TagKey<Item> TIER_3_STONES = createTag("tier_3_stones");
        public static final TagKey<Item> TIER_4_STONES = createTag("tier_4_stones");
        public static final TagKey<Item> TIER_2_METALS = createTag("tier_2_metals");
        public static final TagKey<Item> TIER_3_METALS = createTag("tier_3_metals");
        public static final TagKey<Item> TIER_2_GEMS = createTag("tier_2_gems");
        public static final TagKey<Item> TIER_3_GEMS = createTag("tier_3_gems");
        public static final TagKey<Item> TIER_4_GEMS = createTag("tier_4_gems");
        public static final TagKey<Item> TIER_5_GEMS = createTag("tier_5_gems");
        public static final TagKey<Item> TIER_1_WRAPPING = createTag("tier_1_wrapping");
        public static final TagKey<Item> TIER_3_WRAPPING = createTag("tier_3_wrapping");
        public static final TagKey<Item> TIER_5_WRAPPING = createTag("tier_5_wrapping");
        public static final TagKey<Item> TIER_1_HANDLES = createTag("tier_1_handles");
        public static final TagKey<Item> TIER_2_HANDLES = createTag("tier_2_handles");
        public static final TagKey<Item> TIER_3_HANDLES = createTag("tier_3_handles");
        public static final TagKey<Item> TIER_4_HANDLES = createTag("tier_4_handles");
        public static final TagKey<Item> TIER_1_SKIN = createTag("tier_1_skin");
        public static final TagKey<Item> TIER_2_SKIN = createTag("tier_2_skin");
        public static final TagKey<Item> TIER_3_SKIN = createTag("tier_3_skin");
        public static final TagKey<Item> TIER_4_SKIN = createTag("tier_4_skin");
        public static final TagKey<Item> TIER_5_SKIN = createTag("tier_5_skin");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(WAM.MOD_ID, name));
        }
    }
}