package net.triplegerms.unitygear.ability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Invis {

	public void start(EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(14),10 * 20, 81));
	}

	public void end(EntityPlayer player) {
		player.removePotionEffect(Potion.getPotionById(14));
	}
	
	

}
