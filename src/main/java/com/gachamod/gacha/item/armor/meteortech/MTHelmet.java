package com.gachamod.gacha.item.armor.meteortech;

import com.gachamod.gacha.item.ModItems;
import com.gachamod.gacha.item.armor.ModArmorMaterial;
import com.google.common.collect.ImmutableMap;
import com.ibm.icu.impl.TextTrieMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

import java.util.Map;

public class MTHelmet extends ArmorItem {
    public MTHelmet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }



    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
            player.setAir(300);

    }


}
