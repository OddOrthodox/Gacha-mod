package com.gachamod.gacha.item;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.api.cannonitem.CannonItem;
import com.gachamod.gacha.api.entity.ModEntityType;
import com.gachamod.gacha.api.ticketdrops.TicketDropLegend;
import com.gachamod.gacha.api.ticketdrops.TicketDropNormal;
import com.gachamod.gacha.api.ticketdrops.TicketDropPlat;
import com.gachamod.gacha.api.ticketdrops.TicketDropRare;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    // wacky items

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gacha.MOD_ID);

    public static final RegistryObject<TicketDropNormal> NORMAL_TICKET = ITEMS.register("normal_ticket",
        () -> new TicketDropNormal(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<TicketDropRare> RARE_TICKET = ITEMS.register("rare_ticket",
            () -> new TicketDropRare(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<TicketDropPlat> PLATINUM_TICKET = ITEMS.register("platinum_ticket",
            () -> new TicketDropPlat(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<TicketDropLegend> LEGEND_TICKET = ITEMS.register("legend_ticket",
            () -> new TicketDropLegend(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));



    //Normal Items

    public static final RegistryObject<Item> CANNON_BASE = ITEMS.register("cannon_base",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_SHAFT = ITEMS.register("cannon_shaft",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_CHARGE_MODULE = ITEMS.register("cannon_charge_module",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_COMPONENT = ITEMS.register("cannon_component",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_HANDHELD_MODULE = ITEMS.register("cannon_handheld_module",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_GOLD = ITEMS.register("jizo_gold",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> METEORITE_CHUNK = ITEMS.register("meteorite_chunk",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> SPROCKETS = ITEMS.register("sprockets",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> BEAST_BONES = ITEMS.register("beast_bones",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RELIC_FOSSIL = ITEMS.register("relic_fossil",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    //weapons

    public static final RegistryObject<CannonItem> CAT_CANNON = ITEMS.register("cat_cannon",
            () -> new CannonItem(new Item.Properties().group(ModItemGroup.GACHA_GROUP).defaultMaxDamage(100)));

    //cat fruit

    public static final RegistryObject<Item> BLUE_CATFRUIT = ITEMS.register("blue_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> PURPLE_CATFRUIT = ITEMS.register("purple_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RED_CATFRUIT = ITEMS.register("red_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> YELLOW_CATFRUIT = ITEMS.register("yellow_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> GREEN_CATFRUIT = ITEMS.register("green_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RAINBOW_CATFRUIT = ITEMS.register("rainbow_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RELIC_CATFRUIT = ITEMS.register("relic_catfruit",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.EPIC)));



    //spawn eggs

    public static final RegistryObject<Item> KASAJIZO_SPAWN = ITEMS.register("kasajizo_spawnegg",
            () -> new ModSpawnEggItem(ModEntityType.KASAJIZO, 0x000000, 0xFFFFFF,
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).defaultMaxDamage(1)));


    //projectile items
    
    public static final RegistryObject<Item> CAT_CANNON_PROJECTILE = ITEMS.register("cat_cannon_projectile",
            () -> new Item(new Item.Properties()));







    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
