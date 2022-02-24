package com.gachamod.gacha.item.items.terrestrial;

import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;

public class TerrestrialShovelItem extends ShovelItem {
    public TerrestrialShovelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if(this.getDamage(stack) > 998){
            return -5;
        }
        return super.getDestroySpeed(stack, state);
    }
}
