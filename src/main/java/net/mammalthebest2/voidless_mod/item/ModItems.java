package net.mammalthebest2.voidless_mod.item;

import net.mammalthebest2.voidless_mod.VoidlessModMain;
import net.mammalthebest2.voidless_mod.item.custom.VoidBurnerItem;
import net.mammalthebest2.voidless_mod.item.custom.VoidStaff;
import net.mammalthebest2.voidless_mod.item.custom.WitheringSwordItem;
import net.mammalthebest2.voidless_mod.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // DEFERRED REGISTER
    // 17 USAGES?!
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VoidlessModMain.MOD_ID);
    // 3 USAGES?!
    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD).fireResistant()));

    public static final RegistryObject<Item> VOID_FRAGMENT = ITEMS.register("void_fragment",
            () -> new Item(new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD).fireResistant()));

    public static final RegistryObject<Item> VOID_STAFF = ITEMS.register("void_staff",
            () -> new VoidStaff(new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD).stacksTo(1)));

    public static final RegistryObject<Item> VOID_STEAK = ITEMS.register("void_steak",
            () -> new Item(new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD).food(ModFoods.VOID_STEAK)));

    public static final RegistryObject<Item> VOID_BURNER = ITEMS.register("void_burner",
            () -> new VoidBurnerItem(new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_SWORD = ITEMS.register("void_sword",
            () -> new WitheringSwordItem(ModTiers.EXTREME_VOID, 8,4.0f, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_PICKAXE = ITEMS.register("void_pickaxe",
            () -> new PickaxeItem(ModTiers.EXTREME_VOID, 3,5f, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_AXE = ITEMS.register("void_axe",
            () -> new AxeItem(ModTiers.EXTREME_VOID, 2,4f, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_HOE = ITEMS.register("void_hoe",
            () -> new HoeItem(ModTiers.EXTREME_VOID, 0,0f, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_SHOVEL = ITEMS.register("void_shovel",
            () -> new ShovelItem(ModTiers.EXTREME_VOID, 0,0f, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_HELMET = ITEMS.register("void_helmet",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.HEAD, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_CHESTPLATE= ITEMS.register("void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.CHEST, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_LEGGING= ITEMS.register("void_leggings",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.LEGS, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_BOOTS= ITEMS.register("void_boots",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.FEET, new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD)));

    public static final RegistryObject<Item> VOID_MUSIC_DISC = ITEMS.register("void_music_disc",
            () -> new RecordItem(6, ModSounds.AMONG_US_MUSIC,
                    new Item.Properties().tab(VoidlessModCreativeTab.VOIDLESS_MOD).stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
