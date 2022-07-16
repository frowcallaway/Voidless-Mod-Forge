package net.mammalthebest2.voidless_mod;

import net.mammalthebest2.voidless_mod.block.ModBlocks;
import net.mammalthebest2.voidless_mod.item.ModItems;
import net.mammalthebest2.voidless_mod.sound.ModSounds;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VoidlessModMain.MOD_ID)
public class VoidlessModMain
{
    /**
     * Welcome to the brain of the mod.
     *
     * It includes all the parts.
     *
     * Enjoy as these "//" walk you through.
     *
     * Use the "//" to walk you through.
     */


    // This is the mod id of the mod called the "voidless_mod".
            // Continue on (Scroll down)
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "voidless_mod";


    public VoidlessModMain() {

        // This is where the items, blocks, sounds and more are registered
        // This is some nonsense that the game uses
        // Continue on
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Here they are
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModSounds.register(eventBus);



        MinecraftForge.EVENT_BUS.register(this);
    }

    // Have you seen the void door and trapdoor? These are needed so that you can see the block in the inventory well.
    // If these didn't exist then the block in the inventory look funny and we dont want that
    // Now go to project (<--) and go to voidless_mod > item > ModItems
    private void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_LEAVES.get(), RenderType.translucent());

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}

