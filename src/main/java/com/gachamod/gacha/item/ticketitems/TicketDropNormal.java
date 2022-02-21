package com.gachamod.gacha.item.ticketitems;

import com.gachamod.gacha.api.TicketLoot;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


public class TicketDropNormal extends Item {


    public TicketDropNormal(Properties properties) {
        super(properties);
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("tooltip.gacha.ticket_tooltip"));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.giveExperiencePoints(10);
        TicketLoot loot = new TicketLoot();
        Random rand = new Random();
        int randAmtDrop = rand.nextInt(4)+2;
        playerIn.inventory.removeStackFromSlot(playerIn.inventory.currentItem);
        for(int i =0; i != randAmtDrop; i++){
            boolean itemRestricted = false;
            int randId = rand.nextInt(loot.getNormalTicketLoot().size());
            int randStk = rand.nextInt(4);
            for(int x =0 ; x !=loot.getRestrictedItems().size(); x++){
                if(loot.getNormalTicketLoot().get(randId) == loot.getRestrictedItems().get(x)){
                    itemRestricted = true;
                }
            }
            if(!itemRestricted){
                for(int i1 = 0; i1 != randStk; i1++){
                    playerIn.inventory.placeItemBackInInventory(worldIn, new ItemStack(loot.getNormalTicketLoot().get(randId)));
                }

            }
            else playerIn.inventory.placeItemBackInInventory(worldIn, new ItemStack(loot.getNormalTicketLoot().get(randId)));


        }

        return super.onItemRightClick(worldIn, playerIn, handIn);

    }
}