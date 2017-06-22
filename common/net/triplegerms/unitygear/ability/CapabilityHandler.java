package net.triplegerms.unitygear.ability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.triplegerms.unitygear.UnityGear;

public class CapabilityHandler {
	
	public static final ResourceLocation COOLDOWN = new ResourceLocation(UnityGear.MODID, "ability");
	
	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent.Entity event){
		
		if(!(event.getEntity() instanceof EntityPlayer)) return;
		
		event.addCapability(COOLDOWN, new AbilityProvider());
		
	}

}
