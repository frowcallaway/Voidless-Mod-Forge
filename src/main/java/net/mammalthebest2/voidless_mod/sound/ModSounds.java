package net.mammalthebest2.voidless_mod.sound;

import net.mammalthebest2.voidless_mod.VoidlessModMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VoidlessModMain.MOD_ID);

    public static final RegistryObject<SoundEvent> AMONG_US_MUSIC = registerSoundEvent("amongus_music");
    public static final RegistryObject<SoundEvent> VOID_STAFF_DETECTED_VALUABLES_SOUND = registerSoundEvent("void_staff_detected_valuables_sound");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(VoidlessModMain.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
