package com.gachamod.gacha.tileentity;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.block.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Gacha.MOD_ID);

    public static RegistryObject<TileEntityType<EngineerTableTile>> ENGINEER_TABLE_TILE =
            TILE_ENTITIES.register("cannon_table_tile", () -> TileEntityType.Builder.create(
                    EngineerTableTile::new, ModBlocks.ENGINEER_TABLE.get()).build(null));




    public static void register(IEventBus eventbus){
        TILE_ENTITIES.register(eventbus);
    }
}