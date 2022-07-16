package net.mammalthebest2.voidless_mod.world;

import net.mammalthebest2.voidless_mod.VoidlessModMain;
import net.mammalthebest2.voidless_mod.world.gen.ModOreGeneration;
import net.mammalthebest2.voidless_mod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VoidlessModMain.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }
}
