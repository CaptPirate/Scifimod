package com.ubalube.scifiaddon.entities;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

@Mod.EventBusSubscriber(modid = "sfa")
public class ModEntities
{
    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityEntry> e)
    {
        int id = 0;
        int var6 = id + 1;
        e.getRegistry().register(EntityEntryBuilder.create().entity(EntityBullet.class).id(new ResourceLocation("sfa", "bullet"), var6++).name("bullet").tracker(60, 1, true).build());
    }
}
