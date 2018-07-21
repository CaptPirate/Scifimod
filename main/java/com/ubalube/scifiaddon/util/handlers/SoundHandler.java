package com.ubalube.scifiaddon.util.handlers;

import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {

public static SoundEvent GUN_FIRE_PLASMA;
	
	public static void registerSounds() {
		
		
		GUN_FIRE_PLASMA = registerSound("gun.shoot.plasma");
		
		
	}
	
	public static SoundEvent registerSound(String name) {
		
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
