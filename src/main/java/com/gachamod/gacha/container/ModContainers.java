package com.gachamod.gacha.container;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.container.containers.*;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, Gacha.MOD_ID);

    public static final RegistryObject<ContainerType<EngineerTableContainer>> ENGINEER_TABLE_CONTAINER
            = CONTAINERS.register("engineer_table_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new EngineerTableContainer(windowId, world, pos, inv, inv.player, IWorldPosCallable.of(world,pos));
            })));

    public static final RegistryObject<ContainerType<UpgradeTableContainer>> UPGRADE_TABLE_CONTAINER
            = CONTAINERS.register("upgrade_table_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new UpgradeTableContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<GearTableContainer>> GEAR_TABLE_CONTAINER
            = CONTAINERS.register("gear_table_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new GearTableContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<JizoFurnaceContainer>> JIZO_FURNACE_CONTAINER
            = CONTAINERS.register("jizo_furnace_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new JizoFurnaceContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<NormalTicketCapsuleContainer>> NORMAL_TICKET_CAPSULE_CONTAINER
            = CONTAINERS.register("normal_ticket_capsule_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new NormalTicketCapsuleContainer(windowId, world, pos, inv, inv.player);
            })));

    public static final RegistryObject<ContainerType<EvolveTableContainer>> EVOLVE_TABLE_CONTAINER
            = CONTAINERS.register("evolve_table_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new EvolveTableContainer(windowId, world, pos, inv, inv.player, IWorldPosCallable.of(world, pos));
            })));

    public static final RegistryObject<ContainerType<MTFContainer>> MTF_CONTAINER
            = CONTAINERS.register("mtf_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new MTFContainer(windowId, world, pos, inv, inv.player, IWorldPosCallable.of(world, pos));
            })));





    public static void register(IEventBus eventBus){
        CONTAINERS.register(eventBus);
    }
}
