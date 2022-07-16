package net.mammalthebest2.voidless_mod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier EXTREME_VOID = new ForgeTier(3, 2500, 1.0f, 2f, 30, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.VOID_INGOT.get()));
}
