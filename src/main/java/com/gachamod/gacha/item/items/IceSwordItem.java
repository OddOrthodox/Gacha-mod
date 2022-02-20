package com.gachamod.gacha.item.items;

import com.gachamod.gacha.item.ModItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvents;

public class IceSwordItem extends SwordItem {


    public IceSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean isDamageable() {
        return false;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        PlayerEntity player = (PlayerEntity) attacker;

        target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 40, 1, false, false));
        player.playSound(SoundEvents.ENTITY_CAT_AMBIENT, 1.0F,1.0F);
        return true;
    }
}
