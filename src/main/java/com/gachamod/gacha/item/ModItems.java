package com.gachamod.gacha.item;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.item.armor.ModArmorMaterial;
import com.gachamod.gacha.item.armor.meteortech.MTBoots;
import com.gachamod.gacha.item.armor.meteortech.MTChestplate;
import com.gachamod.gacha.item.armor.meteortech.MTHelmet;
import com.gachamod.gacha.item.armor.meteortech.MTLeggings;
import com.gachamod.gacha.item.items.BananaSwordItem;
import com.gachamod.gacha.item.items.CannonItem;
import com.gachamod.gacha.item.items.IceSwordItem;
import com.gachamod.gacha.item.curio.JizosHatItem;
import com.gachamod.gacha.item.curio.JizosScarfItem;
import com.gachamod.gacha.entity.ModEntityType;
import com.gachamod.gacha.item.items.misc.HandHeldTimeMachineItem;
import com.gachamod.gacha.item.items.alien.*;
import com.gachamod.gacha.item.items.terrestrial.*;
import com.gachamod.gacha.item.ticketitems.TicketDropLegend;
import com.gachamod.gacha.item.ticketitems.TicketDropNormal;
import com.gachamod.gacha.item.ticketitems.TicketDropPlat;
import com.gachamod.gacha.item.ticketitems.TicketDropRare;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gacha.MOD_ID);


    // curios items

    public static final RegistryObject<Item> JIZOS_STRAW_HAT = ITEMS.register("jizos_straw_hat",
            () -> new JizosHatItem(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> JIZOS_SCARF = ITEMS.register("jizos_scarf",
            () -> new JizosScarfItem(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));

    // Tickets items

    public static final RegistryObject<TicketDropNormal> NORMAL_TICKET = ITEMS.register("normal_ticket",
        () -> new TicketDropNormal(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<TicketDropRare> RARE_TICKET = ITEMS.register("rare_ticket",
            () -> new TicketDropRare(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<TicketDropPlat> PLATINUM_TICKET = ITEMS.register("platinum_ticket",
            () -> new TicketDropPlat(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));

    public static final RegistryObject<TicketDropLegend> LEGEND_TICKET = ITEMS.register("legend_ticket",
            () -> new TicketDropLegend(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.EPIC)));



    //Normal Items

    public static final RegistryObject<Item> HANDHELD_TIME_MACHINE = ITEMS.register("handheld_time_machine",
            () -> new HandHeldTimeMachineItem(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

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

    public static final RegistryObject<Item> METEORITE_CHUNK = ITEMS.register("meteorite_chunk",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> SPROCKETS = ITEMS.register("sprockets",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> BEAST_BONES = ITEMS.register("beast_bones",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RELIC_FOSSIL = ITEMS.register("relic_fossil",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_STEEL_INGOT = ITEMS.register("jizo_steel_ingot",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ICE_SWORD_BLADE = ITEMS.register("ice_sword_blade",
            () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ICE_SWORD_HANDLE = ITEMS.register("ice_sword_handle",
            () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ICE_SWORD_CORE = ITEMS.register("ice_sword_core",
            () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_CORE = ITEMS.register("terrestrial_core",
            () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.GACHA_GROUP)));

    //Blueprints

    public static final RegistryObject<Item> BLUEPRINT = ITEMS.register("blueprint",
            () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.GACHA_GROUP)));


    //weapons

    public static final RegistryObject<CannonItem> CAT_CANNON = ITEMS.register("cat_cannon",
            () -> new CannonItem(new Item.Properties().group(ModItemGroup.GACHA_GROUP).maxStackSize(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ICE_SWORD = ITEMS.register("ice_sword",
            () -> new IceSwordItem(ModItemTier.SPECIAL, 0, -2.4F,new Item.Properties().group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> BANANA_SWORD = ITEMS.register("banana_sword",
            () -> new BananaSwordItem(ModItemTier.SPECIAL, -1, -2.4F,new Item.Properties().group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));


    //evolve orbs

    public static final RegistryObject<Item> BLUE_EVOLVE_ORB = ITEMS.register("blue_evolve_orb", //change to evolve orbs
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> PURPLE_EVOLVE_ORB = ITEMS.register("purple_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RED_EVOLVE_ORB = ITEMS.register("red_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> YELLOW_EVOLVE_ORB = ITEMS.register("yellow_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> GREEN_EVOLVE_ORB = ITEMS.register("green_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> RAINBOW_EVOLVE_ORB = ITEMS.register("rainbow_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RELIC_EVOLVE_ORB = ITEMS.register("relic_evolve_orb",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> STRANGE_COMPUTER_CHIP = ITEMS.register("strange_computer_chip",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STRANGE_COMPUTER_CHIPBOARD = ITEMS.register("strange_computer_chipboard",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STRANGE_COMPUTER_DRIVE = ITEMS.register("strange_computer_drive",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STRANGE_ANTENNAE = ITEMS.register("strange_antennae",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP).rarity(Rarity.UNCOMMON)));


    //upgrades and augments
    public static final RegistryObject<Item> CANNON_UPGRADE_BASE_T1 = ITEMS.register("cannon_upgrade_base_t1",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_DAMAGE_UPGRADE_T1 = ITEMS.register("cannon_damage_upgrade_t1",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_SPEED_UPGRADE_T1 = ITEMS.register("cannon_speed_upgrade_t1",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> CANNON_RADIUS_UPGRADE_T1 = ITEMS.register("cannon_radius_upgrade_t1",
            () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.GACHA_GROUP)));

    //tools
    public static final RegistryObject<Item> JIZO_STEEL_PICKAXE = ITEMS.register("jizo_steel_pickaxe",
            () -> new PickaxeItem(ModItemTier.JIZO_STEEL, -2, -2.8f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_STEEL_AXE = ITEMS.register("jizo_steel_axe",
            () -> new AxeItem(ModItemTier.JIZO_STEEL, 2, -3f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_STEEL_SHOVEL = ITEMS.register("jizo_steel_shovel",
            () -> new ShovelItem(ModItemTier.JIZO_STEEL, -3, -1f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_STEEL_HOE = ITEMS.register("jizo_steel_hoe",
            () -> new HoeItem(ModItemTier.JIZO_STEEL, -4, 0f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> JIZO_STEEL_SWORD = ITEMS.register("jizo_steel_sword",
            () -> new SwordItem(ModItemTier.JIZO_STEEL, 0, -2.4f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_PICKAXE = ITEMS.register("terrestrial_pickaxe",
            () -> new TerrestrialPickaxeItem(ModItemTier.NORMAL, -2, -2.8f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_AXE = ITEMS.register("terrestrial_axe",
            () -> new TerrestrialAxeItem(ModItemTier.NORMAL, 2, -3f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_SWORD = ITEMS.register("terrestrial_sword",
            () -> new TerrestrialSwordItem(ModItemTier.NORMAL, 0, -2.4f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_SHOVEL = ITEMS.register("terrestrial_shovel",
            () -> new TerrestrialShovelItem(ModItemTier.NORMAL, -3, -1f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> TERRESTRIAL_HOE = ITEMS.register("terrestrial_hoe",
            () -> new TerrestrialHoeItem(ModItemTier.NORMAL, -4, -0f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_HOE = ITEMS.register("alien_hoe",
            () -> new AlienHoeItem(ModItemTier.ALIEN, -4, -0f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_AXE = ITEMS.register("alien_axe",
            () -> new AlienAxeItem(ModItemTier.ALIEN, 2, -3f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_PICKAXE = ITEMS.register("alien_pickaxe",
            () -> new AlienPickaxeItem(ModItemTier.ALIEN, -2, -2.8f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_SHOVEL = ITEMS.register("alien_shovel",
            () -> new AlienShovelItem(ModItemTier.ALIEN, -3, -1f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_SWORD = ITEMS.register("alien_sword",
            () -> new AlienSwordItem(ModItemTier.ALIEN, 0, -2.4f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_HAMMER = ITEMS.register("alien_hammer",
            () -> new AlienHammerItem(ModItemTier.ALIENHAMMER, 3, -3.6f,new Item.Properties().group(ModItemGroup.GACHA_GROUP)));




    //tiered stuff

    public static final RegistryObject<Item> TERRESTRIAL_INGOT = ITEMS.register("terrestrial_ingot",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> ALIEN_INGOT = ITEMS.register("alien_ingot",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> METEOR_TECH_INGOT = ITEMS.register("meteor_tech_ingot",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.GACHA_GROUP).isImmuneToFire().rarity(Rarity.EPIC)));

    //armor
    public static final RegistryObject<Item> METEORTECH_BOOTS = ITEMS.register("meteortech_boots",
            () -> new MTBoots(ModArmorMaterial.METEORTECH, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> METEORTECH_CHESTPLATE = ITEMS.register("meteortech_chestplate",
            () -> new MTChestplate(ModArmorMaterial.METEORTECH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> METEORTECH_LEGGINGS = ITEMS.register("meteortech_leggings",
            () -> new MTLeggings(ModArmorMaterial.METEORTECH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.GACHA_GROUP)));

    public static final RegistryObject<Item> METEORTECH_HEADGEAR = ITEMS.register("meteortech_headgear",
            () -> new MTHelmet(ModArmorMaterial.METEORTECH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.GACHA_GROUP)));






    //spawn eggs

    public static final RegistryObject<Item> KASAJIZO_SPAWN = ITEMS.register("kasajizo_spawnegg",
            () -> new ModSpawnEggItem(ModEntityType.KASAJIZO, 0x000000, 0xFFFFFF,
                    new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).defaultMaxDamage(1)));


    public static final RegistryObject<Item> GOON_SPAWN = ITEMS.register("goon_spawnegg",
            () -> new ModSpawnEggItem(ModEntityType.GOONENTITY, 0x0000FF, 0xFFFAFF,
                    new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).defaultMaxDamage(1)));


    //projectile items
    
    public static final RegistryObject<Item> CAT_CANNON_PROJECTILE = ITEMS.register("cat_cannon_projectile",
            () -> new Item(new Item.Properties()));







    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
