package net.mammalthebest2.voidless_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeature {
    public static final Holder<PlacedFeature> VOID_TREE_PLACED = PlacementUtils.register("void_tree_placed",
            ModConfiguredFeatures.VOID_TREE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.5f, 2)));


    public static final Holder<PlacedFeature> VOID_ORE_PLACED = PlacementUtils.register("void_ore_placed",
            ModConfiguredFeatures.VOID_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
