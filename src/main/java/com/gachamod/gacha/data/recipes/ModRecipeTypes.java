package com.gachamod.gacha.data.recipes;

import com.gachamod.gacha.Gacha;
import com.gachamod.gacha.data.recipes.engineertable.EngineerTableRecipe;
import com.gachamod.gacha.data.recipes.engineertable.EngineerTableSerializer;
import com.gachamod.gacha.data.recipes.evolvetable.EvolveTableRecipe;
import com.gachamod.gacha.data.recipes.evolvetable.EvolveTableSerializer;
import com.gachamod.gacha.data.recipes.mtf.MTFRecipe;
import com.gachamod.gacha.data.recipes.mtf.MTFSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes implements IRecipeType {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Gacha.MOD_ID);

    public static final RegistryObject<EngineerTableSerializer> ENGINEER_SERIALIZER
            = RECIPE_SERIALIZER.register("engineer", EngineerTableSerializer::new);

    public static IRecipeType<EngineerTableRecipe> ENGINEER_RECIPE
            = new EngineerTableRecipe.EngineerRecipeType();

    public static final RegistryObject<EvolveTableSerializer> EVOLVE_SERIALIZER
            = RECIPE_SERIALIZER.register("evolve", EvolveTableSerializer::new);

    public static IRecipeType<EvolveTableRecipe> EVOLVE_RECIPE
            = new EvolveTableRecipe.EvolveRecipeType();

    public static final RegistryObject<MTFSerializer> MTF_SERIALIZER
            = RECIPE_SERIALIZER.register("mtf", MTFSerializer::new);

    public static IRecipeType<MTFRecipe> MTF_RECIPE
            = new MTFRecipe.MTFRecipeType();

    public static void register(IEventBus eventBus){
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, EngineerTableRecipe.TYPE_ID, ENGINEER_RECIPE);
        Registry.register(Registry.RECIPE_TYPE, EvolveTableRecipe.TYPE_ID, EVOLVE_RECIPE);
        Registry.register(Registry.RECIPE_TYPE, MTFRecipe.TYPE_ID, MTF_RECIPE);
    }
}
