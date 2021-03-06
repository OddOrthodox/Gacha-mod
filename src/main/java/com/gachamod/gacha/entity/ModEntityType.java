package com.gachamod.gacha.entity;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.entity.projectile.CannonFireEntity;
import com.gachamod.gacha.entity.mobs.GoonEntitiy;
import com.gachamod.gacha.entity.mobs.KasaJizo;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Gacha.MOD_ID);

    public static final RegistryObject<EntityType<CannonFireEntity>> CANNON_PROJECTILE = ENTITIES.register("cannon_projectile",
            () -> EntityType.Builder.<CannonFireEntity>create(CannonFireEntity::new, EntityClassification.MISC).size(0.10F, 0.10F)
                    .updateInterval(40)
                    .trackingRange(10)
                    .build(new ResourceLocation(Gacha.MOD_ID, "cannon_projectile").toString()));

    public static final RegistryObject<EntityType<KasaJizo>> KASAJIZO = ENTITIES.register("kasa_jizo",
            () -> EntityType.Builder.create(KasaJizo::new, EntityClassification.MONSTER).size(1.0F,1.5F)
                    .build(new ResourceLocation(Gacha.MOD_ID, "kasa_jizo").toString()));


    public static final RegistryObject<EntityType<GoonEntitiy>> GOONENTITY = ENTITIES.register("goon",
            () -> EntityType.Builder.create(GoonEntitiy::new, EntityClassification.MONSTER).size(1.0F,1.5F)
                    .build(new ResourceLocation(Gacha.MOD_ID, "goon").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }


}
