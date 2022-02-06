package com.gachamod.gacha.block;

import com.gachamod.gacha.Gacha;

import com.gachamod.gacha.api.blocks.EngineerTableBlock;
import com.gachamod.gacha.item.ModItemGroup;
import com.gachamod.gacha.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Gacha.MOD_ID);

    //Normal Blocks

    public static final RegistryObject<Block> JIZO_GOLD_BLOCK = registerBlock("jizo_gold_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> JIZO_STEEL_BLOCK = registerBlock("jizo_steel_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f).sound(SoundType.METAL)));

    public static final RegistryObject<Block> JIZO_GOLD_ORE = registerBlock("jizo_gold_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ENGINEER_TABLE = registerBlock("engineer_table",
            () -> new EngineerTableBlock(AbstractBlock.Properties.create(Material.WOOD).harvestLevel(0).harvestTool(ToolType.AXE).hardnessAndResistance(1f).sound(SoundType.WOOD)));




    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.GACHA_GROUP)));
    }

    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }
}
