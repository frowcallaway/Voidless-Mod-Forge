package net.mammalthebest2.voidless_mod.item;

import net.mammalthebest2.voidless_mod.VoidlessModMain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class VoidlessModCreativeTab {

    public static final CreativeModeTab VOIDLESS_MOD =  new CreativeModeTab("voidless_mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_INGOT.get());
        }
    };
}
